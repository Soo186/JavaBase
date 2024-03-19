package reference;

import java.io.OutputStream;

public class ReferenceEx05 {
	public static void main(String[] args) {
		String str = "우리나라 파이팅";
		String newStr = str.replace("우리나라", "대한민국"); //우리나라를 대한민국으로 대체
		System.out.println(newStr);
		System.out.println(str);
		String str2 = "computer";
		System.out.println(str2.substring(5)); //5번째 문자부터 가져옴 ex) ter
		System.out.println(str2.substring(3,6)); //  3번쨰 문자부터 6번째 전까지 ex)put
		String ssn = "950505-2333355";
		System.out.println("주민등록번호: " + ssn.substring(0,7) + "*******");


	}
}
