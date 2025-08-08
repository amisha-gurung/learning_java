// the problem is solved using synchronization
public class Tsynchro{
    public static void main(String[] args) throws InterruptedException{
        Safe cobj = new Safe();

        Thread tobj1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                cobj.increment();
            }
        });

        Thread tobj2 = new Thread(() -> {
            for (int i=0; i < 1000; i++){
                cobj.increment();
            }
        });

        tobj1.start();
        tobj2.start(); 

        tobj1.join();
        tobj2.join();

        System.out.println("Expected: 2000");
        System.out.println("Actual: " + cobj.getCount()); //always 2000 now that synchronized way 
    }
}

class Safe{
    private int count = 0;
    //synchronized method - only one thread can execute this at a time 
    public synchronized void increment(){
        count ++; //This is thread safe🎉
    }

    public synchronized int getCount(){
        return count;
    }
}