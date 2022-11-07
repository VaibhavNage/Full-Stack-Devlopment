package thiskeyword;

/**
 * to return the current class instance from the method
 */

public class Return{
    Return getA(){
        return this;
    }
    void msg(){
        System.out.println("Hello");
    }
}

class Value{
    public static void main(String[] args) {
        new Return().getA().msg();
    }
}
