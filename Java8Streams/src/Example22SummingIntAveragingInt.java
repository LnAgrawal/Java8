import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class Example22SummingIntAveragingInt {

    public static int summingInt(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double average(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }
    public static void main(String[] args) {
        System.out.println(summingInt()); //71
        System.out.println(average());
    }
}
