package session9_MultiFunction;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class TestIntToDoubleFunction {

    public static void main(String[] args) {

        IntFunction<Integer> f1 = I -> I*2;

        ToIntFunction<String> f2 = S -> S.length();

        IntToDoubleFunction f3 = i -> Math.sqrt(i);

        System.out.println(f1.apply(5));

        System.out.println(f2.applyAsInt("Hello"));

        System.out.println(f3.applyAsDouble(5));



    }
}
