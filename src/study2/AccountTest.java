package study2;

import java.util.Stack;

public class AccountTest {
    public static void main(String[] args) {
        //계좌 객체 생성
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();

        //각 개체에 대한 이율 변경
        a1.iyul = 10.0;
        //a2.iyul = 10.0;
        a3.iyul = 10.0;

        //각 개체에 대한 이율을 한꺼번에 변경
        System.out.println(a1.iyul);
        System.out.println(a2.iyul);

        Account a4 = new Account();

        //iyul이라는 변수에 static이 붙어 있기 때문에 위에서 이미 10.0값으로 바뀐 값으로 객체가 생성
        //a4.iyul대신 Account.iyul을 사용한다 static이 붙어 Account의 공용 변수 이기때문에
        System.out.println(a4.iyul);

        //복습 Math(클래스).random()(메소드) -> !!클래스.뒤에 메소드가 오면 static메소드다.
        Math.random();
    }
}
