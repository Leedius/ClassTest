package study2;

public class Student {
    private String name;
    private int score;

    //객체를 저장할수 있는 생성자
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    //이름 값을 리턴하는 메소드
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }
}
