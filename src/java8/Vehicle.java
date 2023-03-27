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
    default void getSpeed(){
        System.out.println(getBrand());
        System.out.println(speedUp());
        System.out.println(slowDown());
    }
    static void calculateSpeed(){
        int speed = 90;
        if (speed < 20)
            System.out.println("Low Speed");
        else
            System.out.println("High Speed");
    }
}
class Car implements Vehicle{
    public static void main(String[] args) {
        Car car =new Car();
        car.turnAlarmOn();
        car.turnAlarmOff();
        car.getSpeed();
        Vehicle.calculateSpeed();
    }

    @Override
    public String getBrand() {
        return "Brand Name : Royal Enfield";
    }

    @Override
    public String speedUp() {
        return "Speed Increasing";
    }

    @Override
    public String slowDown() {
        return "Speed Reducing";
    }
}