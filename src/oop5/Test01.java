package oop5;

import javax.print.attribute.standard.JobStateReason;

public class Test01 {
	public static void main(String[] args) {


		// 1. 증가에 따른 반복
		for (int a = 1; a <= 3; a ++ ){
			System.out.println("JAVA");
		}//for end
		/*
		a=1 1<=3 JAVA a=1+1
		    2<=3 JAVA a=2+1
		    3<=3 JAVA a=3=1
		    4<=3 false
		 */


		//2. 감소에 따른 반복
		for (int b = 3; b >= 1; b = b -1){
			System.out.println("Python");
			//for end
			/*
			b=3  3>=1 b=3-1
			     2>=1 b=2-1
			     1>=1 b=1-1
			     0>=1 false
			 */


			//3. 유효범위 (SCOPE)
			//-> 특정 변수가 생존할 수 있는 범위
			for (int c = 1; c <= 5; c = c + 1){
				System.out.println("KOREA");
			} //for end

			//for 문 안에 선언 c변수 for문 안에서만 유효하다.
			//System.out.println(c); 에러

			int d;
			for (d = 1; d <= 5; d++){
				System.out.println("SEOUL");
			}//for end

			System.out.println(d);




		}
	}
}
