package multithreading;

public class ThreadPriorityDemo extends Thread{
    @Override
    public void run() {
        System.out.println("in run method");
        System.out.println(Thread.currentThread().getName());
    }
}
class ThreadPriorityImpl{
    public static void main(String[] args) {
        ThreadPriorityDemo tp1=new ThreadPriorityDemo();
        ThreadPriorityDemo tp2=new ThreadPriorityDemo();
        tp1.setPriority(Thread.MIN_PRIORITY);
        tp2.setPriority(Thread.MAX_PRIORITY);
        tp1.start();
        tp2.start();
        System.out.println("After setting priority "+tp1.getPriority());
        System.out.println("After setting priority "+tp2.getPriority());
    }
}