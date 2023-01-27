package rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        //(0,0) (0,0)의 좌표가 초기화됨
        Rectangle r = new Rectangle();
        //(1,1) (2,3)의 좌표가 초기화됨
        Rectangle s = new Rectangle(1,1,2,3);

        r.show();
        s.show();
        System.out.println(s.square());
        r.set(-2,2,-1,4);
        r.show();
        System.out.println(r.square());
        if(r.equals(s))
            System.out.println("두 사각형은 같습니다.");
    }
}
