package string;

import java.util.Arrays;
import java.util.Locale;

public class StringInitialNameDemo {
    public static void main(String[] args) {
        String str ="vaibhav praksah naGE";
        String names[] = str.split(" ");
        String firstName=names[0].substring(0,1);
        System.out.println(firstName);
        String middleName=names[1].substring(0,1);
        System.out.println(middleName);
        String lastName=names[2].substring(0,1).toUpperCase().concat(names[2].substring(1).toLowerCase());
        System.out.println(lastName);
        String fullName=firstName.toUpperCase()+"."+middleName.toUpperCase()+"."+lastName;
        System.out.println(fullName);

        System.out.println(firstName.startsWith("V"));
        System.out.println(lastName.endsWith("e"));
        System.out.println(str.charAt(18));
        System.out.println(str.length());

        int n=50;
        String a=String.valueOf(n);
        System.out.println(a);

        String s1="This is Java course, and we are Java Developer!!";
        String s2=s1.replace("Java","React");
        System.out.println(s2);
    }
}
