package oop7;

	public class Test02Array {
		public static void main(String[] args) {
			//2차원 배열

			//2행 3열
			int[][] eng = new int[2][3]; //4바이*6 = 24바이트 메모리 할당
			eng[0][0] = 10;
			eng[0][1] = 20;
			eng[0][2] = 30;
			eng[1][0] = 40;
			eng[1][1] = 50;
			eng[1][2] = 60;

			//2차원 배열의 행의 개수
			System.out.println(eng.length);//2

			//eng[0] 행의 열의 개수
			System.out.println(eng[0].length);//3

			//eng[1] 행의 열의 개수
			System.out.println(eng[1].length);//3

			//각 행 열의 개수가 달라 가능하다

			int[][] aver={
					{10, 20, 30, 40, 50}
					,{60 ,70}
					,{89, 90, 100}
			};

			System.out.println(aver.length);
			System.out.println(aver[0].length);
			System.out.println(aver[1].length);
			System.out.println(aver[2].length);
		}
}
