package com.learning;

public class methodExecution {

	public class methodExecution {

		publicintmultipynumbers(inta,intb) {
			intz=a*b;
			return z;
		}

		publicstaticvoidmain(String[] args) {

			methodExecutionb=newmethodExecution();
			intans= b.multipynumbers(10,3);
			System.out.println("Multipilcationis :"+ans);
			}


		//call by value
		public class call Method {

		intval=150;

		intoperation(intval) {
			val =val*10/100;
			return(val);
		}

		publicstaticvoidmain(String args[]) {
			callMethodd = newcallMethod();
			System.out.println("Before operation value of data is "+d.val);
			d.operation(100);
			System.out.println("After operation value of data is "+d.val);
			}
		}



		//method overloading
		public class overloadMethod {
			
		publicvoidarea(intb,inth)
		    {
		System.out.println("Area of Triangle : "+(0.5*b*h));
		    }
		publicvoidarea(intr) 
		    {
		System.out.println("Area of Circle : "+(3.14*r*r));
		    }

		publicstaticvoidmain(String args[])
		   {

		overloadMethodob=newoverloadMethod();
		ob.area(10,12);
		ob.area(5);  
		   }
		}

