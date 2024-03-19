package oop1;

public class Test01DataType {
    public static void main(String[] args) {
        // 1. 정수
        // byte < short < int < long
        // 1바이트 2바이트 4바이트 8바이트

        byte b;  // b라는 byte형 변수 선언
        b = 3;   // b라는 변수에 3을 저장(대입)
        System.out.println("" + b);
        System.out.println("" + (3 + 1));  // 3+1

        short s; // 변수선언 및 대입을 동시
        s = 300;
        System.out.println("" + s);

        int i = 7;
        System.out.println(i);

        long l = 9;
        System.out.println(l);

        // int i=2; 에러. 자료형 최초 한 번 지정한다

        int c = 2, d = 4;  // 동일한 자료형의 변수는 ,로 연속 선언 가능하다.
        System.out.println(c + d); // 2+4

        c = 10;
        d = 20;
        System.out.println(c + d); // 10+20
    }
}