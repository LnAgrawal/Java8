package session5;


interface DefaultMethod{
	default void m1() {
		System.out.println("Default method in interface");
	}
	//not allowed
/*	default int hasCode() {
		return 10;
	}*/
}

public class TestDefaultMethod  implements DefaultMethod
{
	public void m1() {
		System.out.println("Default method in main");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDefaultMethod t = new TestDefaultMethod();
		t.m1();
	}

}
