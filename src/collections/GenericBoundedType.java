package collections;

public class GenericBoundedType <T extends Number>{
    void display(){
        System.out.println();
    }
    public static void main(String[] args) {
     GenericBoundedType<Integer> gbt=new GenericBoundedType();
        GenericBoundedType<Double> gbt1=new GenericBoundedType();
      //  GenericBoundedType<String> gbt2=new GenericBoundedType();
    }
}

