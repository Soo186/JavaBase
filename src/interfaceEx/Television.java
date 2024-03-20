package interfaceEx;

public class Television implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");

	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME){
			this.volume = RemoteControl.MAX_VOLUME;       //아무리 올려서 맥스랑 똑같게 볼륨이 설정됨.
		}else if (volume < RemoteControl.MIN_VOLUME) {

			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);


	}
}
