package exceptionhandling;

public class ArrayIndexError {
    public static void main(String[] args) {

        try {
        int a[]={1,2,3,4,5};
        System.out.println(a[4]);
        }catch (Exception e){
            System.out.println("Index number out of bound try number less than 5"); 
        }
    }
}
