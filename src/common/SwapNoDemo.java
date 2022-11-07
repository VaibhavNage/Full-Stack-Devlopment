package common;

import java.util.Scanner;

public class SwapNoDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int no1=sc.nextInt();
        System.out.println("Enter 2nd Number");
        int no2= sc.nextInt();
        System.out.println("Before Swap Num1: "+no1+ " And Num2: "+no2);
        int temp;
        temp=no1;
        no1=no2;
        no2=temp;
        System.out.println("Before Swap Num1: "+no1+ " And Num2: "+no2);
    }
}
