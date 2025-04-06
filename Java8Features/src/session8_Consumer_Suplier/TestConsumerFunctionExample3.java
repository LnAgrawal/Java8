package session8_Consumer_Suplier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
class Student1{
	String name;
	int marks;
	public Student1(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}
//Write a function to find grade of students
public class TestConsumerFunctionExample3 {
	
	public static void main(String[] args) {
		Function<Student1, String> f = s -> s.marks>=80?"A":s.marks>=70?"B":s.marks >=60?"C":s.marks>=35?"D":"F";
		Predicate<Integer> p = i -> i<=60;
		Comparator<Student1> com = (s1,s2)-> s2.marks-s1.marks;
		ArrayList<Student1> al = new ArrayList<Student1>();
		al.add(new Student1("laxmi", 34));
		al.add(new Student1("Payal", 80));
		al.add(new Student1("Amit", 70));
		al.add(new Student1("Gangu", 60));
		al.add(new Student1("Kavita", 50));
		Collections.sort(al, com);
		Consumer<Student1> c = s-> {
			System.out.println("Name: "+ s.name + " Marks: "+s.marks+" Results: "+ f.apply(s));
		};
		for(Student1 s : al)
		{
			if(p.test(s.marks))
				c.accept(s);
		}
	}
}
