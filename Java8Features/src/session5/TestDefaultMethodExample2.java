package session5;


interface DefaultMethodE2{
	default void m1() {
		System.out.println("Default method in interface");
	}
}

public class TestDefaultMethodExample2  implements DefaultMethodE2
{
	public void m1() {
		System.out.println("Default method in main");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDefaultMethodExample2 t = new TestDefaultMethodExample2();
		t.m1();
	}

}
