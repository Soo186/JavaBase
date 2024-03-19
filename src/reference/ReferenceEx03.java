package reference;

public class ReferenceEx03 {
	public static void main(String[] args) {
		/*String title = new String("우리모두 화이팅");
		char ch = title.charAt(3);
		System.out.println(ch);*/
		String ssn = "971012-2234567";
		char sex =ssn.charAt(8);
		if (sex == '2' || sex == '4'){  //char 변수는 꼭 ' ' 붙히기!
			System.out.println("female");
		}else if(sex == '1' || sex == '3'){
			System.out.println("male");
		}else{
			System.out.println("error");
		}





	}
}
