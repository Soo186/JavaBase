package application;

import java.util.List;
import java.util.Vector;

public class VectorEx01 {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();

		Thread threadA = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					list.add(new Board("안녕"+i , "모두 파이팅"+i, "홍길동"));
				}
			}
		};

		Thread threadB = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					list.add(new Board("잘가"+i , "모두 굿바이"+i, "김철수"));

				}
			}
		};

		threadA.start();
		threadB.start();
		try {
			threadA.join();     //지금 이 스레드가 끝날때까지 기다려주셈
			threadB.join();
		}catch (InterruptedException e){

		};
		System.out.println("총 게시글 수 : " + list.size());

	}
}
