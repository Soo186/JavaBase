package API;

import java.text.DecimalFormat;

public class DecimalFormatEx01 {
	public static void main(String[] args) {
		int price = 150000;
		DecimalFormat df;   //한 번 선언하고 다양한 용도로
		df = new DecimalFormat("판매가격 = #,###원");
		System.out.println(df.format(price));
		double num = 5121213.234;
		df = new DecimalFormat("#,###.00");    //소수점 뒤 2자리만 찍겠다.
		System.out.println(df.format(num));
	}
}
