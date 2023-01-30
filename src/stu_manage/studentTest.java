package stu_manage;

import java.util.Scanner;

public class studentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //studentTest에 studenManage에 대한 객체 생성
        StudentManage sm = new StudentManage();

        System.out.println("학생관리 프로그램을 실행합니다.");

        Student[] students;

        //5번 프로그램종료할 때까지 무한반복 따라서 while
        while(true){
            System.out.print("1)학생등록 2)학생정보변경(연락처) 3)학생정보출력 4)모든학생정보 출력 5)프로그램종료 : ");
            int opition = sc.nextInt();
            //조건이 범위가 아니기 때문에 switch-case문을 쓰는게 적당하다.
            switch(opition){
                case 1 :
                    sm.regStudent();
                    break;
                case 2 :

                    sm.setStuInfo();
                    break;
                case 3 :
                    sm.showStuInfo();
                    break;
                case 4 :
                    sm.allShowStuInfo();
                    break;
                case 5 :
                    System.out.println("프로그램 종료");
                    System.exit(0);             //프로그램 종료 코드
            }

        //        students[cnt] = new StudentInfo(name, age, callNumer, grade);

            }
    }
}

