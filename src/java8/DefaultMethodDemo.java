package java8;

interface CheckNull{
    default void validateString(String msg){
        if (isNull(msg))
            System.out.println("Given String is empty");
        else
            System.out.println("Valid String");
    }
    default Boolean isNull(String msg){
        return msg== null || msg =="";
    }
}
public class DefaultMethodDemo {
    public static void main(String[] args) {
        CheckNull checkNull = new CheckNull() {
            @Override
            public void validateString(String msg) {
                CheckNull.super.validateString(msg);
            }
        };
        checkNull.validateString("");
    }
}
