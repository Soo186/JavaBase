package inheritance;
//마이너스 통장 클래스

public class CreditLineAccount extends Account {
	//멤버 변수(필드)
	int creditLine; //마이너스 한도
	//생성자






	public CreditLineAccount(String accountNO, String ownerNmae, int balance, int creditLine) {
		super(accountNO, ownerNmae, balance);
		this.creditLine = creditLine;
	}
	//인출한다 메서드 (재정의)

	@Override
	int withdraw(int amount) throws Exception {
		if ((balance + creditLine) < amount){
			throw new Exception("인출이 불가능합니다.");
		}
		balance -= amount;
		return amount;
	}
}
