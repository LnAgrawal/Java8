import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example7ReverseWordInString {
    public static void main(String[] args) {
        String s = "a good   example";
        String[] data = s.split(" ");
        int len = data.length;
       String result = IntStream.range(0, len )
               .mapToObj(i->{
                   return data[len-1-i];
               })
               .filter(f -> !f.isEmpty())
               .collect(Collectors.joining(" "));
                System.out.println(result);


    }
}
