package session7_function;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
class Student{
	String name;
	int marks;
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}
//Write a function to find grade of students
public class TestFunctionExample2 {
	
	public static void main(String[] args) {
		//Function<Integer,Integer> f=i->i%2==0?1:0;
		//Function<String,Integer> f=i->i.length();
		//<String,String> f=i->i.toUpperCase();
		Function<Student, String> f = s -> s.marks>=80?"A":s.marks>=70?"B":s.marks >=60?"C":s.marks>=35?"D":"F";
		Predicate<Integer> p = i -> i<=60;
		Comparator<Student> c = (s1,s2)-> s2.marks-s1.marks;
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("laxmi", 34));
		al.add(new Student("Payal", 80));
		al.add(new Student("Amit", 70));
		al.add(new Student("Gangu", 60));
		al.add(new Student("Kavita", 50));
		Collections.sort(al, c);
		
		
		for(Student s : al)
		{
			if(p.test(s.marks))
			System.out.println("Name: "+ s.name + " Marks: "+s.marks+" Results: "+ f.apply(s));
		}
	}
}
