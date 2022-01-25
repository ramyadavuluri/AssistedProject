package com.learning;

public class MyThread {
    public static int myCount = 0;
    public MyThread(){

    }
    public void run() {
while(MyThread.myCount<= 10){
try{
System.out.println("Expl Thread: "+(++MyThread.myCount));
Thread.sleep(100);
            } catch (InterruptedExceptioniex) {
System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
System.out.println("Starting Main Thread...");
MyThreadmrt = new MyThread();
        Thread t = new Thread(mrt);
t.start();
while(MyThread.myCount<= 10){
try{
System.out.println("Main Thread: "+(++MyThread.myCount));
Thread.sleep(100);
            } catch (InterruptedExceptioniex){
Object iex;
System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
System.out.println("End of Main Thread...");
    }
}
