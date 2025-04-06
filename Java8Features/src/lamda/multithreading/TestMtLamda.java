package lamda.multithreading;

class TestMtLamda {

	public static void main (String[] args)
	{
		Runnable r = () -> {
			for(int i=0; i < 10; i++){
				System.out.println("Child thread-1");
			}
		};

		Thread t = new Thread(r);
		t.start();
		for(int i=0; i < 10; i++){
			System.out.println("Main thread-1");
		}
	
	}
	
	
}