package operator;

public class OperatorEx01 {

	public static void main(String[] args) {
	int pencil = 253;
	int child = 12;
	
	int share = pencil/child;
	int remain = pencil%child;
	System.out.println("연필" + pencil + "자루를" + child + "명의 아이들에게 나누어주면" + share + "자루씩 가지고" + remain + "이 남는다");
	System.out.printf(" %d 씩 가지고 %d 가 남는다", share , remain );	
	
	}
}
	