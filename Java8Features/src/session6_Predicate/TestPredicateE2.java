package session6_Predicate;

import java.util.function.Predicate;

public class TestPredicateE2 {

	public static void main(String[] args) {
		Predicate<Integer> p1 = i -> i%2==0;
		Predicate<Integer> p2 = i -> i>10;
		
		
		
		System.out.println(p1.and(p2).test(8));
		System.out.println(p1.or(p2).test(8));
		System.out.println(p1.negate().test(7));
		
	}

}
