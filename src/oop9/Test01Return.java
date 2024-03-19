package oop9;

public class Test01Return {

	public static int test1(int a, int b){
		int sum=a+b;
		return sum;


	}


	public static String test2(int a){
		if(a%2==0) {
			return "짝수";
		}else{
			return"홀수";

		}

	}

	public static boolean leap(int year){
		if (year%4==0){
			return true;
		}else{
			return false;
		}
	}

	public static long fact(int a){
		long gop=1;
		for (int f=a; f>=1; f--)
			gop=gop*f;
		return gop;
	}




	public static void main(String[] args) {
		//리턴값이 있는 경우


		int result=test1(3,5);
		System.out.println(result);
		System.out.println(test1(2,4));

		test2(7);

		String str=test2(7);
		System.out.println(str);


		if (leap(2020)){
			System.out.println("윤년");
		}else{
			System.out.println("평년");
		}



		long gop=fact(4);
		System.out.println(gop);

	}
}
