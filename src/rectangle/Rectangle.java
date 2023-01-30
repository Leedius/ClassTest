package rectangle;

//다음과 같은 멤버를 가지는 직사각형을 표현하는 Rectangle 클래스를 작성하라.
//- int 타입의 x1, y1, x2, y2 필드 : 사각형을 구성하는 두 점의 좌표
//- 생성자 2개 : 디폴트 생성자와 x1, y1, x2, y2의 값을 설정하는 생성자
//- void set(int  x1, int y1, int x2, int y2) : x1, y1, x2, y2 좌표 설정
//- int sqare() : 사각형 넓이 리턴
//- void show () : 좌표와 넓이 등 직사각형 정보의 화면 출력
//- boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 동일한 넓이면 true리턴
//  Rectangle을 이용한 main() 메소드는 다음과 같으며 이 main() 메소드가 잘 작동하도록 하라.

public class Rectangle {
        int x1, y1, x2, y2;


        //디폴트 생성자
        public Rectangle() {

        }

        //x1, y1, x2, y2의 값을 설정하는 생성자
        public Rectangle(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }


        //x1, y1, x2, y2의 값을 변경하는 메소드
        public void set(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        //사각형의 넓이를 구하는 메소드
        public int square() {
            int square = (x2 - x1) * (y2 - y1)<0 ? ((x2 - x1) * (y2 - y1))*-1 : (x2 - x1) * (y2 - y1);
            return square;
        }

        //사각형의 좌표와 넓이
        //예) 좌표 : (1,2), (4,5) 넓이 : 20
        public void show(){
            System.out.println("좌표 : " + "(" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ") 넓이 : " + square());
        }

        public boolean equals(Rectangle r){
            if((x2-x1)*(y2-y1) == (r.x2-r.x1)*(r.y2-r.y1))
            return true;
            else{
                return false;
            }
        }

}
