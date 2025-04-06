package session4;

public class TestAnonymousClass {
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i <10; i++) {
					System.out.println("child ");
				}
				
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i <10; i++) {
			System.out.println("Main ");
		}
	}
}
