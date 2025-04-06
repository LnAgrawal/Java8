package session8_Consumer_Suplier;

import java.security.SecureRandom;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestSuplierPassword {
    public static void main(String[] args) {
        SecureRandom random= new SecureRandom();
        String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#@!";
        Supplier<Integer> digit = () -> random.nextInt(10);
        Supplier<Character> character = () -> data.charAt(random.nextInt(29));
        Predicate<Integer> p = I -> I%2==0;

        String password =
                IntStream.range(0,8)
                .mapToObj(i -> {
                    if(p.test(i)){
                        return character.get();
                    } else {
                        return digit.get();
                    }
                })
                       .map(String::valueOf)
        //        .forEach(System.out::println);
                        .collect(Collectors.joining());
      System.out.println(password);
    }
}
