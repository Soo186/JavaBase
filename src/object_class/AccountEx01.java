package object_class;

public class AccountEx01 {
	public static void main(String[] args) {
		Account chulsu= new Account(); // 'chulsu' 라는 객체 선언 + 'chulsu' 인스턴스 객체 생성
		Account hee = new Account();   // 'hee'       ""       +      ""
		chulsu.accountNo = "111-22-33333";
		chulsu.ownerName = "김철수";
		chulsu.balance =100;

		hee.accountNo = "111-22-55555";
		hee.ownerName = "이영희";
		hee.balance = 10;
		chulsu.deposit(500);
		hee.deposit(1250);
		try {
			int amount = hee.withdraw(420);
			System.out.println("인출한 금액=" + amount);
			System.out.println("잔액(이영희)=" + hee.balance);  //try 블록은 정상적으로 수행할 수 있을 때
		}catch (Exception e){
			System.out.println(e.getMessage());       //try catch 안하게 되면 상위 메소드로 전파돼서 안됨 !
		}

	}


}

