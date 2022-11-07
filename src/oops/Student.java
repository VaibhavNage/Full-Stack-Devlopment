package oops;

public class Student {
    int RollNo;
    String Name;
    int Age;
    String ClassName;

    void showData() {
        System.out.println("Roll NO" + RollNo);
        System.out.println("Name" + Name);
        System.out.println("Class" + Age);
    }

        public static void main(String[] args) {
            Student s1; //reference variable
            s1= new Student(); //memory allocation for s1
            s1.RollNo = 01;
            s1.Name = "Vaibhav";
            s1.Age = 24;
            s1.showData();
        }
    }

