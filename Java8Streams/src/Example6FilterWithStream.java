import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class Example6FilterWithStream {
    public static List<Student> filterStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGender().equals("female"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Female students here:");
        filterStudent().forEach(System.out::println);
    }
}
