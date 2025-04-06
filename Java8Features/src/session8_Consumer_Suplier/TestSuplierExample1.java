package session8_Consumer_Suplier;

import java.util.Date;
import java.util.function.Supplier;

public class TestSuplierExample1 {
	public static Supplier<String> s;
	public static void main(String[] args) {
		Supplier<Date> s = () -> new Date();
		
		System.out.println(s.get());
	}
}
