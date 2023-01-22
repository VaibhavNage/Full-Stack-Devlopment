package arrays;

public class LargestSmallestElement {
    public static void main(String[] args) {
        int array[] = new int[] {5,7,2,1,6,0,9,3,8,4,};
        int largest=array[0];
        int smallest=array[0];

        //Largest
        for (int i=0;i<array.length;i++){
            if (array[i]>largest){
                largest=array[i];
            }
        }
        System.out.println("Largest number is : "+largest);

        System.out.println();

        //Smallest
        for (int j=0;j<array.length;j++) {
            if (array[j]<smallest) {
                smallest= array[j];
            }
        }
        System.out.println("Smallest number is : "+smallest);
    }
}
