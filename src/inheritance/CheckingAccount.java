package inheritance;

public class CheckingAccount extends Account{
	//멤버 변수
	String cardNO; //카드번호

	//생성자

	public CheckingAccount() {
	}

	public CheckingAccount(String accountNO, String ownerNmae, int balance, String cardNO) {
			super(accountNO, ownerNmae, balance);
			this.cardNO = cardNO;


		}
		//카드로 지불한다. -메서드

	int pay(String cardNO , int amount) throws  Exception{
		if( !cardNO.equals(this.cardNO) || balance < amount) {      //내 카드번호랑 입력하는 같지 않다면
			throw new Exception("지불이 불가능합니다.");
		}
		return withdraw(amount);
	}
}

