package statement;

public class WhileEx01 {

	public static void main(String[] args) {
		for( int i =1; i <= 10; i++) {
			System.out.println(i);
		}
			
		int i =1;
		int sum = 0;
		while( i <= 100 ) {
			i++;
			sum +=i;
		}System.out.println(sum);
		

	}

}
