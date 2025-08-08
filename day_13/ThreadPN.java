//here we will learn about thread priority and name
public class ThreadPN{
    public static void main(String[] args){
        Thread tobj1 = new Thread(() -> {
            for (int i = 0; i < 5; i++){
                System.out.println(Thread.currentThread().getName() + " - " + i);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread tobj2 = new Thread(() -> {
            for(int t = 0; t <= 5; t++){
                System.out.println(Thread.currentThread().getName() + " - " + t);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        //set name of threads
        tobj1.setName("Worker-1");
        tobj2.setName("Worker-2");


        //set priority of threads
        tobj1.setPriority(Thread.MAX_PRIORITY);
        tobj2.setPriority(Thread.MIN_PRIORITY);

        tobj1.start();
        tobj2.start();

        //get main thread info  
        Thread mainThread = Thread.currentThread();
        System.out.println("Main thread name: " + mainThread.getName());
        System.out.println("Main thread Priority: " + mainThread.getPriority());      
    }
}