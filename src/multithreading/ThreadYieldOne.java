package multithreading;

public class ThreadYieldOne extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("in ty1");
        }
    }
}
class ThreadYieldTwo extends Thread{
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("in ty2");
        }
    }
}
class ThreadYieldImpl{
    public static void main(String[] args) {
        ThreadYieldOne ty1=new ThreadYieldOne();
        ThreadYieldOne ty2=new ThreadYieldOne();
        ty1.start();
        ty2.start();
    }
}

