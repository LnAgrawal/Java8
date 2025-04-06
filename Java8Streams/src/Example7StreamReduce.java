import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example7StreamReduce {
    public static int perfromMultipilication(List<Integer> integerList){
        return integerList.stream()
                //1
                //3
                //5
                //7
                // a=1, b=1(from stream) => result 1 is returned
                // a=1, b=3(from stream) => return 3 is returned
                //a=3, b=5(from stream) => return 15 is returned
                //a=15, b=7(from stream) => return 105 is returned
                .reduce(1,(a,b)->a*b);

    }
    public static Optional<Integer> perfromMultipilicationWithoutIdendity(List<Integer> integerList){
        return integerList.stream()

                .reduce((a,b)->a*b);

    }

    public static Optional<Student> getHighestGPAStudent(){
       /* return StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1,s2)-> {
                    if(s1.getGpa() > s2.getGpa())
                        return s1;
                    else
                        return s2;
                });*/
        return StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1,s2)-> (s1.getGpa() > s2.getGpa())?s1:s2);
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println(perfromMultipilication(integers));

        Optional<Integer> result = perfromMultipilicationWithoutIdendity(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        Optional<Integer> result1 = perfromMultipilicationWithoutIdendity(new ArrayList<>());
        System.out.println(result1.isPresent());
       // System.out.println(result1.get());

        Optional<Student> optionalStudent = getHighestGPAStudent();
        System.out.println(optionalStudent.isPresent());
        System.out.println(optionalStudent.get());

    }
}
