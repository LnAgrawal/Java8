package session10;

class Student{
	String name;
	int rollNo;
	int marks;
	Student(String name, int rollNo, int marks){
		this.name = name;
		this.marks = marks;
		this.rollNo = rollNo;
	}
}

interface StudentFactory {
	public Student getStudent(String name, int rollNo, int marks);
}

public class TestConstructorReferenceExample3 {
	
	public static void main(String[] args) {
		StudentFactory studentFactory = Student::new;
		Student s1= studentFactory.getStudent("laxmi",20009,31);
		System.out.println(s1.name);
	}

}
