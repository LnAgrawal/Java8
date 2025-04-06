package Java8_parallelstreams;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

public class ParallelStreamExample1 {

	public static void main(String[] args) {
		
		ForkJoinPool cores = ForkJoinPool.commonPool();
		System.out.println("No of Core: "+ cores.getParallelism());//3
		
		System.out.println("--------------------");
		Stream<String> stream = Stream.of("1","2","3","4","5");//,"6","7","8","9","10");
		stream.forEach(System.out::println);
		System.out.println("--------------------");
		
		///Apply parallel() method on Stream object
		//stream.parallel().forEach(System.out::println); using this is giving java.lang.IllegalStateException: stream has already been operated upon or closed
		 Stream.of("1","2","3","4","5").parallel().forEach(System.out::println);
		 System.out.println("--------------------");
		 
		 //2. using parallel streams on collection
		 Arrays.asList("1","2","3","4","5").parallelStream().forEach(System.out::println);
		
		 ///
	}

}
