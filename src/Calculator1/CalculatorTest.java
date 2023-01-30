package Calculator1;

import java.awt.*;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 수 : ");
        int a = sc.nextInt();
        System.out.print("두번째 수 : ");
        int b = sc.nextInt();
        System.out.print("연산자 : ");
        String oper = sc.next();

        switch(oper){
            //"+"일때만 Add 객체 생성
            case "+" :
                Add add = new Add();
                add.setValue(a, b);
                System.out.println(a + " " + oper + " " + b + " = " + add.calculate());
                break;

            case "-" :
                //"-"일때만 sub 객체 생성
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.println(a + " " + oper + " " + b + " = " + sub.calculate());
                break;

            case "*" :
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.println(a + " " + oper + " " + b + " = " + mul.calculate());
                break;

            case "/" :
                Div div = new Div();
                div.setValue(a, b);
                System.out.println(a + " " + oper + " " + b + " = " + div.calculate());
                break;

            default :
                System.out.println("잘못 입력하였습니다.");

        }

    }
}
