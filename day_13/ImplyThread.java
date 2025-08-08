public class ImplyThread{
    public static void main(String[] args){
        ThisThread wiwi = new ThisThread();
        Thread owow = new Thread(wiwi);

        owow.start();
        System.out.println("Main thread continues ...");
    }
}

class ThisThread implements Runnable{
    public void run(){
        for(int i = 0; i < 5; i++){
            System.out.println("Implementing runnable ..." + i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException w){
                w.printStackTrace();
            }
        }
    }
}