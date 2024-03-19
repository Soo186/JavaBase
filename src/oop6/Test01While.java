package oop6;

public class Test01While {
	public static void main(String[] args) {

		//while 반복문
		//형식 ) while (조건) {조건이 true이면 수행}

		int a=1;
		while (a <= 3){
			System.out.println("JAVA");
			a=a+1;
		}//while end
		/*
	        while(1 <= 3) { JAVA a=1+1 }
	        while(2 <= 3) { JAVA a=2+1 }
	        while(3 <= 3) { JAVA a=3+1 }
         */

		int c=1;
		do {
			System.out.println("Python");
			c=c+1;
		} while (c<=3);
		/*
			do {
		 */
	}
}
