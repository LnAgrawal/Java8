package session8_BiFunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class TestBiPredicateExample1 {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bp = (a,b) -> (a+b) %2==0;
		System.out.println(bp.test(10,30));
		System.out.println(bp.test(10,31));
		
		BiFunction<String, String,Integer> bf = (a,b) -> a.compareTo(b);
		System.out.println(bf.apply("babu", "b"));
		System.out.println(bf.apply("",""));
		
	}
}
