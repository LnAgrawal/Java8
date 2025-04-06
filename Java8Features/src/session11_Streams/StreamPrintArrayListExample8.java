package session11_Streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrintArrayListExample8 {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(80);
		marks.add(15);
		marks.add(30);
		marks.add(55);
		marks.add(45);
		marks.add(90);
		
		//1. In java 8 print using foreach and Lamda expression
		marks.forEach(mark -> System.out.println(mark));
		
		System.out.println("---------Print using For each and method reference");		
		//2. In java 8 print using foreach and method reference
		marks.forEach(System.out::println);
		
		System.out.println("Print using Iterator");
		//3. Using Iterator
		Iterator<Integer> it = marks.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//4. user iterator and Java 8 forEachRemaining() method
		System.out.println("---------Print using Ierator and Java8 and forEachRemaining");
		 it = marks.iterator();
		 
		 it.forEachRemaining(System.out::println);
		
		 System.out.println("---------Print using for each");
		 //5. using for each loop
		 for(Integer i :  marks) {
			 System.out.println(i);
		 }
		 
		 System.out.println("---------Print using for loop with order/index ");
		 //6. using for with order/index
		 for(Integer i :  marks) {
			 System.out.println(i);
		 }
		 

		 System.out.println("---------Print using listIterator");
		 //7. using for with order/index
		 ListIterator<Integer> li = marks.listIterator();
		 while(li.hasNext()) {
			 System.out.println(li.next());
		 }
		 System.out.println("---------Print decending"); 
		 ListIterator<Integer> li1 = marks.listIterator(marks.size());
		 while(li1.hasPrevious())// this will only work if we provide size of the al in the listIterator constructor 
		 {
			 System.out.println(li1.previous());
		 }
		 
	}

}
