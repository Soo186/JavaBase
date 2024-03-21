package application;

import java.awt.*;

public class WorkerThread extends Thread {
	@Override
	public void run() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			tool.beep();
			try {
				Thread.sleep(500);          //5번 울리고 비프음과의 대기시간은 0.5초
			} catch (InterruptedException e) {

			}
		}

	}

	}

