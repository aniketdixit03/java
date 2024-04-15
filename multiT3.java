//the class can also extend a class alongwith implementing the Runnable interface
//this helps with the issue of Java not allowing multiple parent classes for a Child
public class multiT3 implements Runnable{
    @Override
    //all the functions of the runnable interface must be overriden here
public void run(){
    for(int i = 0; i<10; i++){
        System.out.println(i);
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        } 
    }
    System.out.println("Thread-2 is finished.");
}
    
}
