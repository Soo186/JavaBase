package statement;


public class ForEx14 {

	public static void main(String[] args) {
		
		
		Exit: for(int i = 1; i <= 5; i++) {    
				for ( int j = 1; j<=5; j++) {
					System.out.println( i+ " -- " + j);
					if( i==3 && j==3) {
						break Exit;    //Exit 로 탈출
					}
			
					}// inner for end
				}//for end		
			System.out.println("탈출 성공");
			}
		
		
		
}
	
	