package session11_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

public class StreamExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(30);
		al.add(35);
		//find even
		//ArrayList<Integer> al2 = (ArrayList<Integer>) al.stream().filter(i-> i%2==0).collect(Collectors.toList());
		IntUnaryOperator u = i -> i*2;
		//Double each elemetns
		//List<Integer> al2 = al.stream().map(i-> i*2).collect(Collectors.toList());
		List<Integer> al2 = al.stream().map(i-> u.applyAsInt(i)).collect(Collectors.toList());
		System.out.println(al2);
	}

}
