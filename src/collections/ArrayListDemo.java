package collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Java");
        list.add(3,"ReactJS");
        System.out.println(list);
    }
}
