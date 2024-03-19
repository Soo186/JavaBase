package oop3;

public class Test01Operator {
    public static void main(String[] args) {
        //산술연산자
        System.out.println(5 + 3); //8
        System.out.println(5 - 3); //2
        System.out.println(5 * 3); //15
        System.out.println(5 / 3); //1
        System.out.println(5 % 3); //2 나머지

        System.out.println(3 / 5); // 00  소수점 취급 x
        System.out.println(3 % 5); // 3

        //비교연산(관계)

        System.out.println(5 < 3);
        System.out.println(5 > 3);
        System.out.println(5 <= 3);
        System.out.println(5 >= 3);
        System.out.println(5 != 3); //같지 않다.
        System.out.println(5 == 3); //같다.

        //논리연산자
        //&&
        //||
        //!
        System.out.println(3 < 5 && 2 > 4);
                           // true   false
                           //   false
        System.out.println(3 < 5 || 2 > 4);
                         // true   flase
                           //   true
        boolean flag=false;
        System.out.println(!flag);
                         //false
    }
}
