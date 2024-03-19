package oop4;

public class Test01if {
	public static void main(String[] args) {
		 //if조건문

		//성적 프로그램
		String name="무궁화";
		int kor=100,  eng=100, mat=100;

		//평균 구하기
		double aver=(kor+eng+mat)/3.0;

		//출력하기
		System.out.printf("이름 : %s\n", name);
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", mat);
		System.out.printf("평균 : %.2f\n", aver);


		//평균이 95점 이상이면 장학생

		if(aver>=95) { // 78.33 >= 95
			System.out.println("장학생\n");
		}//if end

		//국어 점수가 70점 이상이면 합격, 아니면 불합격
		if (kor>=70) {
			System.out.println("국어 : 합격");
		}else {
			System.out.println("국어 : 불합격");
		} //if end


			// 수학점수 90점 이상 A 학점
		//        80점 이상 B 학점
		//        70점 이상 C 학점
		//        60점 이상 D 학점
		//        나머지    F 학점

		if (mat>=90){
			System.out.println("수학 : A 학점");
		} else if (mat>=80) {
			System.out.println("수학 : B 학점");
		} else if (mat>=70) {
			System.out.println("수학 : C 학점");
		} else if (mat>=60) {
			System.out.println("수학 : D 학점");
		}else{
				System.out.println("수학 : F 학점 ");
		}//if end

	}

	}



