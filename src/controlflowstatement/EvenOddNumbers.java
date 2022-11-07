package controlflowstatement;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number: ");
        int no=sc.nextInt();

        if (no % 2 == 0){
            System.out.println("Even Number");
        }else
            System.out.println("Odd Number");
    }
}
