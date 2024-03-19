package object_class;

public class Singleton {
	// 접근제한자와 함꼐 정적 멤버 선언과 초기화;
	private static Singleton singleton = new Singleton();

	// 생성자
	private Singleton(){

	}
	//메서드
	static Singleton getInstance(){
		return singleton;
	}    //싱글톤을 하는 이유는 메모리 절약 하나만 갖다 쓰면돼서
}
