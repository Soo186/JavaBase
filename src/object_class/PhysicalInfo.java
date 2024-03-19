package object_class;
//신체 정보 클래스

public class PhysicalInfo {
	//멤버 변수(필드)
	String name; //이름
	int age; //나이
	float height , weight; //키와 몸무게
	//생성자
	//메서드

	public PhysicalInfo(String name , int age , float height , float weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	//메서드 오버로딩  똑같은 메서드를 여러 개 만드는 기능 단, 매개변수 개수가 달라야됨,or 타입이 달라야됨

	void update(int age){
		this.age = age;
	}
	void update(int age , float height){
		this.age = age;
		this.height = height;
	}


		void update(int age , float height , float weight){
			this.age = age;
			this.height = height;
			this.weight = weight;
	}

}
