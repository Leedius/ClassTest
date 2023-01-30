package Member;

public class MemberServiceExample {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "12345");
        if(result){
            System.out.println("로그인 되었습니다");
            memberService.logout("hong");           //MemberService클래스에 logout메소드에 조건이 없기떄문에 무엇이
                                                        //무엇이 들어가든 logout메소드 실행
        }

        //id와 password가 둘다 맞지 않을시 else문 실행
        else {
            System.out.println("id 또는 password 잘못!");
        }
    }
}
