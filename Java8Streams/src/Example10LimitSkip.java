import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example10LimitSkip {

    public static Optional<Integer> limit(List<Integer> integers){
        return integers.stream()
                .limit(3)
                .reduce((a,b)-> a+b);

    }

    public static Optional<Integer> skip(List<Integer> integers){
        return integers.stream()
                .skip(3)
                .reduce((a,b)-> a+b);

    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        Optional<Integer> optionalInteger = limit(integerList);
        if(optionalInteger.isPresent()){
            System.out.println("The limit result is: "+ optionalInteger.get());
        } else{
            System.out.println("No input is passed");
        }

        Optional<Integer> skipResult = skip(integerList);
        if(skipResult.isPresent()){
            System.out.println("The Skip result is: "+ skipResult.get());
        } else{
            System.out.println("No input is passed");
        }

    }
}
