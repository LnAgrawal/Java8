import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class Example4DistinctCountSortedWithStream {
    public static List<String> getStudentActivities(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
        return studentActivities;

    }
    public static List<String> getStudentActivitiesSorted(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;

    }
    public static long getCount(){
        long count = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(l-> l.stream())
                .distinct()
                .count();
        return count;
    }
    public static void main(String[] args) {
        System.out.println(getStudentActivities());

        System.out.println(getCount());

        System.out.println(getStudentActivitiesSorted());


    }
}
