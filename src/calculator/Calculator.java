//Calculator 클래스를 완성하여 계산기 프로그램을 완성해보세요.
//- 계산기 클래스는 정수 두 개와 연산자를 멤버로 갖는다. 모든 멤버를 선언해보세요.
//- 계산기 클래스는 더하기, 뺴기, 나눗셈, 곱셈 기능을 가지고 있습니다.
//  각각의 메소드를 통해 연산의 결과를 리턴하는 메소드를 기능별로 하나씩 만드세요
//- 계산기 클래스를 사용하는 클래스를 만들어 계산기 프로그램을 실행하여 보세요.
//  main메소드에서는 두 정수와 연산자를 scanner로 입력받습니다.
//  입력받은 연산자에 따라 더하기, 뺴기, 곱셈, 나눗셈 중 하나를 실행합니다. 실행 후 결과를 출력해보세요.
//  실행 결과는 아래와 같아야 합니다. (굵은 기울임체는 입력받는 수입니다.)
//  -결과-
//  첫 번째 수 : 10
//  두 번째 수 : 20
// 연산자 : +
// 10 + 20 = 30

package calculator;

import java.sql.SQLOutput;
import java.sql.Time;

public class Calculator {
    private int x, y;
    private String operator;

    //디폴트값을 가지는 생성자
    public Calculator() {

    }

    //x, y, operator값을 설정하는 생성자
    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //x, y값을 변경하는 메소드
    public void setData(int x, int y) {
        this.x = x;
        this.y = y;
    }


//    public void setX(int x){
//        this.x = x;
//    }

    public int plus() {
        return x + y;
    }

    public int subtrack() {
        return x - y;
    }

    public int multiply() {
        return x * y;
    }

    public double division() {
        return (double) x / y;
    }
}
