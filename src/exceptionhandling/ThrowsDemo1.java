package exceptionhandling;

public class ThrowsDemo1 {
    void m1() throws ArithmeticException,NullPointerException{
        String str=null;
        int n=10/0;
        System.out.println(str.toUpperCase());
    }
}
