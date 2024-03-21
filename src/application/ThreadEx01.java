package application;

import java.awt.Toolkit;

public class ThreadEx01 {
	public static void main(String[] args) {
		Toolkit tool = Toolkit.getDefaultToolkit();  //Toolkit이란 클래스의 tool변수 할당해서쓰고 //Toolkit객체에 toolkit메서드 소환
		for (int i = 0; i < 5; i++) {
			tool.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}

	}
}
