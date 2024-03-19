package reference;

public class ReferenceEx02 {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";
		if (str1 == str2){
			System.out.println("str1과 str2는 참조 주소가 같음");
		} else{
			System.out.println("str1과 str2는 참조가 다름");
		}
		if (str1.equals(str2)){
			System.out.println("str1과 str2는 문자열이 같음");
		}

		String str3 = "김철수";
		String str4 = new String("김철수");   //새로운 번지수를 입력
		if (str3 == str4){
			System.out.println("str3과 str4는 참조 주소가 같음");
		} else{
			System.out.println("str3과 str4는 참조가 다름");
		}
		System.out.println("str3과 str4는 문자열이 같음");

	}
				}
