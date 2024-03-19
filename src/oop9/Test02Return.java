package oop9;

public class Test02Return {

	public static void add(int a){
		System.out.println(a);
	}

	public static void add(int a , int b){
		System.out.println(a+b);
	}

	public static void add(double a , double b){
		System.out.println(a+b);
	}

	public static void add(String a, String b){
		System.out.println(a+b);

		/*
		  함수의 리턴형은 메소드 오버로드의 전제조건이 아니다.
		  public static int add(int a){}에러
		 */
	}
	public static void main(String[] args) {



		add(3);
		add(5,7);
		add(1.2 , 3.4);
		add("JAVA" , "Python");


		//프로젝트 참조
		/*

		 rank=1

		 70  ,  80 ,  40 , 60 , 60


		       60<70 rank=rank+1

		 */


	}
}
