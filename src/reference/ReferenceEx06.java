package reference;

public class ReferenceEx06 {
	public static void main(String[] args) {
		/*String str = "프로그램 언어 중 자바 언어를 매일 배우고 있다.";
		int location = str.indexOf("자바");  //괄호 안에 문자를 찾아줌 위치가 어딘지를 알려줌/ -1이 뜨면 찾는 게 없음.
		System.out.println(location); //index 번호가 나옴
		String str2 = "자바의 정석은 자바의 기초부터 활용까지 자바를 배울 수 있다.";
		int location2 = str2.lastIndexOf("자바"); // 끝에서부터 찾아준다.
		System.out.println(location2);*/

		String book = "자바의 정석";
		int loctaton = book.indexOf("자바");  //0이 할당됨  if 정석이였으면 4가 할당됨
		if (loctaton != -1){                // -1이 할당된다는 것은 입력값이 없다는 말.
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련이 없는 책이군요");
		}
		boolean result = book.contains("자바");   // 자바의 정석에서 자바를 찾으면 true
		if (result){
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련이 없는 책이군요");
		}

		int location = book.indexOf("자바");
	}
}
