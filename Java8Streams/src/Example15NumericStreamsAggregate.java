import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Example15NumericStreamsAggregate {
    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Sum: "+ sum);

        OptionalInt maxOptional = IntStream.rangeClosed(1,50).max();
        System.out.println("Max value is : "+maxOptional);

        OptionalLong minOptional =  LongStream.rangeClosed(50,100).min();
        System.out.println("Min value is : "+minOptional);

        OptionalDouble average = IntStream.rangeClosed(1, 50).average();
        System.out.println(average.isPresent()?average.getAsDouble(): 0);

    }
}
