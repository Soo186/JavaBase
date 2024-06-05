package oop7;

public class Test01Array {
	public static void main(String[] args) {
		//1차원 배열

		int[] kor = new int [5] ; //4바이트*5 = 20 바이트 메모리 할당
		kor[0] = 10;
		kor[1] = 20;
		kor[2] = 30;
		kor[3] = 40;
		kor[4] = 50;

		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		System.out.println(kor[3]);
		System.out.println(kor[4]);


		//kor 배열 요소의 개수
		System.out.println(kor.length);//5

		//ArrayIndexOutOfBoundsException 발생
		//System.out.println(kor[5]); //5번쨰 요소는 발생하지 않음


		//배열 선언 동시에 초기값 저장

		int[] eng={70, 80, 90};
		for (int i=0; i<eng.length; i++){
			System.out.println(eng[i]);
		}//for end


		String[] name = {"무궁화", "진달래", "개나리"};
		for (int i = 0; i<name.length; i++){
			System.out.println(name[i]);
		}//for end

		double[] height = {165.2, 180.6, 175.9};
		for (int i = 0; i< height.length; i++){
			System.out.println(height[i]);
		}//for end

		char[] ch = {'S', 'K', 'Y'};
		for (int i = 0; i<ch.length; i++){
			System.out.println(ch[i]);
		}//for end

		
	}


}



