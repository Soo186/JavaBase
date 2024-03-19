package object_class;

public class SingletonEx01 {
	public static void main(String[] args) {
		//Singleton single1 = new Singleton(); 인스턴스 객체 생성 불가능
		Singleton sigle1 = Singleton.getInstance();
		Singleton sigle2 = Singleton.getInstance();
		if(sigle1 == sigle2){
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
	}
}
