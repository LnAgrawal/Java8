import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example1DuplicateElementsInIntegerList {
    public static void main(String[] args) {
        //Brute Force approach
        List<Integer> integerList = Arrays.asList(1,2,2,3,4,5,5);
        List<Integer> value =  integerList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e-> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(value);

        //Optimized CHatGBT
        //List<Integer> integerList = Arrays.asList(1, 2, 2, 3, 4, 5, 5);
        List<Integer> value1 = integerList.stream()
                .filter(i -> Collections.frequency(integerList, i) > 1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(value1);
    }
}