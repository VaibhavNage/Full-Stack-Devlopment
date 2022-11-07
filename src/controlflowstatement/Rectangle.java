package controlflowstatement;

/*
Write a Java program to print the area and perimeter of a rectangle
Area of rectangle = l×w
parameter of rectangle = 2(l + w)
*/


import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle =");
        float l=sc.nextFloat();
        System.out.print("Enter the Width of Rectangle =");
        float w=sc.nextFloat();

        double a= l*w;
        double p= 2*l+2*w;
        System.out.println("Area of Circle is "+a);
        System.out.println("Parameter of Circle is "+p);

    }
}
