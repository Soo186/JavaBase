package Project;

public class Test01 {
	public static void main(String[] args) {
		int money = 54320;

		//만원 개수 (5장)
		int m = money / 10000;
		money = money % 10000;

		//천원 개수 (4장)
		int c = money / 1000;
		money = money % 1000;

		//백원 개수 (3장)
		int b = money / 100;
		money = money % 100;

		//십원 개수  (2장)
		int s = money / 10;

		System.out.println("만원"+m+"장");
		System.out.println("천원"+c+"장");
		System.out.println("백원"+b+"장");
		System.out.println("십원"+s+"장");




;
	}
	}

