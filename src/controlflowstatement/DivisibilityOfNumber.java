package controlflowstatement;

import java.util.Scanner;

public class DivisibilityOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number: ");
        int no=sc.nextInt();

        if (no % 3 == 0 && no % 5 == 0){
            System.out.println("Given number is divisible by 3 & 5 both");
        }else if (no % 3 == 0){
            System.out.println("Given number is divisible by 3 only");
        }else if (no % 5 == 0){
            System.out.println("Given number is divisible by 5 only");
        }
    }
}
