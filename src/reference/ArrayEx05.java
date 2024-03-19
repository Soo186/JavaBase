package reference;

public class ArrayEx05 {
	public static void main(String[] args) {
		/*소트 알고리즘
			sort(정렬) : 무질서한 자료를 원하는 순서대로 재배열하는 것
			오름차순 정렬(Ascending sort) : 작은 것 ==> 큰 것
			내림차순 정렬(Descending sort) : 큰 것 ==> 작은 것
		 */
		int[] nums = {50, 24, 5, 82, 67};
		int temp;
		// 소트 전 자료 출력
		System.out.println(" ** 소트 전 자료 출력**");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " ");

		}
		// 소트 알고리즘
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++)
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;

				}


		}
		// 소트 후 자료 출력
		System.out.println(" \n** 소트 후 자료 출력**");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " ");


		}
	}
	}

