package application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberEx01 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		set.add(new Member("홍길동", 25));
		set.add(new Member("김철수", 23));
		set.add(new Member("이영희", 25));
		set.add(new Member("홍길동", 25));
		Iterator<Member> iter = set.iterator();
		while (iter.hasNext()) {
			Member member = iter.next();
			System.out.println("이름: " + member.name + " 나이: " + member.age);
		}
		System.out.println("총 인원수: " + set.size());
	}
}

