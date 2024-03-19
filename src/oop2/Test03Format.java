package oop2;

public class Test03Format {
    public static void main(String[] args) {
        //출력서식
        //System.out.printf("출력서식,값");

        System.out.printf("%d %d %d", 10,20,30);
        System.out.printf("\n나이: %d", 25);
        System.out.printf("\n\n\n나\t이: %d", 30);
        System.out.printf("\n나이: #%5d#", 25);  //오른쪽 정렬
        System.out.printf("\n나이: #%-5d#", 25); //왼쪽  정렬
        System.out.println();




    }
}
