package reference;

public class ReferenceEx09 {
	static final int MAX = 10; // static (정적) , final 붙히면 하나의 값만 저장 MAX(상수 ->대문자로 설정 convention)
	static final double PI = 3.14;
	public static void main(String[] args) {
		//변수(변하는 수 ) 상수( 늘상 똑같은 수)
		int num = 10;
		System.out.println(num);
		num = 20;
		System.out.println(num);
		System.out.println(MAX);



	}
}
