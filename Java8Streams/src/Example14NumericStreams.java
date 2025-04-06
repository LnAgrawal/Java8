import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Example14NumericStreams {
    public static int sumOfNumbers(List<Integer> integerList){
        return integerList.stream()
                .reduce(0, (x,y)-> x+y);
    }

    public static int sumOfNumbersIntStream(){
        return IntStream.rangeClosed(1,6)
                .sum();
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        System.out.println("Sum of N numbers: " + sumOfNumbers(integerList));

        System.out.println("Sum of N numbers using intStream: " + sumOfNumbersIntStream());

        ///
        IntStream intStream = IntStream.range(1,50);
        System.out.println("IntStream Range Count: " + intStream.count());

        System.out.println("IntStream RangeClosed Count: "+ IntStream.rangeClosed(1,50).count());

        LongStream longStream = LongStream.range(1,50);
        System.out.println("longStream Range Count: " + longStream.count());

        System.out.println("longStream RangeClosed Count: "+ LongStream.rangeClosed(1,50).count());
        System.out.println();
        IntStream.rangeClosed(1,50).asDoubleStream().forEach(value-> System.out.print(value + ","));

    }
}
