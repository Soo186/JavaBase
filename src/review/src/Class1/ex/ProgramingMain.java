package Class1.ex;

public class ProgramingMain {
    public static void main(String[] args) {
        Programing no1 = new Programing();
        no1.language = "JAVA";
        no1.tool = "IntelliJ IDEA";
        no1.price = 15000;

        Programing no2 = new Programing();
        no2.language = "JAVASCRIPT";
        no2.tool = "WebStrom";
        no2.price = 25000;

        System.out.println("프로그래밍 언어" + no1.language + ",편집기 :" + no1.tool + "가격" + no1.price);
        System.out.println("프로그래밍 언어" + no2.language + ",편집기 :" + no2.tool + "가격" + no2.price);

        Programing[] programing = {no1, no2};

        for (Programing p : programing) {
            System.out.println("프로그래밍 언어" + p.language + ",편집기" + p.tool + ",가격" + p.price);

        }
        String str1 = "Hello";
        String str2 = str1; // str2가 str1이 참조하는 객체를 참조
        str2 = str1;
        System.out.println("str1: " + str1); // str1은 여전히 "Hello"
        System.out.println("str2: " + str2);
    }
}
