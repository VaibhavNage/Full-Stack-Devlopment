package java8;

public interface Vehicle {
    String getBrand();
   String speedUp();
   String slowDown();
    default void turnAlarmOn(){
        System.out.println("AlarmOn");
    };
    default void turnAlarmOff(){
        System.out.println("AlarmOff");
    };
}
class Car implements Vehicle{
    public static void main(String[] args) {

    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String speedUp() {
        return null;
    }

    @Override
    public String slowDown() {
        return null;
    }
}