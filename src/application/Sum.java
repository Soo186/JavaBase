package application;
//구현 클래스(합)

public class Sum implements Calculable{
	@Override
	public void calculate(int x, int y) {
		System.out.println("두 수의 합 : " + (x + y));

	}
}
