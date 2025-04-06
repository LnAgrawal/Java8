package Java8_parallelstreams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamPrimeNumberExample4 {

	public static void main(String[] args) {
		
		/*
		//System.out.println(isPrimeNumber(9));
		Date startDate = new Date();
		System.out.println("Sequential Start: " +  (new Date()));
		long countSequential = Stream.iterate(0, n-> n+1)
					.limit(1000000)
					.filter(ParallelStreamPrimeNumberExample4::isPrimeNumber)
					.peek(x -> System.out.println(x))
					.count();
		Date endDate = new Date();
		System.out.println("Sequential Start: "+ startDate + " Sequential End: " +  (new Date()) + " Count: "+countSequential);
		
		//output: Sequential Start: Sat May 29 13:33:24 IST 2021 Sequential End: Sat May 29 13:35:36 IST 2021 Count: 78498
		*/
		//Parallel Start: Sat May 29 13:36:30 IST 2021 Parallel End: Sat May 29 13:38:01 IST 2021 Count: 78498
		
		Date startDate = new Date();
		System.out.println("Parallel Start: " +  (new Date()));
		long countSequential = Stream.iterate(0, n-> n+1)
					.limit(1000000)
					.parallel()
					.filter(ParallelStreamPrimeNumberExample4::isPrimeNumber)
					.peek(x -> System.out.println(x))
					.count();
		Date endDate = new Date();
		System.out.println("Parallel Start: "+ startDate + " Parallel End: " +  (new Date()) + " Count: "+countSequential);
		//Parallel Start: Sat May 29 13:36:30 IST 2021 Parallel End: Sat May 29 13:38:01 IST 2021 Count: 78498
	}
	
	public static boolean isPrimeNumber(int number)
	{
		if(number <=1 )
			return false;
		return !IntStream.rangeClosed(2, number/2).anyMatch(x -> number%x==0);
		
	}

}
