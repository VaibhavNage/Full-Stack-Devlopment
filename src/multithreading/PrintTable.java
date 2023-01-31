package multithreading;

public class PrintTable {
    void PrintTable(int no){
        for (int i=1;i<=10;i++){
            System.out.println(no*i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Thread1 extends Thread{
    PrintTable printTable;
    Thread1(PrintTable printTable){
        this.printTable=printTable;
    }
    @Override
    public void run(){
        printTable.PrintTable(5);
    }
}
class Thread2 extends Thread{
    PrintTable printTable;
    Thread2(PrintTable printTable){
        this.printTable=printTable;
    }
    @Override
    public void run(){
        printTable.PrintTable(3);
    }
}
class PrintTableImpl{
    public static void main(String[] args) {
        PrintTable printTable=new PrintTable();

        Thread1 t1=new Thread1(printTable);
        Thread2 t2=new Thread2(printTable);
        t1.start();
        t2.start();
    }
}
