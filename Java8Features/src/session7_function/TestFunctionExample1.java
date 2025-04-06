package session7_function;

import java.util.function.Function;

public class TestFunctionExample1 {
	
	public static void main(String[] args) {
		//Function<Integer,Integer> f=i->i%2==0?1:0;
		//Function<String,Integer> f=i->i.length();
		Function<String,String> f=i->i.toUpperCase();
		
		System.out.println(f.apply("laxminarayanagrawal"));
	}
}
