package rectangle;

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
