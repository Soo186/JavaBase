package inheritance;

public class DokodoAccountEx01 {
	public static void main(String[] args) {
		DokdoAccount chulsu = new DokdoAccount("555-22-77777" , "김철수" ,
		0 , 0);
		chulsu.deposit(50000);
		System.out.println(chulsu.balance);
		System.out.println(chulsu.point);
		chulsu.deposit(20000);
		System.out.println(chulsu.balance);
		System.out.println(chulsu.point);

	}
}
