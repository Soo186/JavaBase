package object_class;

public class AEx01 {
	public static void main(String[] args) {
		//A클래스의 인스턴스 객체 생성
		A a = new A();
		a.methodA1();
		//A클래스 내부에 있는 B클래스의 인스턴스 객체 생성  //A클래스의 인스턴스 객체 없으면 생성 x ex) 자동차 안의 내비게이션
		A.B b = a.new B();
		b.methodB1();
	}
}
