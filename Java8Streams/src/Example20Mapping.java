import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class Example20Mapping {
    public static void main(String[] args) {

        List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                //.map(Student::getName) with mapping this is not needed
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));

        System.out.println(namesList);

    }
}
