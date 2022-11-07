package controlflowstatement;

/*
Write a Java program to print the area and perimeter of a circle
Area of Circle = 𝝅R^2
parameter of circle = 2𝝅R
*/

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Radius =");
        float r =sc.nextFloat();

        double a= 3.14*r*r;
        double p= 2*3.14*r;
        System.out.println("Area of Circle is "+a);
        System.out.println("Parameter of Circle is "+p);

    }
}
