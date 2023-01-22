package arrays;

public class OddEvenPosition {
    public static void main(String[] args) {
        int array[]=new int[]{5,8,10,53,34,60,23};

        // Even Pos
        System.out.println("Even position number");
            for (int i = 0; i < array.length; i = i + 2) {
                System.out.println(array[i]);
            }

        // Odd position
        System.out.println("Odd Position number");
        for (int j=1;j<array.length;j=j+2){
            System.out.println(array[j]);
        }
    }
}
