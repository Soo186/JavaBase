package reference;

public class ArrayEx06 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		boolean run = true;
		while (run) {
			//번호 6개를 무작위로 생성
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 45) + 1;

			}

		run = false;  // 제대로 만들어졌을 때 반복 x를 위해 false 대입
		//같은 번호 찾아내는 알고리즘
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] == lotto[j]) {
					run = true;
					break;
				}
			}
		}


		} System.out.println("로또 번호 자동 생성 출력");
		for (int p = 0; p < lotto.length; p++) {
			System.out.println((p+1) + "번 째 번호 :" + lotto[p]);
	}
}
}
