package multithreading;

public class SynchronizedBlockPrintTable {
    void printTable(int no){
        synchronized (this){
            for (int i=1;i<=10;i++){
                System.out.println(no*i);
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
class ThreadOne extends Thread{
    SynchronizedBlockPrintTable synchronizedBlockPrintTable;
    ThreadOne(SynchronizedBlockPrintTable synchronizedBlockPrintTable){
        this.synchronizedBlockPrintTable=synchronizedBlockPrintTable;
    }
    @Override
    public void run(){
        synchronizedBlockPrintTable.printTable(5);
    }
}
class ThreadTwo extends Thread{
    SynchronizedBlockPrintTable synchronizedBlockPrintTable;
    ThreadTwo(SynchronizedBlockPrintTable synchronizedBlockPrintTable){
        this.synchronizedBlockPrintTable=synchronizedBlockPrintTable;
    }
    @Override
    public void run(){
        synchronizedBlockPrintTable.printTable(3);
    }
}
class SynchronizedBlockPrintTableImpl{
    public static void main(String[] args) {
        SynchronizedBlockPrintTable synchronizedBlockPrintTable=new SynchronizedBlockPrintTable();
        ThreadOne t1=new ThreadOne(synchronizedBlockPrintTable);
        ThreadTwo t2=new ThreadTwo(synchronizedBlockPrintTable);
        t1.start();
        t2.start();
    }
}
