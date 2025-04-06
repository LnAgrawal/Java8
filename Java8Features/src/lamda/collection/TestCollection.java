package lamda.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestCollection {

	public static void main(String[] args) {
		/*Comparator<Integer> c = (a,b) -> {
			if(a<b) return -1;
			else if(a>b) return 1;
			else return 0;
			};
		*/
		//Comparator<Integer> c = (a,b) -> a-b;
		
		Comparator<Integer> c = (a,b) -> (a>b)? -1: (a<b)?1:0;
		
		Comparable<Integer> d;// = (a) -> this-a;
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(25);
		l.add(5);
		l.add(0);
		l.add(15);
		l.add(20);
		
		System.out.println(l);
		Collections.sort(l,c);
		System.out.println(l);
	}

}
