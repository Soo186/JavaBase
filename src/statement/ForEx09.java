package statement;


public class ForEx09 {

	public static void main(String[] args) {
		/*for( int a=1; a<=3; a++) {
			for(int b=1; b<=5; b++){
					System.out.println(a + "-" + b);   //바깥쪽 루프 횟수 x 안쪽 루프 횟수
			}
		} System.out.println("끝");*/
		
			for( int dan = 2; dan <=9; dan++) {
				System.out.println("하트" + dan + "하트");
				for( int num = 1; num <=9; num++) {
					System.out.println(dan + "X" + num + "=" + dan * num);
			 }		System.out.println("====================");
}
}
}