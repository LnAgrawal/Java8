package session11_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToArrayExample7 {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(70);
		marks.add(80);
		marks.add(15);
		marks.add(30);
		marks.add(55);
		marks.add(45);
		marks.add(90);
		System.out.println(marks);
		//find even
		//ArrayList<Integer> marks2 = (ArrayList<Integer>) marks.stream().filter(i-> i%2==0).collect(Collectors.toList());
		//IntUnaryOperator u = i -> i*2;
		//Double each elemetns
		//List<Integer> marks2 = marks.stream().map(i-> i*2).collect(Collectors.toList());
		//List<Integer> marks2 = marks.stream().map(i-> u.applyAsInt(i)).collect(Collectors.toList());
		
		//Find no. of failed students
		//long noOfFailedStudents = marks.stream().filter(i-> i<35).count();
		//System.out.println(noOfFailedStudents);
		
		//Sorting of the list
		//List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
		///List<Integer> sortedList = marks.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		//System.out.println(sortedList);
		
		//min
		//Integer min = marks.stream().min((i1,i2)-> i1-i2).get();
		//System.out.println(min);
		
		//max
		//Integer max = marks.stream().min((i1,i2)-> i2-i1).get();
		//System.out.println(max);
		
		//Print elements of the list
		//marks.stream().forEach(System.out::println);
		
		//toArray
		Integer[] i = marks.stream().toArray(Integer[]::new);
		for(Integer i1 : i)
		{
			System.out.println(i1);
		}
		
		Stream.of(i).forEach(System.out::println);
		
	}

}
