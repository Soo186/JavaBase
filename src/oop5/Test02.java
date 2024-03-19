package oop5;

public class Test02 {
	public static void main(String[] args) {
		// 이중반복문


		for (int a=1; a<=2; a=a+1){
			System.out.println("JAVA");



			for(int b=1; b<=3; b=b+1){
				System.out.println("Python");
			}//for end

			/*System.out.println(a);
			System.out.println(b); 에러 발생 /*
			a=1  1<=2 JAVA
			               b=1 1<=3 Python
			                   2<=3 python
			                   3<=3 python
			                   4<=5


		   a=2  2<=2 JAVA  b=1 1<=3  Python
		                       2<=3  Python
		                       3<=3  Python
		                       4<=3

		  a=3 3<=2
			 */
		}
	}
}
