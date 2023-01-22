package string;

import java.util.Scanner;

public class StringName {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name=sc.nextLine();
        System.out.println();
        System.out.println("Your Name "+name.substring(0,1)+"."+name.substring(8,9)+" "+name.substring(15,20));
    }
}
