package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardEx01 {
	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();    //Board라는 class 타입
		Scanner sc = new Scanner(System.in);
		System.out.println("글쓰기를 종료하려면 제목에서 q를 입력하세요");
		while (true){
			System.out.print("제목 >>");
			String subject = sc.nextLine();
			if (subject.equals("q")){
				break;
			}
			System.out.print("내용 >>");
			String content = sc.nextLine();
			System.out.print("글쓴이 >>");
			String writer = sc.nextLine();
			list.add(new Board(subject , content , writer));
			System.out.println();
		}
		System.out.println("제목\t내용\t 글쓴이");
		System.out.println("--------------------------");
		for (Board board : list) {
			System.out.println(board.getSubject() + "\t" + board.getContent() + "\t\t" + board.getWriter());

		}
		System.out.println("총 게시글 수 : " + list.size());
	}
}
