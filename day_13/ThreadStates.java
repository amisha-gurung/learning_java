//We will be learning thread states in java
public class ThreadStates{
    public static void main(String[] args) throws InterruptedException{
        Thread tobj = new Thread(() -> {
            System.out.println("Thread is running .. ");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Thread Finished");
        });
        
        System.out.println("1. State: " + tobj.getState());
        
        tobj.start();
        System.out.println("2. State: " + tobj.getState());

        tobj.sleep(500);
        System.out.println("3. State: "+ tobj.getState());

        tobj.join();
        System.out.println("4. State: " + tobj.getState());

    }
}