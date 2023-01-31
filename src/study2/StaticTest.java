package study2;

public class StaticTest {
    public static void main(String[] args) {
        int num = 10;
        aaa(num);

        //System(클래스).out(static포함 어떤 기능이 있는 특별한 변수).println(static포함 메소드)
        System.out.println();
        MySystem.out.println();

    }

    //static을 뺴면 오류가 난다 static을 빼면 나중에 실행시키기 때문에 위에 aaa(num)이 오류가난다.
    public static void aaa(int num){
        System.out.println(num);
    }
}
