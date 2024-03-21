package application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김철수");
		set.add("이영희");
		//set.add("김철수");
		System.out.println("총 인원 수 : " + set.size());
		for(String name : set){
			System.out.println("이름:" + name);
		}
		set.remove("김철수");
		System.out.println("제거 후 출력");
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()){
			String name = iter.next();
			System.out.println("이름 :" + name);
		}
	}
}
