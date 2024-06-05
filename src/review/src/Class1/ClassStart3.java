package Class1;

public class ClassStart3 {
	public static void main(String[] args) {
		Student student1;  // 변수 선언 `int` 는 정수를, `String` 은 문자를 담을 수 있듯이 `Student` 는 `Student` 타입의 객체(인스턴스)를 받을 수 있다.
		student1 = new Student();   //객체 또는 인스턴스 ex) (붕어빵) 메모리공간 생성.  객체 안에 있는 참조값 반환
		student1.name = "학생1";    //클래스에서는 .을 통해 접근
		student1.age = 15;
		student1.grade = 90;

		Student student2 = new Student(); // new Student()는 위에 거랑 다른 또 다른 메모리 공간
		student2.name = "학생2";
		student2.age = 16;
		student2.grade = 80;


		System.out.println("이름:" + student1.name + "나이:" + student1.age + "성적:" + student1.grade);
		System.out.println("이름:" + student2.name + "나이:" + student2.age + "성적:" + student2.grade);

		//용어: 클래스, 객체, 인스턴스**
		//클래스는 설계도이고, 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다. 둘다 같은 의 미로 사용된다.
		//여기서는 학생( `Student` ) 클래스를 기반으로 학생1( `student1` ), 학생2( `student2` ) 객체 또는 인스턴스를 만들었다.

	}
}
