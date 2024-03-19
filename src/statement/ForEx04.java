package statement;


public class ForEx04 {

	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1; i <= 100; i++) {
			if(i %2 ==0) {
				sum1 +=i;
			}else {
				sum2 += i;
		}
		
	}	System.out.println("1부터 100까지의 짝수합 =" + sum1);
		System.out.println("1부터 100까지의 홀수합 =" + sum2);
	
	


}
}
