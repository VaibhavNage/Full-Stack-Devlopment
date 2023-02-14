package collections;

public class GenericsDemo {
    public static void main(String[] args) {
        GenericEx ge=new GenericEx("Rs. 10");
        System.out.println(ge.getData());
        GenericEx ge1=new GenericEx(10);
        System.out.println(ge1.getData());
    }
}
class GenericEx<T>{
    private T n;
    public GenericEx(T n){
        this.n=n;
    }
    public T getData(){
        return n;
    }
}