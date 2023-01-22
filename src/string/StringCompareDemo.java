package string;

public class StringCompareDemo {
    public static void main(String[] args) {
        String s1="Akola";
        String s2="Akola";
        String s3=new String("Akola");
        String s4="Nagpur";
        String s5="Pune";
        String s6="Delhi";
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println();
        System.out.println(s1==s2);
        System.out.println(s3==s4);

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s4));
        System.out.println(s6.compareTo(s4));
        System.out.println(s5.compareTo(s6));
    }
}
