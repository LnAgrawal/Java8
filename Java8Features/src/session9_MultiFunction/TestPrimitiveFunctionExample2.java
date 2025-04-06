package session9_MultiFunction;

import java.util.function.IntFunction;
public class TestPrimitiveFunctionExample2 {

	public static void main(String[] args) {
		//Function<Integer,Integer> f = i-> i*i;
		IntFunction<Integer>  f = i-> i*i;
		System.out.println(f.apply(2));
		System.out.println(f.apply(3));
	
	}

}
