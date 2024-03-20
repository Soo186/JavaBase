package API;

public class SmartPhone {
	//멤버변수(필드)
	private String company;
	private String os;
	//생성자

	public SmartPhone(String company, String os) {
		this.company = company; // 생성자의 매개변수 company와 클래스  필드 company를 구분하기 위해 this를 사용
		this.os = os;           // 생성자의 매개변수 os와 클래스 필드 os를 구분하기 위해 this를 사용
	}

	//메서드


	@Override
	public String toString() {
		return company + " . " + os;

	}
}
