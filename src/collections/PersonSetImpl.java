package collections;

import java.util.Set;
import java.util.TreeSet;

public class PersonSetImpl {
    public static void main(String[] args) {
        Set<Person> personSet=new TreeSet<>();
        System.out.println(new Person(1,"Nilesh",51));
        System.out.println(new Person(2,"Nikta",24));
        System.out.println(new Person(3,"Pankaj",43));

        for (Person p:personSet){
            System.out.println(p.toString());
        }
    }
}
class Person implements Comparable<Person>{
    private Integer id;
    private String name;
    private Integer age;

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}