package operator;



public class OperatorEx09 {

	public static void main(String[] args) {
		// 비트 연산자
		System.out.println( 45 & 25);
		System.out.println( 45 | 25);
		System.out.println( 45 ^ 25);
		// 비트 이동 연산자
		int num = 13;
		System.out.println( num << 2);
		int num2 = 8;
		System.out.println( num2 >> 2);
	}
}