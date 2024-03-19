package object_class;

public class CheomsungdaeEx01 {
	public static void main(String[] args) {
		Cheomsungdae chum1 = Cheomsungdae.getInstance(); //싱글톤 객체정보를 얻어옴
		chum1.show("철수");
		Cheomsungdae chum2 = Cheomsungdae.getInstance();
		chum2.show("길동");
		if (chum1 == chum2) {
			System.out.println("같은 객체입니다");
		} else
			System.out.println("다른 객체입니다.");
	}
}
