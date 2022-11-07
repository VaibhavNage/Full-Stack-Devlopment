package controlflowstatement;

/*
Write a Java program to find the area of Equilateral triangle
Area of equilateral rectangle = √3 a2/ 4
*/

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Side Of Equilateral Triangle :");
        float s= sc.nextFloat();

        double a=1.73*s*s/4;
        System.out.println("Area of Equilateral Triangle is "+a);
    }
}
