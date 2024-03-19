package inheritance;

public class CheckingAccountEx01 {
	public static void main(String[] args) {
		CheckingAccount gildong = new CheckingAccount("111-22-55555" , "홍길동" ,
				100 , "111-22-55555");

		gildong.deposit(5000);
		try {
			int paidAmount = gildong.pay("111-22-55555", 3000);
			System.out.println("지불액 : " + paidAmount );
			System.out.println("잔액 : " + gildong.balance);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}


	}
}
