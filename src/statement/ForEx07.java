package statement;


public class ForEx07 {

	public static void main(String[] args) {
		
       int sum =0;
       for (int i=1; i <= 100; i++) {
    	   if( i % 5 ==0) {
    		   continue;  //반복문의 끝으로 간다.
    	   }
    	   sum +=i; //sum=sum +i;
       }
       System.out.println("1부터 100까지의 합=(5의 배수는 제외)" + sum);
   }
}