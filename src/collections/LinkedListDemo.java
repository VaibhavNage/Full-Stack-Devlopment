package collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Ramesh");
        list.add("Vinay");
        list.add("Suresh");
        list.add(2,"Priya");
        list.addFirst("Vinod");
        list.addLast("Soni");
        list.removeFirst();
        System.out.println("list.get(0) "+list.get(0));
        list.forEach(s->{
            System.out.println(s);
        });
    }
}
