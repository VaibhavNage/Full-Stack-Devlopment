package multithreading;

public class ThreadJoinDemo extends Thread{
    @Override
    public void run() {
        //System.out.println("in run method");
        for (int i=1;i<=5;i++){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Current Thread -"+Thread.currentThread().getName());
        }
    }
}
class ThreadJoinImpl{
    public static void main(String[] args) {
        ThreadJoinDemo tj1=new ThreadJoinDemo();
        ThreadJoinDemo tj2=new ThreadJoinDemo();
        ThreadJoinDemo tj3=new ThreadJoinDemo();

        tj1.start();
        try {
            System.out.println("Current Thread -"+Thread.currentThread());
            tj1.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Current Thread -"+Thread.currentThread());
        tj2.start();
        try {
            tj2.join();
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        tj3.start();
    }
}

