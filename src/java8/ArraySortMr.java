package java8;

import java.util.Arrays;

public class ArraySortMr {
    public static void main(String[] args) {
        String[] names={"Tom","Jerry","Gunther","Dexter","Shaggy"};
        Arrays.sort(names,String::compareToIgnoreCase);
        for (String n: names){
            System.out.println(n);
        }
    }
}
