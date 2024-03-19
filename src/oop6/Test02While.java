package oop6;

public class Test02While {
	public static void main(String[] args) {
		// while문과 do~while문 차이

		int a = 3;
		while (a<=0) {//(3<=0)
			System.out.println("SEOUL");
			a = a + 1;
		}
			System.out.println(a);

		int b=3;
		do{
			System.out.println("BUSAN");
			b = b + 1;
		}while (b<=0);

		System.out.println(b);



	}
}
