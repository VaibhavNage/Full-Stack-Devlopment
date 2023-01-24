package multithreading;

public class ThreadRunDemo implements Runnable{
    @Override
    public  void run(){
        System.out.println("Current thread "+Thread.currentThread().getName());
        System.out.println("in run method");
    }

    public static void main(String[] args) {
        ThreadRunDemo tr=new ThreadRunDemo();
        Thread thread=new Thread(tr);
        thread.run();
    }
}
