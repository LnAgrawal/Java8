package lamda.functionalinterface;

public class FIImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		//FunctionalInterfaceExample fi = (x,y) -> System.out.println("Sum: "+(x+y));
		FunctionalInterfaceExample fi = x -> x*x;
		
		System.out.println(fi.squareIt(a));
		
		
	}

}
