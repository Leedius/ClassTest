package study;

public class MemberTest {
    public static void main(String[] args) {

        //두명의 회원을 생성
        Member m1 = new Member();
        Member m2 = new Member();

        m1.name = "홍길동";
        m1.age = 20;
        m2.name = "임꺽정";
        m2.age = 30;

        //같은 자료형(Member)이라서 대입가능
        m1 = m2;
        m1.name = "이순신";
        m2.age = 40;

        //m1의 이름 나이?
        //이름 : 이순신, 나이 : 40
        //m2의 이름 나이?
        //이름 : 이순신, 나이 : 40
    }
}
