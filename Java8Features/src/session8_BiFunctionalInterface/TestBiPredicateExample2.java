package session8_BiFunctionalInterface;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee{
	int eno;
	String name;
	Employee(int eno, String name){
		this.eno = eno;
		this.name = name;
	}
}

public class TestBiPredicateExample2 {
	public static void main(String[] args) {
		BiFunction<Integer, String,Employee> bf = (eno,name) -> new Employee(eno,name);
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		al.add(bf.apply(100,"Laxmi"));
		al.add(bf.apply(200,"Shiva"));
		al.add(bf.apply(300,"Amit"));
		al.add(bf.apply(400,"Gnagu"));
		
		for(Employee e : al) {
			System.out.println("Eno:" + e.eno + ", Name: " +  e.name);
		}
	}
}
