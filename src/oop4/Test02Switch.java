package oop4;

public class Test02Switch {
	public static void main(String[] args) {
		//switch~case문

		//case 목록값은 순차적이지 않아도 된다.
		switch (30) {
			case 10: System.out.println("SEOUL");break;
			case 20: System.out.println("BUSAN");break;
			case 30: System.out.println("JEJU") ;break;
		}//switch end


		//break가 없는 경우
		switch (20) {
			case 10: System.out.println("국어");
			case 20: System.out.println("영어");
			case 30: System.out.println("수학");break;
		}//switch end

		//default : 찾고자 하는 값이 목록 중에 없는 경우 무조건 수행
		switch (60) {
			case 10 : System.out.println("개나리"); break;
			case 20 : System.out.println("진달래"); break;
			case 30 : System.out.println("무궁화"); break;
			default : System.out.println("기타");
		}//switch end





		/*
		 switch('%'){
		 case'+' :
		 case'-' :
		 case'/' :
		 case'%' :
		 */
	}
}



