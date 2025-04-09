import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example5ReduceSumOfArray {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        Integer reduce = integerList.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(reduce);
        
        int[] intArray= {1,2,3,4,5};
        Arrays.stream(intArray)
                .reduce(0, (a,b)-> a+b);

    }
}
