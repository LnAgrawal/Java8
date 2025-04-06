package session10;

public class TestRunnableExample1 {
	
	public static void m1()
	{
		for(int i=0; i< 10;i++) {
			System.out.println("Child thread");
		}
	}
	
	public void m2()
	{
		for(int i=0; i< 10;i++) {
			System.out.println("Child thread");
		}
	}
	public static void main(String[] args) {
		//Lamda expression
	/*	Runnable r  = () -> {
				for(int i=0; i< 10;i++) {
					System.out.println("Child thread");
				}
		};*/
		
		//Method reference
		//Runnable r  = TestRunnableExample1::m1;
		TestRunnableExample1 test = new TestRunnableExample1();
		Runnable r  = test::m2;
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i< 10;i++) {
			System.out.println("main thread");
		}
	}

}
