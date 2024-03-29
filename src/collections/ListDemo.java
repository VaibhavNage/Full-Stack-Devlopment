package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Pune");
        list.add("Mumbai");
        list.add("Nagpur");
        list.add("Bangalore");
        list.add(1,"Goa");
        System.out.println("list.get(3) "+list.get(3));
        list.remove(4);
        list.remove("Pune");

        System.out.println("Size "+list.size());
        System.out.println("Empty "+list.isEmpty());
        System.out.println(list);
        System.out.println("contains "+list.contains("Pune"));

        //Enhanced for loop
        for (String s:list){
            System.out.println(s);
        }
        //Java 8
        list.forEach(c-> System.out.println(c));
        //Iterator
        Iterator iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
