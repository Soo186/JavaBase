package interfaceEx;

public class SmarTvEx01 {
	public static void main(String[] args) {
		RemoteControl rc = new SmartTv(); //스마트 티비를 제어
		rc.turnOn();
		rc.setVolume(5);
		Searchable sa = new SmartTv();
		sa.search("http:/www.naver.com");
		rc.turnOff();


	}
}
