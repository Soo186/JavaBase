package statement;


public class ForEx06 {

	public static void main(String[] args) {
		
       int sum =0;
       int i;
       for (i=1; i <=100; i++) {
    	   sum +=i;
    	   
    	   if(sum > 3500) break; 
    	   
       } //for End
       System.out.println(( i -1)+"까지 더하면" + (sum -i)+"이 되며 따라서 3500이 넘으려면" + i +"까지 더하면 됨");
   }
}