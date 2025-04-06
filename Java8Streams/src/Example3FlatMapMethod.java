import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class Example3FlatMapMethod {

    public static List<String> getStudentActivities(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream)
                //.distinct()
                .collect(Collectors.toList());
        return studentActivities;

    }
    public static void main(String[] args) {
        System.out.println(getStudentActivities());
    }
}
