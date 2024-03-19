package object_class;

public class PhysicalInfoEx01 {
	public static void main(String[] args) {
		PhysicalInfo hee = new PhysicalInfo("이영희", 10, 130.5f, 33.0f);
		printPhysicalInfo(hee);
		hee.update(11 , 140.0f , 45.0f);
		printPhysicalInfo(hee);
		hee.update(12 , 152.0f);
		printPhysicalInfo(hee);
		hee.update(13);
		printPhysicalInfo(hee);
	}

	// 신체 정보를 출력하는 메서드
	public static void printPhysicalInfo(PhysicalInfo obj){
		System.out.println("이름 :" + obj.name);
		System.out.println("나이 : " + obj.age);
		System.out.println("키 : " + obj.height);
		System.out.println("몸무게 : " + obj.weight );
		System.out.println();
	}
}




