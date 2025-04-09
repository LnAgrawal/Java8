import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String name;
    String department;
    Integer salary;

    public Employee(String name, String department, Integer salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Example4EmployeeWithMaxSalary {

    public static List<Employee> employeeDatabase(){
        List<Employee> data =new ArrayList<>();
        Employee e1 = new Employee("Amit","IT",1000);
        Employee e2 = new Employee("Sagar","IT",2000);
        Employee e3 = new Employee("Laxmi","Sales",1500);
        Employee e4 = new Employee("Sumit","Sales",500);

        data.add(e1);
        data.add(e2);
        data.add(e3);
        data.add(e4);
        return data;
    }
    public static void main(String[] args) {

        Map<String, Optional<Employee>> collect = employeeDatabase().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        collect.forEach(
                (k,v)->{
                    System.out.println("Department: "+ k + ", Employee: "+ v.get());
                }

        );

    }
}
