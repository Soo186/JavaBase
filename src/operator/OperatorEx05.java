package operator;

import java.util.Scanner;

public class OperatorEx05 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("구입할 수량을 입력>>");
		int num = sc.nextInt();
		int price = 1500;
		System.out.println("총 구입금액=" + num*price);
	
	}
}