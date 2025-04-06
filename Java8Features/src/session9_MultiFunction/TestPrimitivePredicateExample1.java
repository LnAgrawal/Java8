package session9_MultiFunction;

import java.util.function.LongPredicate;

public class TestPrimitivePredicateExample1 {

	public static void main(String[] args) {
		//Predicate<Integer> p = i-> i%2==0;
		
		//IntPredicate p = i-> i%2==0;
		LongPredicate p = i-> i%2==0;
		//IntPredicate p = i-> i%2==0;
		//DoublePredicate p = i-> i%2==0;
		System.out.println(p.test(2l));
		System.out.println(p.test(3l));
	
	}

}
