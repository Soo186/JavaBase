package exceptionEx;
//은행계좌 클래스 (국민은행)

public class Account {
	//맴버변수(필드)
	String accountNO; // 계좌번호
	String ownerNmae; //예금주 이름
	int balance; //잔액

	public Account(){

	}

	public Account(String accountNO, String ownerNmae, int balance) {
		this.accountNO = accountNO;
		this.ownerNmae = ownerNmae;
		this.balance = balance;
	}


	void deposit(int amount){
		balance += amount;
	}

	int withdraw(int amount) throws InsufficientException{
		if (balance < amount){
			throw new InsufficientException ("잔고 부족 -> " + (amount - balance) + " 모자람 ");
		}else {
			balance -= amount;
			return  amount;
		}
	}

}
