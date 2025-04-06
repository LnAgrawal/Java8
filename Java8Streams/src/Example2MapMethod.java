import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example2MapMethod {
    public static List<String> nameList(){
        return StudentDataBase.getAllStudents().stream()//Stream<Student>
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> perform uppercase operation in each input
                .collect(Collectors.toList());

    }

    public static Set<String> nameSet(){
        return StudentDataBase.getAllStudents().stream()//Stream<Student>
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> perform uppercase operation in each input
                .collect(Collectors.toSet());

    }
    public static void main(String[] args) {
        System.out.println(nameList());

        System.out.println(nameSet());
    }

}
