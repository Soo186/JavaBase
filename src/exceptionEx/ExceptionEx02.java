package exceptionEx;

public class ExceptionEx02 {
	public static void main(String[] args) {
		String[] str = {"100" , "200" , "300"};
		int sum = 0;
		try {
		for (int i = 0; i < str.length; i++) {
			int value = Integer.parseInt(str[i]);
			sum += value;
		}
		System.out.println("총합=" + sum);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("배열 인덱스를 초과했습니다");
		}
	}
}
