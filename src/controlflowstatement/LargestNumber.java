package controlflowstatement;

public class LargestNumber {
    public static void main(String[] args) {
        int x =10;
        int y=10;
        int z=15;
        if(x>y && x>z)
            System.out.println("x is largest");
            if(y>x && y>z)
                System.out.println("y is largest");
                if(z>x && z>y)
                System.out.println("z is largest");
                if(x==y && x==z)
                    System.out.println("x , y and z are equal");
                    if(x==y)
                        System.out.println("x and y are equal");
                    if(x==z)
                        System.out.println("x and z are equal");
                    if(y==z)
                        System.out.println("y and z are equal");


    }
}
