package application;

import java.util.*;

public class HashMapEx01 {
	public static void main(String[] args) {
		Map<String , Integer> map = new HashMap<>();   // map<키 ,값>
		map.put("김철수", 90);                                                //list , set 는 add
		map.put("이영희", 75);                                                //list , set 는 add
		map.put("홍길동", 60);                                                //list , set 는 add
		map.remove("이영희");
		System.out.println("총 응시자 수 :" + map.size());
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오 >>");
		String name = sc.nextLine();
		System.out.println("점수 : " + map.get(name));
		System.out.println(" **성적 현황표 **");
		Set<String> key = map.keySet();
		Iterator<String> iter = key.iterator();
		while (iter.hasNext()){
			String nm = iter.next();
			Integer score = map.get(nm);
			System.out.println("이름 : " + nm + " 점수 : " + score);
		}

	}
}
