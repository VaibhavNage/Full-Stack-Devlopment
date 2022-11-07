package inheritance;

public class Vehicle{
    int id = 1;
    String name = "Maruti Suzuki";
    float price = 1200000;
}
class Car extends Vehicle{
    String model = "Ciaz";
    int seater = 4;

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("Vehicle name is "+c.name+" & Car model is "+c.model+" and it's a "+c.seater+" Car");
    }
}
