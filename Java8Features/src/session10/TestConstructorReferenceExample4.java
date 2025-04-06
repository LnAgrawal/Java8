package session10;

class Sample{
	Sample(){
		System.out.println("Sample class constructor");
	}
	Sample(int a, int b){
		System.out.println("Sample class constructor, a: "+a + " b: "+b);
	}
}

//@FunctionalInterface
interface InterC {
	//public Sample get();
	public Sample get(int a, int b);
}

public class TestConstructorReferenceExample4 {
	
	public static void main(String[] args) {
		InterC ic = Sample::new;
		Sample s1= ic.get(10,20);
	}

}
