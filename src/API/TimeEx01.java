package API;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date; // Date 클래스를 import합니다
import java.text.SimpleDateFormat; // SimpleDateFormat 클래스를 import합니다

public class TimeEx01 {
	public static void main(String[] args) {
		TimeZone tz = TimeZone.getTimeZone("Europe/Rome");
		Calendar now = Calendar.getInstance(tz);
		//System.out.println(now);
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR);
		int miniute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int a = now.get(Calendar.AM_PM);
		String ap;
		if(a ==Calendar.AM_PM){
			ap = "오전";
		}else {
			ap = "오후";
		}
		System.out.printf("현재 로마의 날짜는 %d년 %d월 %d일이고 \n", year ,month , day);
		System.out.printf("현재 로마의 시간은%s %d시 %d분 %d초입니다", ap ,hour ,miniute ,second);



	}
}