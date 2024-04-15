/*
thread =	A thread of execution in a program (kind of like a virtual CPU)
    				The JVM allows an application to have multiple threads running concurrently
    				Each thread can execute parts of you code in parallel with the main thread
    				Each thread has a priority.
    				Threads with higher priority are executed in preference compared to threads with a lower priority
    			
    			    The Java Virtual Machine continues to execute threads until either of the following occurs
    					1. The exit method of class Runtime has been called
    					2. All user threads have died
    					
    				When a JVM starts up, there is a thread which calls the main method
    				This thread is called “main”
    						
    				Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection 
				JVM terminates itself when all user threads (non-daemon threads) finish their execution
*/ 	


import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;
import java.lang.*;

//one of the creation of threads can be by using the extension of thread class
public class Threads extends Thread {
    //public static void main(String[] args) throws InterruptedException {
    // //checking the number of active threads in a code
    // System.out.println(Thread.activeCount());
    // //checking the name of the currently exectuing thread
    // //changing the name of the currently executing thread
    // Thread.currentThread().setName("Tanu");
    // System.out.println(Thread.currentThread().getName());
    // //checking the priority of the current thread
    // //changing the priority of the currently executing thread
    // //priority can only be between 1-10
    // Thread.currentThread().setPriority(10);
    // System.out.println(Thread.currentThread().getPriority());
    // //checking if the present thread is alive or not
    // System.out.println(Thread.currentThread().isAlive());
    // //putting the thread to sleep
    // for(int i = 3; i>0; i--){
    //     System.out.println(i);
    //     //puts a time lapse/interval in the executioon of the code 
    //     Thread.sleep(1000);
    // }
    // System.out.println("You are done.");
    
    //overriding the pre-existing thread class
    public void run(){
        //depends upon the extended thread object (obj)
        if(this.isDaemon()){
            System.out.println("This is a daemon thread that is running.");
        }
        else{
            System.out.println("This is a user thread.");
        }
    }
}