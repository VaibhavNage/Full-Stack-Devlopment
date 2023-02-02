package multithreading;

public class StaticSynchronizationPrintable {
    synchronized static void printTable(int no){
        for (int i=1;i<=10;i++){
            System.out.println(no*i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class StaticThreadOne extends Thread{
    @Override
    public void run(){
       StaticSynchronizationPrintable.printTable(5);
    }
}
class StaticThreadTwo extends Thread{
    @Override
    public void run(){
        StaticSynchronizationPrintable.printTable(3);
    }
}
class StaticThreadThree extends Thread{
    @Override
    public void run(){
        StaticSynchronizationPrintable.printTable(2);
    }
}
class StaticThreadFour extends Thread{
    @Override
    public void run(){
        StaticSynchronizationPrintable.printTable(4);
    }
}
class StaticSynchronizationPrintableImpl{
    public static void main(String[] args) {
        StaticThreadOne st1=new StaticThreadOne();
        StaticThreadTwo st2=new StaticThreadTwo();
        StaticThreadThree st3=new StaticThreadThree();
        StaticThreadFour st4=new StaticThreadFour();
        st1.start();
        st2.start();
        st3.start();
        st4.start();
    }
}

