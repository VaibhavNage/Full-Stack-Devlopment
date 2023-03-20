package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo2 {
    public static void main(String[] args) {
        Consumer<String> consumer=new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s.toUpperCase());
            }
        };
        List<String> list= Arrays.asList("Vaibhav","Ajinkya","Pooja","Bishnoi");
        list.forEach(consumer);
        list.forEach(System.out::println);
    }
}
