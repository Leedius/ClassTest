package study2;

public class MemberTest {
    public static void main(String[] args) {
        //Member 클래스에 대한 객체를 3개 저장할 수 있는
        //배열을 만들어서 각 배열에 Member 객체 저장.

        //Member 객체가 들어갈 수 있는 공간 3개를 생성.
        Member[] members;
        members = new Member[3];

        //Member 객체 생성
        Member m1 = new Member();
        m1.setInfo("홍길동", 20);
        members[0] = m1;            //셋팅된 회원 정보대입

        Member m2 = new Member();
        m2.setInfo("이순신", 30);
        members[1] = m2;            //셋팅된 회원 정보대입

        Member m3 = new Member();
        m3.setInfo("유관순", 40);
        members[2] = m3;            //셋팅된 회원 정보대입

        //members 배열의 0번째 요소에 들어간
        //회원의 정보를 출력

        members[0].showInfo();
        System.out.println("");

        //members배열에 저장된 모든 회원의 정보 출력.
        for (int i=0; i<members.length; i++) {
            members[i].showInfo();
            System.out.println("");
        }

        //for-each문
        for(Member e : members){            //Member(자료형) e : members :뒤에 배열에서 순서대로 빼서 e에 대입
            e.showInfo();
        }
    }
}
