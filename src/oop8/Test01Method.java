	package oop8;

	public class Test01Method {

		//메소드 작성 영역
		public static void test1() {
			System.out.println("JAVA");
		} //test1 () end

		public static void test2(){

			System.out.println("Python");
		}

		public static void test3(){

			System.out.println("KOREA");
			return; //함수를 호출한 시점으로 돌아간다.
					//단, 마지막 행의 return은 생략 가능하다
			 }

		public static void main(String[] args) {
			//메소드 정의 및 호출

			//1. 전달값 (argument value)이 없는 경우 괄호 안에 값 존재 X
			test1();// 함수 호출
			test1();
			test1();

			test2();
			test2();
			test2();

			test1();


			test3();
			test2();
			test1();

		}
	}

