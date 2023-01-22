package exceptionhandling;

import java.util.Locale;
import java.util.Scanner;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String str=null;
        try {
            System.out.println(str.toUpperCase());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}
