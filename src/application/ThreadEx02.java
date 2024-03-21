package application;

public class ThreadEx02{
	public static void main(String[] args) {
		Thread thread = new WorkerThread();
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);          // 0.5초씩 찍힘.
			} catch (InterruptedException e) {

			}

		}


	}
}
