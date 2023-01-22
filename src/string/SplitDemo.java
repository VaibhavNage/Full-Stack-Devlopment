package string;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String status="Hello Everyone!!,Today is December 7th";
        String[] status1=status.split(",");
        System.out.println(Arrays.toString(status1));
        System.out.println();
        for (String status2:status1){
            System.out.println(status2);
        }
    }
}
