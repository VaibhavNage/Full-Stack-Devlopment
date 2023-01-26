package multithreading;

public class ThreadNameDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("in run method");
    }
}
class ThreadNameImpl{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadNameDemo tn1=new ThreadNameDemo();
        ThreadNameDemo tn2=new ThreadNameDemo();
        Thread thread1=new Thread(tn1);
        Thread thread2=new Thread(tn2,"Codekul");

        thread1.start();
        thread2.start();
        thread1.setName("Vaibhav");
        System.out.println("thread1 "+thread1.getName());
        System.out.println("thread2 "+thread2.getName());
    }
}