public class threadP implements Runnable {
    private String name;
    public threadP(String name){
        this.name = name;
    }
    @Override
    public void run(){
        System.out.println("Start Thread: "+ name);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Ended Thread: "+ name);
    }
    
}
