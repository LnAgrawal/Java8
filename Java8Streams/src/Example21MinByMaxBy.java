import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example21MinByMaxBy {

    public static Optional<Student> minBy(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));

    }

    public static Optional<Student> maxBy(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));

    }
    public static void main(String[] args) {
        Optional<Student> minGpaStudent = minBy();
        minGpaStudent.ifPresent(System.out::println);

        Optional<Student> maxGpaStudent = maxBy();
        maxGpaStudent.ifPresent(System.out::println);

    }


}
