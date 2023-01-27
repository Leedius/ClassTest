package study;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        //반지름을 변경하는 방법
//        c1.r = 10;          //이방법은 잘못된 데이터값이 들어가면 확인이 힘들고 방지할 수가 없다.
        c1.setR(10);        //이방법은 잘못된 데이터값이 들어가면 방지가 가능하다.
        System.out.println(c1.getCircumference());
    }
}
