package reference;

public class ArrayEx09 {
	public static void main(String[] args) {
		int[][] magic = new int [5][5];
		int row = 0; //행
		int col; //열
		int num =1; //배열에 넣는 숫자
		// 첫 행에 중간열에 1을 넣는다.
		col = magic[0].length /2 ;
		magic[row][col] = num;
		for(num =2; num<= magic.length * magic[0].length; num++){
			//대각선 위로 이동한다
			row--;
			col++;
			//행과 열이 모두 존재하지 않는 경우
			if (row < 0  && col == magic[0].length){
				row += 2;
				col -= 1;
			}
			//행이 존재하지 않을 경우
			if (row < 0){
				//마지막 행으로 이동
			 row= magic.length-1;}//마지막 행으로 이동  //배열은 0부터 !!!!!!!!시발존나 어렵ㄷ
			//열이 존재하지 않을 경우
			if (col == magic[0].length){
				col = 0; //첫 열

			}
			//이미 값이 존재할 경우
			if (magic[row][col] != 0){
				row += 2;
				col -= 1;
			}

			//값을 넣는다.
			magic[row][col] =num;

		} //for end
		for (int i = 0; i < magic.length; i++) {
			for (int j = 0; j < magic[0].length; j++) {
				if (magic[i][j] <10){
					System.out.print(" " + magic[i][j] + " ");
				}else {
					System.out.print(magic[i][j] + " ");
				}

			}
			System.out.println();

		}

	}
}
