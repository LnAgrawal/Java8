package session6_Predicate;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		//Predicate<Integer> p = n -> n%2==0;
		//Predicate<String> p = s -> s != null;
		
		Predicate<String> p = s -> s.length() > 5;
		
		
		System.out.println(p.test("Abcderfd"));
		System.out.println(p.test(null));
		
		
	}

}
