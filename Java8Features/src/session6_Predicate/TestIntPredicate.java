package session6_Predicate;

import java.util.function.IntPredicate;

public class TestIntPredicate {
    public static void main(String[] args) {

        IntPredicate p = I -> I%2==0;

        System.out.println(p.test(1));

    }
}
