package session5;


interface InternI{
	public static void main(String[] args) {
		System.out.println("main method in interface");
	}
}

/*
 * interface Right{ default void m1() {
 * System.out.println("Default method of Right interface"); } }
 */

public class TestStaticMethodExample3  implements InternI
{
	
	public static void main(String[] args) {
		InternI.main(null);
		System.out.println("My main");
		// TODO Auto-generated method stub
		
		//StaticI.m1();
		//m1(); //not valid
		//TestStaticMethodExample1.m1(); not valid
		//TestStaticMethodExample3 t = new TestStaticMethodExample3();
		//t.m1(); //not valid
	}

}
