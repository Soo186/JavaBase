package operator;

import java.util.Scanner;

public class OperatorEx11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("근속연수를 입력 >>");
		int year = sc.nextInt();
		
		int result = (year >= 5)? year*2 :3;
		System.out.println("휴가 일수는"+ result+"일 입니다");
		
		
		
		 
		
		
	
	}
}






