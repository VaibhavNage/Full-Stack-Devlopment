package inteface;

interface Printable {
    void print();
}
interface Showable{
    void print();
}
class TestMultipleInterface implements Printable,Showable{
    public void print(){
        System.out.println("Hello");
    }
}

class PrintImpl{
    public static void main(String[] args) {
        TestMultipleInterface testMultipleInterface=new TestMultipleInterface();
        testMultipleInterface.print();
    }
}
