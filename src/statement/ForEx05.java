package statement;


public class ForEx05 {

	public static void main(String[] args) {
		/*System.out.println("주사위를 굴려보자");
		int dice = (int)(Math.random()*6) + 1;
		System.out.println("나온 숫자 : " + dice);*/
		
		System.out.println("로또 번호생성");
		for (int i=1; i<=6; i++) {
			
			
			int lotto=(int)(Math.random()*45) +1;
			System.out.println(i  +"번쨰 숫자:" +lotto);
		}

}
}
