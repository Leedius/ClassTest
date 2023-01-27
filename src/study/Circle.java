package study;

public class Circle {

    //접근제한자 private : 현재 class 외에서는 접근이 불가능하다. 지역변수에는 사용X
    private int r;         //원의 반지름.

    public void setR(int r){
        if(r<0){
            this.r = 0;
        }
        else {
            this.r = r;
        }
    }

    //원 둘레 리턴 메소드
    public double getCircumference(){
        return 2 * 3.14 * r;
    }

    //원 넓이 리턴 메소드
    public double getCircleArea(){
        return 3.14*r*r;
    }
}
