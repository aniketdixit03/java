import java.lang.*;
public class Threads2 {
    public static void main(String[] args) throws InterruptedException {
        Threads obj = new Threads();
        // //checking if the new thread is alive or not
        // System.out.println(obj.isAlive());
        // //the answer would be false as obj.start() is required to start a new thread
        // obj.start();
        // System.out.println(obj.isAlive());
        // //above also makes sure that the run function is executed
        // //the names are pre-assigned and can be changed like discussed earlier
        // System.out.println(obj.getName());
        // //note that the priority of this thread would be of the parent thread
        // //but, it can be changed as well
        // System.out.println(obj.getPriority());
        //System.out.println(Thread.activeCount());
        /*there are two kinds of threads in existence:
        User Threads and Daemon (low priority that run in bg)
        JVM terminates itself when user threads finish their execution*/
        //checking if a thread is Daemon and then setting it to be Daemon 
        //System.out.println(obj.isDaemon());
        obj.setDaemon(true);
        System.out.println(obj.isDaemon());
        obj.start();
    }   
}
