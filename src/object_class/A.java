package object_class;

public class A {
	int memberA;
	public A(){
		System.out.println("클래스 A의 생성자");
	}
	//내부 클래스
	class B{
		int memberB;
		public B(){
			System.out.println("내부 B클래스의 생성자");

		}
		void methodB1(){
			memberA =10;
			System.out.println("내부 B클래스의 메서드");
		}

	}
	void methodA1(){
		System.out.println("A클래스의 메서드");
	}
}
