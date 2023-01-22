package encapsulation;

public class Employee {
    private int empId;
    private String name;
    private String companyName="Codekul Pvt. Ltd.";
    private String address;
    private double salary;
    private double bonus=10000d;

    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getSalary() {
        return salary;
    }
    public double getBonus() {
        return bonus;
    }
    public void setSalary(double salary) {
        if (salary < 50000)
            this.salary= salary+getBonus();
        else
        this.salary = salary;
    }
}
class EmployeeImpl{
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setEmpId(101);
        employee.setName("Vaibhav");
        employee.setAddress("Kothrud, Pune");
        employee.setSalary(49000d);
        System.out.println("Employee Id : "+ employee.getEmpId());
        System.out.println("Employee Name : "+ employee.getName());
        System.out.println("Company Name : "+ employee.getCompanyName());
        System.out.println("Salary : "+ employee.getSalary());
    }
}
