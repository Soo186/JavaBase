package interfaceEx;

public class SmartTv implements RemoteControl, Searchable {
	private int volume; // 볼륨을 저장하기 위한 인스턴스 변수

	@Override
	public void search(String url) {
		System.out.println("URL을 검색합니다: " + url);
	}

	@Override
	public void turnOn() {
		System.out.println("Smart TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Smart TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;       //아무리 올려서 맥스랑 똑같게 볼륨이 설정됨.
		} else if (volume < RemoteControl.MIN_VOLUME) {

			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}

	}
}


