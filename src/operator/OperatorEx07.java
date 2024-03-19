package operator;

import java.util.Scanner;

public class OperatorEx07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원을 입력 >>");
		int num = sc.nextInt();
		int product = 100;
		try {
		int result = product / num;
			System.out.println("일 인당 개수=" + result); //정상적으로 처리가 된 경우 실행
	
		}catch (Exception e) {
			System.out.println("0으로 나누지 마세요"); // 예외가 발생했을 경우 실행
		}
		
		
		
		
	}
	}