package study;

public class CallByReference {
    public static void main(String[] args) {
        //참조자료형(배열, 클래스)
        int[] a = {1};
        int[] b = a;            //배열 a의 주소만 배열b로 복사가됨.
        b[0] = 3;
        System.out.println("a[0] = " + a[0]);       //3
        System.out.println("b[0] = " + b[0]);       //3
    }
}
