package arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int array [] = new int [5];
        System.out.println("Array "+array);
        array [0]=1;
        array [1]=2;
        array [2]=3;
        array [3]=4;
        array [4]=5;

        for (int a:array){
            System.out.println(a+" ");
        }
        System.out.println("4th Position element "+array[3]);
    }
}
