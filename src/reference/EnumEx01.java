package reference;

import java.util.Calendar;

public class EnumEx01 {
	public static void main(String[] args) {
		Week today = null; // Week라는 열거형 상수 객체를 호출
		Calendar cal = Calendar.getInstance(); // 현재 날짜와 시간을 전달
		int weekday = cal.get(Calendar.DAY_OF_WEEK); //숫자로 나오면 헷갈리니 열거형 상수를 가지고 와서 쉽게.
		switch (weekday){
			case 1 :
				today = Week.SUNDAY;
				break;
			case 2 :
				today = Week.MONDAY;
				break;
			case 3 :
				today = Week.TUSEDAY;
				break;
			case 4 :
				today = Week.WEDNESDAY;
				break;
			case 5 :
				today = Week.THUSRDAY;
				break;
			case 6 :
				today = Week.FRIDAY;
				break;
			case 7 :
				today = Week.SATURDAY;
				break;
		} //switch end
		if ( today ==Week.SUNDAY){
			System.out.println("Take a Rest");

		}else {
			System.out.println("Practice Hard");
		}
}
	}
