package exceptionEx;

public class ExceptionEx03 {
	public static void main(String[] args) {
		Account chulsu = new Account("111-222-445" , "김철수" , 500 );
		chulsu.deposit(3000);
		try {
			int amount = chulsu.withdraw(5000);
			System.out.println("인출금액 = " + amount);
		} catch (InsufficientException e) {
			System.out.println(e.getMessage());

		}

	}
}
