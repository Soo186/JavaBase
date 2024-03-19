package oop3;

public class Test03Conversion {
	public static void main(String[] args) {
		//데이터형 변환

		//1. 자동형 변환
		//정수형 : byte < short <int <long
		//실수형 : float < double
		byte b=2;
		int i=b;
		long l=i;
	    //b=i; 에러

		float f=3.4f;
		double d=f;


		//2.강제형 변환 (cast연산자)
		// ->필요한 곳에서 일시적으로 변환
		// ->(자료형)값
		System.out.println((int)1.3);  //1
		System.out.println((int)(2.4+3.7));// (6.1)
		System.out.println((int)2.4+(int) 3.7);// 2+3

		System.out.println((double)5);

		//프로젝트 참조
		int money=321;
		System.out.println(money/100);//3
		System.out.println(money%100);//21
	}
}
