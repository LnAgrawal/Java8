import data.Student;
import data.StudentDataBase;

public class Example8StreamMapReduceExample {

    public static int getTotalNumberOfNoteBooks(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s-> s.getGradeLevel()>=3)
                .filter(s-> s.getGender().equals("female"))
                .map(Student::getNoteBooks)
                //.reduce(0,(a,b)-> a+b);
                .reduce(0, Integer::sum);

    }
    public static void main(String[] args) {
        System.out.println("Total number of notebooks: "+getTotalNumberOfNoteBooks());

    }
}
