package exceptionEx;

public class ExceptionEx02 {
	public static void main(String[] args) {
		String[] str = {"100" , "이백0" , "300"};
		int sum = 0;
		try {
		for (int i = 0; i < str.length; i++) {
			int value = Integer.parseInt(str[i]);
			sum += value;
		}
		System.out.println("총합=" + sum);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("배열 인덱스를 초과했습니다");
		}catch (NumberFormatException e){
			System.out.println("문자 데이터는 변환할 수 없습니다.");
		}catch (Exception e){
			System.out.println("에러 발생(개발자에게 문의하세요(010-1231-1345)-" + e.getMessage());   //모든 예외 보여주기

		}finally {                              //뭐든 간에 일단 수행
			System.out.println("무조건 실행");
		}
	}
}
