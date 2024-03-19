package reference;

public class ArrayEx07 {
	public static void main(String[] args){


		int[][] nums = {{ 78 ,96, 80 , 70, 85} , {50 ,80 ,70 }};
		for (int i = 0; i < nums.length; i++) {

			int sum =0;
			double avg =0;
			for (int j = 0; j < nums[i].length; j++) {
				sum += nums[i][j];


			}  avg = (double) sum / nums[i].length;
			System.out.println(sum);
			System.out.println(avg);

		}

			}
		}




