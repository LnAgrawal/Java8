import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example9StreamsMaxMin {

    public static int findMaxValue(List<Integer> integerList){
        return
        integerList.stream()
                .reduce(0,(x,y)-> x>y?x:y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){
        return
                integerList.stream()
                        .reduce((x,y)-> x>y?x:y);
    }

    public static int findMinValue(List<Integer> integerList){
        return
                integerList.stream()
                        .reduce(0,(x,y)-> x<y?x:y);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){
        return
                integerList.stream()
                        .reduce((x,y)-> x<y?x:y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        System.out.println("The max value is " + findMaxValue(integerList));

        Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
        if(maxValueOptional.isPresent()){
            System.out.println("Max value using optional: "+ maxValueOptional.get());
        } else {
            System.out.println("Input list is empty");
        }

        System.out.println("The min value is " + findMinValue(integerList)); //giving wrong value

        Optional<Integer> minValueOptional = findMinValueOptional(new ArrayList<>());// findMinValueOptional(integerList);
        if(minValueOptional.isPresent()){
            System.out.println("Min value using optional: "+ minValueOptional.get());
        } else {
            System.out.println("Input list is empty");
        }

    }

}
