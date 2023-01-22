package arrays;

import java.util.Scanner;

public class MultiplicationOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        System.out.println("Enter first matrix element");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second matrix element");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition of two matrices\n");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Multiplication of two matrices\n");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {

                for (int k=0;k<2;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}


