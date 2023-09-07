package controlflowstatement;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,count=0;
        System.out.println("Enter a number: ");
        number =sc.nextInt();
        for (int i=1;i<=number;i++){
            if (number%i==0)
                count++;
        }
        if (count==2)
            System.out.println(number+" is a prime number");
        else
            System.out.println(number+" is not a prime number");
    }
}
