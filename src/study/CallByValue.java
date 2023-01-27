package study;

//기본 자료형과 참조자료형의 차이점
public class CallByValue {
    public static void main(String[] args) {
        //기본 자료형
        int a = 10;
        int b = a;
        b = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
