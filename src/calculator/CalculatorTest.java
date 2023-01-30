package calculator;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        String operator;


        System.out.print("첫 번째 수를 입력하세요 : ");
        x = sc.nextInt();
        System.out.print("두 번째 수를 입력하세요 : ");
        y = sc.nextInt();
        System.out.print("연산자를 입력 하세요 : ");
        operator = sc.next();

        Calculator c = new Calculator();


        //c 객체의 x와 y에 우리가 입력받은 수를 저장
        //첫번째 방법 : 두 수를 세팅하는 메소드 정의
        //두번째 방법 : c라는 객체 생성과 동시에 두 수를 세팅
        Calculator c1 = new Calculator(x,y);


        c.setData(x, y);

        switch(operator){
            //10 + 20 = 30
            case "+" :
                System.out.print(x + " " + operator + " " + y + " = " + c.plus());
                break;

            case "-" :
                System.out.print(x + " " + operator + " " + y + " = " + c.subtrack());
                break;

            case "*" :
                System.out.print(x + " " + operator + " " + y + " = " + c.multiply());
                break;

            case "/" :
                System.out.print(x + " " + operator + " " + y + " = " + c.division());
                break;

            default:
                System.out.println("잘못입력했어요.");

    }
}
}
