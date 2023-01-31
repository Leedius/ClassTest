package study2;

//static은 변수 및 메소드에서 사용 가능.
//staric이 선언된 변수 및 메소드는 공용을 의미한다.
//static이 붙은 변수 및 메소드는 자바 문법상 클래스 안에서 정의가 되지만, 클래스에 속한 건 아니다.
//static 변수 및 메소드는 객체가 생성되기 전에 생성된다.
//static은 공용 변수
//static을 썻을시 각자의 개체에서 num을 공유하는 느낌.
public class CntTest {
    public static void main(String[] args) {
        //객체 3개 생성
        //각자의 객체에 num이라는 변수가 다 따로 존재
        Cnt c1 = new Cnt();
        Cnt c2 = new Cnt();
        Cnt c3 = new Cnt();

    }
}


class Cnt{

    static int num = 0;

    //생성자
    public Cnt(){
        num++;
        System.out.println("객체 생성 " + num);
    }
}