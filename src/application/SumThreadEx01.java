package application;

public class SumThreadEx01 {
	public static void main(String[] args) {
		SumThread sumthread = new SumThread();
		sumthread.start();
		try {
			sumthread.join(); // 스레드가 종료될 때까지 대기
		} catch (InterruptedException e) {

		}


		System.out.println("1부터 100까지의 합=" + sumthread.getSum());    //start와 동시에 출력돼서 합의 값 출력 x
	}
}
