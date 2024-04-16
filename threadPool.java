import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadPool {
    public static void main(String[] args) {
        //creating a thread pool with 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5); 
        
        //submitting tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            Runnable task = new threadP("Worker: "+i);
            executor.execute(task);
        }
        
        //shutting down the executor
        executor.shutdown();
        while(!executor.isTerminated()){}
        System.out.println("All done.");
    }
} 
    // static class Task implements Runnable {
    //     private final int taskId;
        
    //     public Task(int id) {
    //         this.taskId = id;
    //     }
        
    //     @Override
    //     public void run() {
    //         System.out.println("Task " + taskId + " is executing.");
    //         // Task logic goes here
    //     }
    //}
