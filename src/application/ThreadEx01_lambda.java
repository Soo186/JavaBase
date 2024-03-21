package application;

import java.awt.*;

public class ThreadEx01_lambda {
	public static void main(String[] args) {
		Toolkit tool = Toolkit.getDefaultToolkit();  //Toolkit이란 클래스의 tool변수 할당해서쓰고 //Toolkit객체에 toolkit메서드 소환
		Thread thread = new Thread(() -> {       //Thread클래스는 멀티로 실행할 때 용이
				for (int i = 0; i < 5; i++) {
					tool.beep();
					try {
						Thread.sleep(500);          //5번 울리고 비프음과의 대기시간은 0.5초
					} catch (InterruptedException e) {

					}
				}

		});
		thread.start();     //위의 프로세스를 실행하시오


		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);          //5번 울리고 비프음과의 대기시간은 0.5초
			} catch (InterruptedException e) {

			}

		}

	}
}
