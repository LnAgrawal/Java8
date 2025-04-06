import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example17NumericStreamMapTo {
    
    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,5)
                .mapToObj(i -> {
                    return new Integer(i);
                })
                .collect(Collectors.toList());
    }
    public static long mapToLong(){
        return IntStream.rangeClosed(1,5)
                .mapToLong(i -> i)
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,5)
                .mapToDouble(d->d)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("mapToObj: " + mapToObj());

        System.out.println("mapToLong: " + mapToLong());

        System.out.println("mapToDouble: " + mapToDouble());
    }
}
