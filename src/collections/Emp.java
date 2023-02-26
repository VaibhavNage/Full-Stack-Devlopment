package collections;

import java.util.LinkedList;

public class Emp {
    Integer empId;
    String name;
    Integer mobile;

    public Emp(Integer empId, String name, Integer mobile) {
        this.empId = empId;
        this.name = name;
        this.mobile = mobile;
    }
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
class EmpImp {
    public static void main(String[] args) {
        LinkedList<Emp> list = new LinkedList<>();

        list.add(new Emp(1,"Vaibhav",775274556));
        System.out.println(list);

    }
}

