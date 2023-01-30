package stu_manage;

import java.io.ObjectOutputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentManage {
    Scanner sc;
    Student[] students;         //학생정보가 들어갈 배열 선언
    int index;                  //학생순서 변수 선언

    //생성자
    public StudentManage(){
        sc = new Scanner(System.in);
        students = new Student[3];          //학생이 3명 들어갈 공간(배열) 생성.
        index = 0;                          //학생순서 변수 초기화
    }





    //학생등록
    public void regStudent() {
        //학생이 3명을 초과하면 등록 금지!
        if(index<students.length){
            System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");
            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("나이 : ");
            int age = sc.nextInt();

            System.out.print("연락처 : ");
            String callNumber = sc.next();

            System.out.print("학점 : ");
            String grade = sc.next();

            //입력받은 정보를 가진 학생 객체를 생성
            Student stu = new Student(name, age, callNumber, grade);

            //생성한 객체를 배열에 저장
            students[index++] = stu;            //한번 등록할때마다 index를 1씩증가해서 차곡차곡 배열에 저장
            System.out.println("==============================");
        }
        else {
            System.out.println("더 이상 등록이 불가합니다.");
            System.out.println("==============================");
        }

    }

    //학생정보변경(연락처)
    public void setStuInfo() {
//        for(students)
    }

    //학생정보출력
    public void showStuInfo(){
        System.out.print("정보를 열람할 학생 : ");
        String scName = sc.next();
        for(Student student : students){
  //          if(student.getName().equals(students[student])){

            }

    }
}
