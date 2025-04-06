package session8_Consumer_Suplier;

import java.util.function.Consumer;

public class TestConsumerExample1 {
	
	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("laxmi");
		
	}
}
