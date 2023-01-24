package multithreading;

public class ThreadDemo2 implements Runnable{
    @Override
    public void run() {
        System.out.println("in run method");
    }
}
class ThreadIml{
    public static void main(String[] args) {
        ThreadDemo2 th2= new ThreadDemo2();
        Thread thread=new Thread(th2);
        thread.start();
    }
}