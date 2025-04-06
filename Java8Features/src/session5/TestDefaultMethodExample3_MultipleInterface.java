package session5;


interface Left{
	default void m1() {
		System.out.println("Default method of Left interface");
	}
}

interface Right{
	default void m1() {
		System.out.println("Default method of Right interface");
	}
}

public class TestDefaultMethodExample3_MultipleInterface  implements Left,Right
{
	public void m1() {
		//System.out.println("Default method in main");
		
		//Left.super.m1();
		Right.super.m1();
	}
	public void m2() {
		//System.out.println("Default method in main");
		
		//Left.super.m1();
		Left.super.m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDefaultMethodExample3_MultipleInterface t = new TestDefaultMethodExample3_MultipleInterface();
		t.m1();
		t.m2();
	}

}
