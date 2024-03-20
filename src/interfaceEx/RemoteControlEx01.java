package interfaceEx;

public class RemoteControlEx01 {
	public static void main(String[] args) {


		RemoteControl rc; //선언
		rc = new Television(); //인스턴스 객체 생성
		rc.turnOn();
		rc.setVolume(7);
		rc.turnOff();
		rc = new Audio();      //인스턴스 객체 생성
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.setMute(false);
		RemoteControl.changeBattery();   //정적 메서드는 인스턴스화 없이 바로 호출 가능
		rc.turnOff();


	}
}
