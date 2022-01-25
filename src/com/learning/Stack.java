package com.learning;

public class Stack {
 
		static final int MAX = 1000; 
		int top; 
		int a[] = new int[MAX];  
		boolean booleanisEmpty() 
		{ 
			return (top < 0); 
		} 
		Stack() 
		{ 
			top = -1; 
		} 
		boolean booleanpush(int x) 
		{ 
			if (top >= (MAX-1)) 
			{ 
				System.out.println("Stack Overflow"); 
				return false; 
			} 
			else
			{ 
				a[++top] = x; 
				System.out.println(x + " pushed into stack"); 
				return true; 
			} 
		} 
	int pop() 
		{ 
			if (top < 0) 
			{ 
				System.out.println("Stack Underflow"); 
				return 0; 
			} 
			else
			{ 
				int x = a[top--]; 
				return x; 
			} 
		} 

		public static void main(String args[])
	{
			Stack s = new Stack(); 
			s.push(10); 
			s.push(20); 
			s.push(30); 
			System.out.println(s.pop() + " Popped from stack"); 
		}
		private void push(int i) {
			// TODO Auto-generated method stub
			
		}
	} 	
