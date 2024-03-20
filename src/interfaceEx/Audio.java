package interfaceEx;

public class Audio implements RemoteControl {
	private int volume; // 볼륨을 저장하기 위한 인스턴스 변수
	private int memoryVolume;

	@Override
	public void turnOn() {
		System.out.println("AUDIO를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("AUDIO를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume; // 볼륨을 설정합니다.
		{
			System.out.println("현재 AUDIO 볼륨 : " + this.volume);
		}
	}

	@Override
	public void setMute(boolean mute) {
		if (mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다");
			setVolume(this.memoryVolume);
		}
	}
}