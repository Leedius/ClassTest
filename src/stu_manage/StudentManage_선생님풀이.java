package stu_manage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentManage_선생님풀이 {
    Scanner sc;
    Student[] students;         //학생정보가 들어갈 배열 선언
    int index;                  //학생순서 변수 선언

    //생성자
    public StudentManage_선생님풀이() {
        sc = new Scanner(System.in);
        students = new Student[3];          //학생이 3명 들어갈 공간(배열) 생성.
        index = 0;                          //학생순서 변수 초기화
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

    //학생 정보출력
    //정보를 열람할 학생
    //이름 : 홍길동, 나이 : 20, 연락처 : 010-0000-0000, 학점 : A
    public void showStuInfo() {
        boolean flag = true;
        //열람할 학생의 이름이 맞을때까지 반복해야 하므로 while반복문
        //복습 : while문안에 조건이 false일때 빠져나온다.
        while(flag){
            System.out.println("정보를 열람할 학생 : ");
            //검색할 학생이름 변수 inputName를 만들어 저장
            String inputName = sc.next();

            for(int i = 0; i < index; i++){
                //i번째 학생을 불러서 이름을 받아와서(getName) 입력한이름(inputName)과 같은지 확인
                if(students[i].getName().equals(inputName)){
                    System.out.println("\n요청하신 학생의 정보입니다.");
                    students[i].printStuInfo();
                    flag = false;
                    break;
                }
            }
            //for문을 빠져나오고 무조건 실행하기 때문에 조건문을 만들어 flag가 반대값일때 실행안되게 설정
            if(!flag) {
                System.out.println("해당하는 학생이 존재하지 않습니다. 다시 입력하세요.");
            }
        }
    }


    //모든 학생의 정보 출력
    //모든 학생의 정보입니다. 현재 총 학생 수는 2명입니다.
    public void allShowStuInfo() {
        if (index == 0) {
            System.out.println("현재 등록된 학생이 없습니다.");
        }
        else {
            System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 " + index + "명 입니다.");
            //이름 : 홍길동, 나이 : 20, 학점 : A
            //이름 : 장길동, 나이 : 30, 학점 : B
            //index가 등록된 학생 수를 의미 하므로 students.length가 아닌 index가 되어야한다.
            //students.length를 사용할때는 배열에 빈공간이 있는 경우 값이 달라지기 때문에
            //students.length는 사용해서는 안된다.
            for(int i = 0; i < index; i++) {
                students[i].printStuInfo();
            }
        }
    }
}

