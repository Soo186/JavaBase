package object_class;

public class AccountEx02 {
	public static void main(String[] args) {
		Account chanho = new Account("222-33-1111" , "박찬호" , 0);
		Account gildong = new Account("555-77-88888" , "홍길동" , 500);
		Account minho = new Account("222-333-7777","강민호" ,700  );
		chanho.deposit(1000);
		try {
			gildong.withdraw(150);
			accountPrint(chanho);
			accountPrint(gildong);
			accountPrint(minho);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	//통장 내역 출력 메서드
	static void accountPrint(Account obj){//메서드를 따로 만들어서 한번에 춣력하게끔.
		System.out.println("거래은행 : " + Account.BANKNAME);
		System.out.println("계좌번호: " + obj.accountNo);
		System.out.println("예금주 이름 : "  + obj.ownerName);
		System.out.println("잔액 :" + obj.balance);
		System.out.println(" ============");
	}
}
