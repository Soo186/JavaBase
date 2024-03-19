package statement;

import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단 >>");
		
		int num = sc.nextInt();
		System.out.println("**" + num + "단" + "**");
		
		for(int i=1; i<=9; i++) {
			System.out.println(num+ " X " + i + " = " +i * num);
		}
	}
	
	

}
