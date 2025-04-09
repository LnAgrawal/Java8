import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3CharacterFrequency {
    public static void main(String[] args) {
        String data = "HelloworldSh";

        Map<Character,Long> longMap =  data.toLowerCase().chars()
                .mapToObj(c -> {
                    return (char) c;
                })

                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(longMap);
    }
}
