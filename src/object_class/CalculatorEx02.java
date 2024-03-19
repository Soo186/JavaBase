package object_class;

public class CalculatorEx02 {
	public static void main(String[] args) {
		Calculator myCal = new Calculator(); //인스턴스 객체 생성
		int reusult1 = myCal.sum(251, 364);
		System.out.println("계산결과=" + reusult1);
		int result2 = myCal.sum(451 , 74 , 99);
		System.out.println("계산결과=" + result2);
		int result3 = myCal.sum( 83, 43, 41, 31, 34);
		System.out.println("계산결과=" + result3);
		int[] values = {21,34,123,145,67,89,92};
		int result4 = myCal.sum(values);
		System.out.println("계산결과 =" + result4);
	}
}
