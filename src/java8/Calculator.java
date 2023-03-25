package java8;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Calculator {
    public static void main(String[] args) {
        int num;
        int num1;
        int num2;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Exit");
            System.out.println("Enter Number");
            num =sc.nextInt();
            if (num<6){
                System.out.println("Enter First Number");
                num1 =sc.nextInt();
                System.out.println("Enter Second Number");
                num2 =sc.nextInt();
                switch (num){
                    case 1:
                        BiFunction<Integer,Integer,Integer> biFunction=Integer::sum;
                        System.out.println(biFunction.apply(num1,num2));
                        break;
                    case 2:
                        BiFunction<Integer,Integer,Integer> subtraction=(x,y)-> x-y;
                        System.out.println(subtraction.apply(num1,num2));
                        break;
                    case 3:
                        BiFunction<Integer,Integer,Integer> multiplication=(x,y)-> x*y;
                        System.out.println(multiplication.apply(num1,num2));
                        break;
                    case 4:
                        BiFunction<Integer,Integer,Integer> division=(x,y)-> x/y;
                        System.out.println(division.apply(num1,num2));
                        break;
                    case 5:
                        BiFunction<Integer,Integer,Integer> modulo=(x,y)-> x%y;
                        System.out.println(modulo.apply(num1,num2));
                        break;
                }
            }else {
                System.exit(6);
                    break;
            }


            System.out.println();
        }while (num<6);
    }
}
