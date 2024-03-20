package API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH : mm : ss");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일");   //a는 오전,오후  E는 요일표시
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("yyyy년 D번째 날입니다.");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("이번주는 MM월의 W번째 주입니다.");
		System.out.println(sdf.format(now));
		sdf = new SimpleDateFormat("이번주는 yyyy년의 w번째 주입니다.");
		System.out.println(sdf.format(now));
	}
}
