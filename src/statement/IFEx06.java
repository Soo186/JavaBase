package statement;

import java.util.Scanner;

public class IFEx06 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.print("당신의 키를 입력 >>");
		int height = sc.nextInt();
		
		System.out.println("당신의 몸무게를 입력 >>");
		int weight =sc.nextInt();
		
		int standardWeight = (int)((height-100) * 0.9);
		
		if(weight > standardWeight +5){
			System.out.println("비만입니다");
		     }else if(weight >= standardWeight -5){
		    	 System.out.println("정상입니다. 꾸준히 유지하세요");
				}else {
					System.out.println("마른 체형입니다. 밥 많이 드세요");
				}
		
		
		
		
		
		
		
    	
    	
 
    }
}
