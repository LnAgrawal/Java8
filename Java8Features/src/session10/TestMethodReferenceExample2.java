package session10;

@FunctionalInterface
interface InterF {
	public void add(int a, int b);
}

public class TestMethodReferenceExample2 {
	public static void sum(int x, int y)
	{
		System.out.println("The Sum is: "+(x+y));
	}
	
	public static void main(String[] args) {
		//InterF i = (a,b) -> System.out.println("The Sum is: "+(a+b));
		InterF i = TestMethodReferenceExample2::sum;
		i.add(10,20);
	}

}
