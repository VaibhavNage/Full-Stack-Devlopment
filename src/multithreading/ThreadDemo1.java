package multithreading;

public class ThreadDemo1 extends Thread{
    @Override
    public void run(){
        System.out.println("In Run Method");
    }
}
class ThreadDemoImpl1{
    public static void main(String[] args) {
        ThreadDemo1 th1 = new ThreadDemo1();
        System.out.println("in run method");
        th1.start();
    }
}
