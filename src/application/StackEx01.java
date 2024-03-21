package application;

import java.util.Stack;

public class StackEx01 {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		while (!coinBox.isEmpty()){
			Coin coin = coinBox.pop();       //list set 는 add map은 put
			System.out.println("꺼내온 동전 : " + coin.getValue());
		}

	}
}
