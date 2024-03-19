package reference;

public class ArrayEx03 {
	public static void main(String[] args) {
		int[] nums = { 45 ,22, 78 ,36 ,41 ,96 ,32 ,43 ,10 ,15};
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0 ){
				sum += nums[i];

		}

			} System.out.println("배열 요소 짝수들의 합 = " + sum);
			
		}

	}

