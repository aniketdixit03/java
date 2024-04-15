public class multiT {
/*note that one of the main benefits of multi threading is the fact that
even if there is an exception in one of the threads, it doesn't affect the
performance of any of the other threads*/


     public static void main(String[] args) throws InterruptedException {
        //one thread is created by using the concept of extending the classes
        multiT2 obj2 = new multiT2();
        //the other thread is executed by creating an instance of the class implementing the runnable interface
        multiT3 obj3 = new multiT3(); 
        //now the obj3 has to be sent as an argument in the constructor
        Thread thread2 = new Thread(obj3);
        // obj2.start();
        // thread2.start();
        // //join() helps in the fact that the calling thread only executes
        // //when a certain specified thread dies
        obj2.start();
        //putting 3000 milliseconds as an argument helps with stopping the Main for 3 seconds
        //here in the below line the calling thread is Main
        obj2.join(3000); //Main re-starts only when obj2 stops (no args) OR, for 3 seconds (arg: 3 seconds)
        thread2.start();

        /*even if there was an error in Main (say), if obj2 and thread2 were user-threads, 
        everything still executes but if they were daemons, JVM stops running since there wasn't
        any user threads left, for it to wait for-*/
    }
}
