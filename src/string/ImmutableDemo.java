package string;

public class ImmutableDemo {
    public static void main(String[] args) {
        String s = "123456";
        System.out.println("S "+s);
        s.concat(",78");
        s.replace(s,"789");
        System.out.println("After String Operation "+s);
        String s1= s;
        System.out.println("s1: "+s1);
        s ="abc123";
        System.out.println("Updated password "+s);
        System.out.println("After Update "+s1);
        s1 ="pzr123";
    }
}
