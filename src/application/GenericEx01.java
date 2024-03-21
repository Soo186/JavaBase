package application;

import java.util.ArrayList;
import java.util.List;

public class GenericEx01 {
	public static void main(String[] args) {
		/*List list = new ArrayList();      //배열과는 다르게 다른 타입 저장 가능
		list.add("홍길동");
		list.add(50);
		list.add(23.55);
		list.add(false);
		String na = (String) list.get(0); */
		//int num = (int) list.get(1);
		//list.remove(3); 3번째거 삭제 (false 삭제)
		//list.clear();   싹 다 지워짐.
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김철수");
		list.add("이영희");
		for (String s : list) {       //배열은 lengrh로 가져온다
			System.out.println(s);           //배열은 index [] 로 가져온다

		}
	}
}
