package inheritance;
//은행계좌 클래스 (국민은행)

import object_class.PhysicalInfo;

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

	int withdraw(int amount) throws Exception{
		if (balance < amount){
			throw new Exception("잔액이 부족합니다.");
		}else {
			balance -= amount;
			return  amount;
		}
	}

}
