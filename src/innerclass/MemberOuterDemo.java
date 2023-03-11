package innerclass;

public class MemberOuterDemo {
    private String msg="in outer class";
    class MemberInner{
        void sendMsg(){
            System.out.println("in inner class");
        }
    }
    public static void main(String[] args) {
     MemberOuterDemo outerDemo=new MemberOuterDemo();
     MemberOuterDemo.MemberInner inner=outerDemo.new MemberInner();
     inner.sendMsg();
    }
}
