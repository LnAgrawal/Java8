import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example5SortingWithStream {

    public static List<Student> sortStudentByName(){
       return StudentDataBase.getAllStudents()
                .stream()
                .sorted((s,s1)-> s.getName().compareTo(s1.getName()))
                .collect(Collectors.toList());

    }

    public static List<Student> sortStudentByNameusingComparatorComparing(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(s -> s.getName()))
                .collect(Collectors.toList());

    }
    public static List<Student> sortStudentByNameusingComparatorComparingMR(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

    }

    public static List<Student> sortStudentByGPA(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());

    }
    public static List<Student> sortStudentByGPADesc(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());

    }
    public static void main(String[] args) {
        System.out.println("By Lambda Comparator:");
        sortStudentByName().forEach(System.out::println);

        System.out.println("By Comparator Comparing:");
        sortStudentByNameusingComparatorComparing().forEach(System.out::println);

        System.out.println("By Comparator Comparing Method Reference:");
        sortStudentByNameusingComparatorComparingMR().forEach(System.out::println);

        System.out.println("Sort Student by GPA:");
        sortStudentByGPA().forEach(System.out::println);

        System.out.println("Sort Student by GPA Descending order:");
        sortStudentByGPADesc().forEach(System.out::println);

    }
}
