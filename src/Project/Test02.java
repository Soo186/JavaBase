package Project;

public class Test02 {
	public static void main(String[] args){
		int a=3, b=2;
		char op = '+';

		//if 문을 사용한 계산
		if (op=='+') {
			System.out.println(a + b);
		} else if (op=='-') {
			System.out.println(a - b);
		} else if (op=='*') {
			System.out.println(a * b);
		} else if (op=='/') {
			System.out.println((double) a / b);
		} else if (op=='%') {
			System.out.println(a % b);
			
		}

		//switch 문을 사용한 계산

		switch (op){
			case'+' : System.out.println( a + b);break;
			case'-' : System.out.println(a-b); break;
			case'*' : System.out.println(a * b);break;
			case'/' : System.out.println((double) a/b);break;
			case'%' : System.out.println(a%b);

		}
			
		}

	}




		










		/*
		 switch('%'){
		 case'+' :
		 case'-' :
		 case'/' :
		 case'%' :
		 */




