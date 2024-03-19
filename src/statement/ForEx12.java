package statement;


public class ForEx12 {

	public static void main(String[] args) {
		int sum;
		
		Sgo:for(int p=1; p <= 17; p++) { // 밑에 것들 반복 싹 다 한 후 다시 증감해서 반복 시작
				for ( int d = 1; d<=17; d++) {// 오리
					sum = p * 4 + d * 2;
					if(sum==56 &&  p + d == 17) {
						System.out.println("돼지 마리 수 = " + p);
						System.out.println("오리 마리 수 = " + d);
						break Sgo;
					}
				}		
			}
		
		
		
}
	}
	