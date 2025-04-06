import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class Example12StreamsFindAnyFirst {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=4.8)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.8)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> studentFineAnyResult = findAnyStudent();
        if (studentFineAnyResult.isPresent()){
            System.out.println("Found the student: "+ studentFineAnyResult.get());
        } else{
            System.out.println("Find any Student not found");
        }

        Optional<Student> studentFineFirstResult = findFirstStudent();
        if (studentFineFirstResult.isPresent()){
            System.out.println("Find First the student: "+ studentFineFirstResult.get());
        } else{
            System.out.println("Find any Student not found");
        }
    }
}
