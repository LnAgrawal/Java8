import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example6GreatestCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       //  = new ArrayList<>();
        int maxCandies = Arrays.stream(candies)
                .max().getAsInt();

        List<Boolean> result =  Arrays.stream(candies)
                .mapToObj(c -> {
                    if (c + extraCandies >= maxCandies) {
                        return true;
                    } else
                        return false;

                }).collect(Collectors.toList());


        return result;

    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));

        int[]candies1 = {4,2,1,1,2};
        extraCandies = 1;
        System.out.println(kidsWithCandies(candies1, extraCandies));



    }

}
