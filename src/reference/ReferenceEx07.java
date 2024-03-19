package reference;

public class ReferenceEx07 {
	public static void main(String[] args) {
		String str = " 김철수 , 이영희 , 홍길동 , 박찬호 , 이영표";
		String[] names = str.split(" ,"); //,를 통해서 분리
		System.out.println("***출석자 명단****");
		for (int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + "번:" + names[i] );



		}

	}
}
