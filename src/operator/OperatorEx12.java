package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OperatorEx12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 금액을 입력 >>");
		int price= sc.nextInt();
		
		DecimalFormat df = new DecimalFormat("#,###");
		double discountRate = (price >= 10000) ? 0.2: 0.1; // 할인율 따로 계산
		
		int discountPrice = price - (int) (price * discountRate); //정수 값만 캐스팅
		System.out.println("상품의 가격은"+df.format(price)+"이고"+ "할인율을 적용하여" + df.format(discountPrice)+ "에 구입가능합니다");
		
		
		
		 
		
		
	
	}
}






