package application;

//합을 구하는 프로세스
public class SumThread extends Thread {
	 private int sum;

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			sum +=i;

		}
	}
}
