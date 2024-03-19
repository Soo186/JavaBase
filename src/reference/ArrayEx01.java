package reference;

public class ArrayEx01 {
	public static void main(String[] args) {

        /*int score1 = 96;
        int score2 = 70;
        int score3 = 82;
        int sum = score1 + score2 + score3;
        double avg = sum / 3;*/

		int[] nums = new int[3];  //3개의 저장공간
		nums[0] = 96;
		nums[1] = 70;
		nums[2] = 82;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];  //sum = sum+nums[i]
		}
		System.out.println("총점=" + sum);
	}
}
