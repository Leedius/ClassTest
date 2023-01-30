package test7_10;

//Student 클래스를 아래의  문제를 풀면서 완성하시오.
//- Student 클래스는 이름, 나이, 주소, 학번, 연락처를 멤버로 가지고 있습니다.
//  각각의 멤버를 선언하고 모든 멤버를 초기화 하는 메소드를 만드세요.
//- Student 클래스에서 멤버 각각의 값을 변경하는 메소드를 만드세요.
//- Student 클래스에서 각각의 멤버 값을 리턴하는 메소드를 만드세요.
//- Student 클래스에 모든 멤버의 값을 출력하는 메소드를 만드세요.

//student 클래스의 이름, 나이, 주소, 학번, 연락처를 멤버변수로 선언
public class Student {
    String studentName;
    int studentAge;
    String studentLocation;
    String studentNumber;
    String studentCallNumber;

    //매개변수 값으로 초기화하는 생성자
    public Student(String studentName,
                    int studentAge,
                    String studentLocation,
                    String studentNumber,
                    String studentCallNumber){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentLocation = studentLocation;
        this.studentNumber = studentNumber;
        this.studentCallNumber = studentCallNumber;

    }


    //학생정보를 초기화 하는 메소드
//    public void setStudentInfo(String studentName,
//                               int studentAge,
//                               String studentLocation,
//                               String studentNumber,
//                               String studentCallNumber) {
//        this.studentName = studentName;
//        this.studentAge = studentAge;
//        this.studentLocation = studentLocation;
//        this.studentNumber = studentNumber;
//        this.studentCallNumber = studentCallNumber;
//    }

    //학생이름을 변경하는 메소드
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    //학생나이를 변경하는 메소드
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    //학생주소를 변경하는 메소드
    public void setStudentLocation(String studentLocation) {
        this.studentLocation = studentLocation;
    }

    //학생번호를 변경하는 메소드
    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }

    //학생전화번호를 변경하는 메소드
    public void setStudentCallNumber(String studentCallNumber){
        this.studentCallNumber = studentCallNumber;
    }

    //학생이름을 리턴하는 메소드
    public String getStudentName() {
        return studentName;
    }

    //학생나이를 리턴하는 메소드
    public int getStudentAge() {
        return studentAge;
    }

    //학생주소를 리턴하는 메소드
    public String getStudentLocation() {
        return studentLocation;
    }

    //학생번호를 리턴하는 메소드
    public String getStudentNumber() {
        return studentNumber;
    }

    //학생전화번호를 리턴하는 메소드
    public String getStudentCallNumber() {
        return studentCallNumber;
    }

    public void printStudentInfo(){
        System.out.println("학생이름 : "+studentName);
        System.out.println("학생나이 : "+studentAge);
        System.out.println("학생주소 : "+studentLocation);
        System.out.println("학생번호 : "+studentNumber);
        System.out.println("학생전화번호 : "+studentCallNumber);
    }
}