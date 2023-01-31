package study2;

public class Account {
    int money;

    //static이 붙었을시 iyul은 한 객체만 바꿔도 전부가 바뀐다.
    static double iyul;

    //static 전용 변수 문법
    static {
        iyul = 5.0;
    }

    public Account(){
        money = 1000;
        //생성자에서는 객체 생성할 때 호출되므로 static변수가 적용안된다.
        iyul = 5.0;
    }

}
