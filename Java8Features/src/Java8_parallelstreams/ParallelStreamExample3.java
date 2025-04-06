package Java8_parallelstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample3 {

	public static void main(String[] args) {
		
		/*
		 * ForkJoinPool cores = ForkJoinPool.commonPool();
		 * System.out.println("No of Core: "+ cores.getParallelism());//3
		 * 
		 * System.out.println("--------------------"); Stream<String> stream =
		 * Stream.of("1","2","3","4","5");//,"6","7","8","9","10");
		 * stream.forEach(System.out::println);
		 * System.out.println("--------------------");
		 * 
		 * ///Apply parallel() method on Stream object
		 * //stream.parallel().forEach(System.out::println); using this is giving
		 * java.lang.IllegalStateException: stream has already been operated upon or
		 * closed
		 * Stream.of("1","2","3","4","5").parallel().forEach(System.out::println);
		 * System.out.println("--------------------");
		 * 
		 * //2. using parallel streams on collection
		 * Arrays.asList("1","2","3","4","5").parallelStream().forEach(System.out::
		 * println);
		 * 
		 * ///
		 
		//Print number 1 to 10 using Sequential and parallel stream
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		System.out.println("--------------------");
		IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
		
		
		//print a-z
		System.out.println(getAlphabetList());
		System.out.println("--------------------");
		getAlphabetList().stream().forEach(System.out::println);
		
		System.out.println("--------------------");
		getAlphabetList().parallelStream().forEach(System.out::println);*/	
		
		//To check if the Stream is parallel or not
		
		IntStream se = IntStream.rangeClosed(1, 5);
		
		
		IntStream ps = IntStream.rangeClosed(1, 5).parallel();
		System.out.println("Sequential: "+se.isParallel());
		System.out.println("Parallel: "+ps.isParallel());
		
		
		
	}
	
	public static List<String> getAlphabetList()
	{
		List<String> al = new ArrayList<String>();
		int n = 97;
		
		while (n<=122)
		{
			al.add(String.valueOf((char) n));
			n++;
		}
		
		return al;
		
	}

}
