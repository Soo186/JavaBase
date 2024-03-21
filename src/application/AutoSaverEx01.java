package application;

public class AutoSaverEx01 {
	public static void main(String[] args) {
		AutoSaveThread autoSave = new AutoSaveThread();
		autoSave.setDaemon(true);      //main이 종료되면 autosave도 종료(지원 용도)
		autoSave.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}
		int sum=0;
		for (int i = 0; i < 101; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합="+ sum);

	} //main End
}
