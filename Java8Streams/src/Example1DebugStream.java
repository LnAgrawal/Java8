import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example1DebugStream {
    /**
     * Peek is the method use for debugging
     * @param args
     */
    public static void main(String[] args) {

        Predicate<Student> studetGradePredicate = s -> s.getGradeLevel() >=3;
        Predicate<Student> studetGpaPredicate = s -> s.getGpa() >=3.5;


        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .peek(s-> System.out.println("Before filter: "+s))
                .filter(studetGradePredicate)
                .peek(s-> System.out.println("after Grade filter: "+s))
                .filter(studetGpaPredicate)
                .peek(s-> System.out.println("after GPA filter: "+s))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
            System.out.println(studentMap);
    }
}
