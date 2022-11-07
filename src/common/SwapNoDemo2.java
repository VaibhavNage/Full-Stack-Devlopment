package common;

import java.util.Scanner;

public class SwapNoDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int no1=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int no2= sc.nextInt();
        SwapNoDemo2 s1=new SwapNoDemo2();
        s1.swap(no1,no2);
    }

    void swap(int a,int b){
        System.out.println("Before Swap Num1: "+a+ " And Num2: "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Before Swap Num1: "+a+ " And Num2: "+b);
    }
}

