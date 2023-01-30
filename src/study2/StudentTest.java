package study2;

import javax.naming.Name;

public class StudentTest {
    public static void main(String[] args) {
        //Student 객체가 5개 저장될 수 있는 배열 공간생성

        Student[] students = new Student[5];


        //이름은 김길동, 나이는 20살로 초기값을 갖는
        //학생 객체 s1을 생성
        Student s1 = new Student("김길동", 90);
        Student s2 = new Student("이길동", 80);
        Student s3 = new Student("박길동", 70);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = new Student("정길동", 60);
        students[4] = new Student("최길동", 50);


        //1.배열에 들어간 학생 중 이름이 정길동인 학생의 점수를 출력
        //배열에 직접 찾아가서 학생을 확인하는 느낌
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals("정길동")) {          //students[i](자료형).getName()
                System.out.println(students[i].getScore());
                break;
            }
        }

        //1. for-each문
        //students(학생집)에서 꺼내온 학생 student
        //학생을 나에게 있는 곳에 각각 불러서 확인하는 느낌
        for (Student student : students) {              //e -> each하나하나 빼서 똑같은 Student자료형에 담는다
            if (student.getName().equals("정길동")) {
                System.out.println(student.getScore());
                break;
            }
        }


        //2.배열에 저장된 모든 학생들의 점수의 합 출력
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getScore();
        }
        System.out.println(sum);

        //2번 문제 for-each문
        int sum1 = 0;
        for (Student student : students){
            sum1+=student.getScore();
        }
        System.out.println(sum1);


        //3.배열에 저장된 학생 중 점수가 70점 이상인 학생들의 이름, 점수 출력
        for(int i = 0; i < students.length; i++){
            if(students[i].getScore() >= 70){
                System.out.println("이름 : "+ students[i].getName());
                System.out.println("점수 : "+ students[i].getScore());
            }
        }
    }
}
