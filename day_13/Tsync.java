//here we will learn the thread Synchronization - The problem
//when multiple threads access the same data, we can have problems
public class Tsync{
    public static void main(String[] args) throws InterruptedException{
        Counter cobj = new Counter();

        Thread tobj1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                cobj.increment();
            }
        });

        Thread tobj2 = new Thread(() -> {
            for(int i = 0; i<1000; i++){
                cobj.increment();
            }
        });

        tobj1.start();
        tobj2.start();

        tobj1.join(); //wait for both threads to finish
        tobj2.join();

        System.out.println("Expected: 2000");
        System.out.println("Actual: " + cobj.getCount()); // might not get 2000
    }
}

class Counter{
    private int count = 0;
    public void increment(){
        count++;  // this is not thread-safe
    }

    public int getCount(){
        return count;
    }
}