import data.StudentDataBase;

import java.util.stream.Collectors;

public class Example19Counting {
    public static long count(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.counting());

    }

    public static void main(String[] args) {
        System.out.println(count());
    }
}
