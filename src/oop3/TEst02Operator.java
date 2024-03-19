package oop3;

public class TEst02Operator {
    public static void main(String[] args) {
        //대입연산자
        int a=1;
        a=a+3;  //1+3
        System.out.println(a);//4

        a+=3;  // a=4+3
        System.out.println(a);// 7


        int b=2;
        b-=2; //b=b-2

        int c=4;
        c*=2; //c=4*2

        int d=6;
        d/=2; //d=6/2

        int e=5;
        e%=2 ; //


        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        int x=3;
        x=x+1;
        x+=1;
        x++;
        ++x;
        System.out.println(x);

        int y=5;
        y=y-1;
        y-=1;
        y--;
        --y;
        System.out.println(y);

        //삼항연산자
        String str= (5>3) ? "맞다" : "틀리다" ;
                  //true
        System.out.println(str);

    }
}
