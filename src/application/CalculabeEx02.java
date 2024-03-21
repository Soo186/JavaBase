package application;

public class CalculabeEx02 {
	public static void main(String[] args) {
		Calculable calc;
		calc = (x,y) -> {                                   // 람다식 (매개변수 목록) -> { 실행 코드 }
			System.out.println("두 수의 합 : " + (x + y));
		};
		calc.calculate(20,30);

		calc = (x,y) ->{
			System.out.println("두 수의 차 : " + (x - y));
		};
		calc.calculate(56,20);
	}
}
