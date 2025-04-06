package session11_Streams;

import java.util.ArrayList;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;

public class StreamExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		al.add(35);
		IntPredicate p = I -> I%2==0;
		
		//ArrayList<Integer> al2 = (ArrayList<Integer>) al.stream().filter(i-> i%2==0).collect(Collectors.toList());
		ArrayList<Integer> al2 = (ArrayList<Integer>) al.stream().filter(i-> p.negate().test(i)).collect(Collectors.toList());
		System.out.println(al2);
	}

}
