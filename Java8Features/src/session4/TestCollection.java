package session4;

import java.util.ArrayList;
import java.util.Collections;

public class TestCollection {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee (3443, "Laxmi"));
		l.add(new Employee(655, "Laxmi"));
		l.add(new Employee(99989, "Gangu"));
		l.add(new Employee(1, "Payal"));
		l.add(new Employee(1, "Keshav"));
		System.out.println(l);
		//Collections.sort(l,(e1,e2) -> {return e1.name.compareTo(e2.name)==0?e1.eno- e2.eno: e1.name.compareTo(e2.name);});
		Collections.sort(l,(e1,e2) -> e1.name.compareTo(e2.name));
		System.out.println(l);
	}

}
