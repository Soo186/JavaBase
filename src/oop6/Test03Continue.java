package oop6;

import java.util.function.DoubleFunction;

public class Test03Continue {
	public static void main(String[] args) {
		// break문과 continu문

		//1. break문
		for (int a = 1; a < 10; a = a + 1) {
			if (a == 5) {
				break;
			}//if end
			System.out.printf("%d", a);
		}//for end
		/*
			a = 1 , a < 10 {if(1==5) }
					2 < 10 {if(2==5) }
					3 < 10 {if(3==5) }
					4 < 10 {if(4==5) }
					5 < 10 {if(5==5) } break;
		 */

		//2. continue
		for (int a = 1; a < 10; a = a + 1) {
			if (a == 5) {
				continue; //반복문을 계속 실행(U턴)
			}//if end
			System.out.printf("%d", a);
		} //for end

		//프로젝트 참조

		int b = 1;
		while (true) {  //무한 LOOP
			System.out.println("KOREA");
			b = b + 1;
			if (b == 5) {
				break; // 반복문을 빠져나옴
			}
		}
	}
}




