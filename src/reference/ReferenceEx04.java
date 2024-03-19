package reference;

public class ReferenceEx04 {
	public static void main(String[] args) {
		String ssn = "9710121234567";
		System.out.println("총 글자수=" + ssn.length());
		int len = ssn.length();
		if(len == 13){
			System.out.println("주민번호 자리 수가 맞습니다.");
		}else {
			System.out.println("주민번호 자리 수가 틀립니다.");

		}

	}

}
