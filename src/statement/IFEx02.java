package statement;

import java.util.Scanner;

public class IFEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구입할 수량을 입력 >");
		int amount = sc.nextInt();
		int price = 5000; 
		String memo="(정상가)";
		
		if(amount >= 10) {
			price *= 0.8;  //(int) (price * 0.8);
			memo = "(할인가)";
			
		}
		
		int salesPrice = amount * price;
		System.out.println("총 구입 금액=" + salesPrice + memo);
		
		
	
	}
}
	