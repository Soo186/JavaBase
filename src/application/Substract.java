package application;

public class Substract implements Calculable{
	@Override
	public void calculate(int x, int y) {
		System.out.println("두 수의 차 : " + (x - y));
	}
}
