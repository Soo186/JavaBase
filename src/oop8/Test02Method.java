package oop8;

import org.w3c.dom.ls.LSOutput;

public class Test02Method {


	public static void test4(int a) {// 매개변수  (parameter)
		System.out.println(a);
		return;//생략가능
	}

	public static void test5(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void test6(float a, double b){
		System.out.println(a + b);
	}

	public static void test7(char ch, int a){
		for (int b=1; b<=a; b++){
			System.out.println(ch);
		}
	}



	public static void main(String[] args) {
		//2. 전달값이 있는 경우


		test4(10);
		test4(30);
		test4(50);

		test5(6, 7, 8);
		test5(2, 4, 6);

		test6(1.2f, 3.4);

		test7('#',100);
	}
}

