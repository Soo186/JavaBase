package Class1;

public class ClasssStart2 {
	public static void main(String[] args) {
		String[] studentNames = {"학생1", "학생2","학생3", "학생4"};
		int[] studentAges = {15, 16, 17, 20};
		int[] studentGrades = {90, 80, 70, 60};

		for (int i = 0; i < studentNames.length; i++) {
			System.out.println("이름:" +  studentNames[i] + "나이:" + studentAges[i] + "성적:" + studentGrades[i]);


			//따로 나누어서 관리하는 것은 사람이 관리하기 좋은 방식이 아니다.
			//'학생'이라는 개념을 하나로 묷어서 관리하고 ,각각의 이름 나이 성적을 관리하는 것이 좋은방법이다.
			// 위 내용을 클래스 도입을 통해 사용해보자.
			
		}


	}
}
