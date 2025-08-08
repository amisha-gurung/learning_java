//creating threads in java: method 1 extend the Thread class
public class CreateThread{
    public static void main(String[] args){
        MyThread threads = new MyThread(); //create thread
        threads.start(); //Start the thread (calls run() method)

        System.out.print("Main thread continuessss ...");
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Thread is running ...");
            try{
                Thread.sleep(100); //Thread.sleep(): pauses the thread for specified milliseconds
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}