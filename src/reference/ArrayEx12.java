package reference;

public class ArrayEx12 {
	public static void main(String[] args) {
			int[] scores = { 78 ,96 , 80 , 75 , 68 , 70 ,88};
			int sum=0;
			double avg = 0;
			/*for (int i = 0; i < scores.length; i++) {

				sum +=scores[i];

			}*/
			//향상된 for문
			for( int s : scores){
				sum += s;

		}
		avg = (double) sum / scores.length;
		System.out.printf("총점 = %d\n평균= %5.2f", sum,avg ); //따옴표 안 단위에 뒤에 변수들을 대칭대입


	}
}
