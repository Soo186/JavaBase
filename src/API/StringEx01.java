package API;

public class StringEx01 {
	public static void main(String[] args) {    //to string 메서드 알아서  찾아줘서 생략.
		StringBuilder sb = new StringBuilder();
		sb.append("우리 모두 화이팅");
		sb.append("화이팅");
		System.out.println(sb.toString());
		sb.insert(4, "힘차게");
		System.out.println(sb.toString());
		sb.setCharAt(7,'화');
		System.out.println(sb.toString());
		sb.delete(4, 7); // 수정: 세 번째 인수 제거
		System.out.println(sb.toString());
	}
}
