package Java8_Streams_FlatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsArrayWithFlatMap {

	public static void main(String[] args) {
		String[][] data = new String[][] {
			{"a","b"},
			{"c","d"},
			{"e","f"},
			{"g","h"}
		};
		
 
		Stream<String[]> streamsArray = Arrays.stream(data);
		/**************************
		//no output as this is not allowed
		Stream<String[]> streamsFilterArray = streamsArray.filter(x-> "a".equals(x.toString()));
		streamsFilterArray.forEach(System.out::println); // no output
		*****************/
		//We need to use flatmap
		
		Stream<String> flatmapStream = streamsArray.flatMap(x-> Arrays.stream(x));
		Stream<String> dataStreamsFilterArray = flatmapStream.filter(x-> "a".equals(x.toString()));
		dataStreamsFilterArray.forEach(System.out::println); // now we're getting the output
		
		//other way
		
		Arrays.stream(data).flatMap(x-> Arrays.stream(x)).filter(x-> "a".equals(x.toString())).forEach(System.out::println);
		
		
		
	}

}
