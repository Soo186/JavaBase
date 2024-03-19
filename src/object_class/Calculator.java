package object_class;

public class Calculator {
	//더하기 메서드


	int sum(int ... nums) {    //nums 만큼 다 받음
		int hap =0;
		for (int i = 0; i < nums.length; i++) {
			hap += nums[i];

		}
		return hap;
	}

}
