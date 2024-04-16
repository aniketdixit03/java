import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadPoolDynamic {
    public static void main(String[] args) {
        // Create a cached thread pool
        //ExecutorService executor = Executors.newCachedThreadPool();
        //to execute using a single thread only use the following:
        ExecutorService executor = Executors.newSingleThreadExecutor();
        
        // Submit tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            Runnable task = new threadP("worker: "+i);
            executor.execute(task);
        }
        
        // Shutdown the executor
        executor.shutdown();
        System.out.println("All done.");
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
    // }
}

