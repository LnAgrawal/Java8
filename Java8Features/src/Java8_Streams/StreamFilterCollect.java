package Java8_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {
	public static void main(String[] args)
	{
		List<String> al = Arrays.asList("One","Two","Three","Four", "Five");
		System.out.println("My List: "+ al);
		//exclude four
		List<String> result = al.
								stream()
								.filter(ele -> !ele.equals("Four"))
								.collect(Collectors.toList());
		
		result.forEach(ele -> System.out.println(ele));						
			
	}
	
}
