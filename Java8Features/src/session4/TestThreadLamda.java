package session4;

public class TestThreadLamda {
	public static void main(String[] args) {
		
		/*Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i <10; i++) {
					System.out.println("child ");
				}
				
			}
		};*/
		Runnable r = () -> {
			for(int i=0; i <10; i++) {
				System.out.println("child ");
			}
		};
		
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i <10; i++) {
			System.out.println("Main ");
		}
	}
}
