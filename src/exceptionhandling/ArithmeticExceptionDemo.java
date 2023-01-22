package exceptionhandling;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {

        try {
        Scanner sc=new Scanner(System.in);
        System.out.println(5/ sc.nextInt());
        }catch (ArithmeticException e){
            System.out.println("zero is not divisible");
        }
    }
}
