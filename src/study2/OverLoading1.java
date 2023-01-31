package study2;

public class OverLoading1 {
    public static void main(String[] args) {
        System.out.println(10);
        System.out.println("java");
        System.out.println(10.5);

        aaa(10);
    }
    public static void aaa(String str){
        System.out.println(str);
    }

    //메소드가 중복되었지만 매개변수의 자료형이 다르거나 개수가 다르면 사용가능
    public static void aaa(int a){
        System.out.println(a);
    }
}
