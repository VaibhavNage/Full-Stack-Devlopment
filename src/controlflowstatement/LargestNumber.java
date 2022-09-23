package controlflowstatement;

public class LargestNumber {
    public static void main(String[] args) {
        int x =5;
        int y=10;
        int z=5;
        if(x>y && x>z)
            System.out.println("x is largest");
        else
            if(y>x && y>z)
                System.out.println("y is largest");
            else
                if(z>x && z>y)
                System.out.println("z is largest");
                else
                if(x==y && x==z)
                    System.out.println("x , y and z are equal");
                else
                    if(x==y)
                        System.out.println("x and y are equal");
                    else
                    if(x==z)
                        System.out.println("x and z are equal");
                    else
                    if(y==z)
                        System.out.println("y and z are equal");


    }
}
