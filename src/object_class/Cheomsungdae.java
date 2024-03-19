package object_class;
//첨성대 클래스 ( 싱글톤)

public class Cheomsungdae {
	// 싱글톤 생성
	private static Cheomsungdae chum = new Cheomsungdae();
	//생성자
	private Cheomsungdae(){

	}

	//메서드
	public static void show(String name){
		System.out.println(name + "(가)이 천문을 관측합니다");
	}

	public static Cheomsungdae getInstance(){  //만들어진 첨성대 객체 정보를 얻어옴
		return Cheomsungdae.chum;
	}
}
