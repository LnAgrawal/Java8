package session9_MultiFunction;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class TestBinaryOperatorExample3 {

	public static void main(String[] args) {
		BiFunction<Integer,Integer, Integer> f = (i,j)-> i*j;
		///BinaryOperator<Integer> bo =  (x,y)-> x*y;
		IntBinaryOperator bo =  (x,y)-> x*y;
		System.out.println(f.apply(2,3));
		System.out.println(bo.applyAsInt(3,6));
	
	}

}
