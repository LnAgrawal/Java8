package session8_Consumer_Suplier;

import java.util.function.Consumer;

class Movie{
	String name;
	Movie(String name){
		this.name = name;
	}
}
public class TestConsumerExample2 {
	
	public static void main(String[] args) {
		Consumer<Movie> ready = m -> System.out.println(m.name + " is ready to release.");
		Consumer<Movie> flop = m -> System.out.println(m.name + " is flop.");
		Consumer<Movie> info = m -> System.out.println(m.name + " is storing in DB.");
		Consumer<Movie> cc = ready.andThen(flop).andThen(info);
		Movie m = new Movie("Spider");
		cc.accept(m);
	}
}
