package statickeyword;

import java.sql.SQLOutput;

public class StaticBlockDemo {
    static {
        System.out.println("in static block");
    }

    public static void main(String[] args) {
        System.out.println("in main method");
    }
}
