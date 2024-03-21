package API;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx01{
	public static void main(String[] args) {
		// 정규표현식
		Scanner mysc = new Scanner(System.in);
		System.out.print("전화번호 입력 : ");
		String phoneNumber = mysc.next();
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";          // \ 숫자를 써야된다는 정규표현식 기호
		boolean result = Pattern.matches(regExp , phoneNumber);
		if (result){
			System.out.println("올바른 전화번호입니다.");
		}else{
			System.out.println("전화번호 형식이 아닙니다");
		}
		System.out.println("이메일 입력 : ");

		String email = mysc.next();
		String regEx = "\\w+@\\w+\\.\\w+(\\.\\w+)?";     // ? == optional | zero or one
		result = Pattern.matches(regEx, email);
		if (result){
			System.out.println("올바른 이메일 주소입니다");
		}else {
			System.out.println("이메일 주소형식이 아닙니다");
		}




	}
}
