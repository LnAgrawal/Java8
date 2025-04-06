package session7_function;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

//Write a function to find grade of students
public class TestFunctionExample3 {
	
	public static void main(String[] args) {
		Function<Integer,Integer> f1 = i-> i*2; //4 16*4
		Function<Integer,Integer> f2 = i-> i*i*i;
		
		System.out.println(f1.andThen(f2).apply(2));
		
		System.out.println(f1.compose(f2).apply(2));
		System.out.println(f1.apply(2));
	}
}
