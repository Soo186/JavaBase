package statement;

import java.util.Scanner;

public class IFEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" 수량을 입력 >> ");
		int amount = sc.nextInt();
		
		System.out.print(" 단가를 입력 >> ");
		int price = sc.nextInt();
		
		if( amount >= 10 && price >= 1000) {           // 논리 연산자 이용하여, 조건 2개 제시 두개 다 참일경우만 실행
			price *= 0.8;                              // 복합 연산자는 자동으로 형변환	
		
		}
		
		int salesPrice = amount * price;
		System.out.println(salesPrice);
	
	}
}
	