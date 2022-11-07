package controlflowstatement;

public class StarPattern4 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = i; j< 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
