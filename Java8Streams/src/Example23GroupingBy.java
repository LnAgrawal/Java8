import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

public class Example23GroupingBy {

    public static Map<String, List<Student>> groupingStudentByGender(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));

    }
    public static Map<String, List<Student>> customizedGroupingStudentByGpa(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa()>=3.8? "Outstanding": "Average" ));

    }

    public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping_1(){
       return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.groupingBy(student -> student.getGpa()>=3.8? "Outstanding": "Average" )));

    }
    public static Map<Integer, Integer> twoLevelGrouping_2(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.summingInt(Student::getNoteBooks)));

    }

    public static LinkedHashMap<String, Set<Student>> threeArgumentGroupingBy(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));


    }

    public static void main(String[] args) {

        //TYPE1
        System.out.println("TYPE1");
        System.out.println(groupingStudentByGender());
        System.out.println(customizedGroupingStudentByGpa());

        System.out.println("TYPE2");
        System.out.println(twoLevelGrouping_1());
        System.out.println(twoLevelGrouping_2());

        System.out.println("TYPE3");
        System.out.println(threeArgumentGroupingBy());

    }
}
