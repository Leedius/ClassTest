package stu_manage;

import java.io.ObjectOutputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentManage {
    Scanner sc;
    Student[] students;         //학생정보가 들어갈 배열 선언
    int index;                  //학생등록수 변수 선언
    boolean find;               //
    String setNumber;           //번호 변경 변수 선언

    //생성자
    public StudentManage() {
        sc = new Scanner(System.in);
        students = new Student[3];          //학생이 3명 들어갈 공간(배열) 생성.
        index = 0;                          //학생등록된수 변수 초기화
    }


    //학생등록
    public void regStudent() {
        //학생이 3명을 초과하면 등록 금지!
        if (index < students.length) {
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
        } else {
            System.out.println("더 이상 등록이 불가합니다.");
            System.out.println("==============================");
        }

    }



    //학생정보변경(연락처)
    public void setStuInfo() {
        System.out.println("학생의 연락처를 변경합니다");

        //해당하는 학생이 존재하지 않습니다. 다시 입력하세요를 출력하기위해 find를 false로 초기화
        find = false;

        //()안에 들어가는 조건이 true될때 까지 무한루프
        while (!find) {
            System.out.print("변경 학생 : ");
            String name = sc.next();
            for (int i = 0; i < index; i++) {
                if (students[i].getName().equals(name)) {
                    System.out.print("연락처 : ");
                    setNumber = sc.next();
                    students[i].setCallNumber(setNumber);
                    System.out.println("변경완료되었습니다.");
                    find = true;
                    break;
                }
            }
            if(!find){
                System.out.println("해당하는 학생이 존재하지않습니다. 다시 입력하세요.");
            }
        }
    }
    //학생정보출력
    public void showStuInfo(){
        find=false;
        while(!find){
            System.out.print("정보를 열람할 학생 : ");
            String name = sc.next();
            for(int i = 0; i<index; i++) {
                if (students[i].getName().equals(name)) {
                    System.out.println("\n요청하신 학생의 정보입니다.");
                    students[i].printStuInfo();
                    find = true;
                    break;
                }
            }
            if (!find) {
                System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요.");
            }
        }
    }

    //모든학생정보출력
    //모든 학생의 정보입니다. 현재 총 학생 수는 2명입니다.
    //이름 : 홍길동, 나이 : 20, 학점 : A
    //이름 : 장길동, 나이 : 30, 학점 : B
    public void allShowStuInfo(){
        if(index==0){
            System.out.println("현재 등록된 학생이 없습니다.");
        }
        else {
        System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 "+index+"명 입니다.");
        for(int i=0; i<index; i++) {
            students[i].printStuInfo();
        }
        }
    }
}
