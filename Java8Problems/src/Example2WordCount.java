import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example2WordCount {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "orange", "pear", "kiwi", "kiwi", "banana");

        words.stream()

                .collect(Collectors.groupingBy(Function.identity(), TreeMap::new,Collectors.counting()))
                .forEach((k,v)-> System.out.println(k + "-"+v));
                ;/*
                .entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(e->System.out.println(e.getKey()+"-"+e.getValue()));*/
        /**
         * Group by Word length
         */
        System.out.println(words.stream()
                //.collect(Collectors.groupingBy(s->s.length()))
                .collect(Collectors.groupingBy(String::length))
        );

    }
}
