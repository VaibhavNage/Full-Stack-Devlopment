package thiskeyword;

/**
 *5. can be passed as argument in the method call
 */

public class Calculate {
    void sum(Data obj){
        System.out.println("a+b="+(obj.a+obj.b));
    }
}
class Data{
    int a=18;
    int b=27;
    void show(){
        new Calculate().sum(this);
    }
    public static void main(String[] args) {
         Data obj=new Data();
         obj.show();
    }
}
