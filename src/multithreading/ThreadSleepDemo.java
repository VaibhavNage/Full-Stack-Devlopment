package multithreading;

public class ThreadSleepDemo extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class ThreadSleepImpl{
    public static void main(String[] args) {
        ThreadSleepDemo ts1=new ThreadSleepDemo();
        ThreadSleepDemo ts2=new ThreadSleepDemo();
        ts1.start();
        ts2.start();
    }
}
