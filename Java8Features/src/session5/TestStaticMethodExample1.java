package session5;


interface StaticI{
	public static void m1() {
		System.out.println("Default method of Left interface");
	}
}

/*
 * interface Right{ default void m1() {
 * System.out.println("Default method of Right interface"); } }
 */

public class TestStaticMethodExample1  implements StaticI
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticI.m1();
		//m1(); //not valid
		//TestStaticMethodExample1.m1(); not valid
		TestStaticMethodExample1 t = new TestStaticMethodExample1();
		//t.m1(); //not valid
	}

}
