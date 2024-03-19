package inheritance;
//은행 계좌 클래스 (특별상품)

public class DokdoAccount extends Account {
	//멤버 변수 (필드)
	int point; //독도에 기부되는 포인트
	public DokdoAccount(String accountNO, String ownerNmae, int balance, int point) {   //생성자 호출
		super(accountNO, ownerNmae, balance);
		this.point = point;

		//메서드 재정의
	}
	@Override
	void deposit(int amount) {
		super.deposit(amount);
		point += amount * 0.001;
	}
}


