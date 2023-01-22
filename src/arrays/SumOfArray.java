package arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int array[]=new int[]{45,2,825,917,5,70};
        int sum=0;

        for (int i=0;i<array.length;i++){
            sum = sum + array[i];
        }
        System.out.println("Total sum of array "+sum);
    }
}
