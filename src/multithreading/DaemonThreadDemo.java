package multithreading;

public class DaemonThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("in run method");
    }
}
class DaemonThreadImpl{
    public static void main(String[] args) {
        DaemonThreadDemo dt1=new DaemonThreadDemo();
        DaemonThreadDemo dt2=new DaemonThreadDemo();
        dt1.setDaemon(true);
        dt1.start();
        dt2.start();
        System.out.println(dt1.isDaemon());
        System.out.println(dt2.isDaemon());
    }
}
