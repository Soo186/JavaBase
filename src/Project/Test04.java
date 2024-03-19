package Project;

public class Test04 {
	public static void main(String[] args) {





		int[] aver= {70 , 80 , 60 , 90 , 50};
		int a = aver.length;//5

		int rank=1;
		for(int i = 0;  i <a ; i++) {
			if(aver[2]<aver[i]){
				rank=rank+1;
			}
		}
		System.out.println(rank);







	}
}
