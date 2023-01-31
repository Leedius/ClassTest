package stu_manage;

import study.CallByReference;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String callNumber;
    private String grade;

    public Student(String name, int age, String callNumber, String grade){
        this.name = name;
        this.age = age;
        this.callNumber = callNumber;
        this.grade = grade;
    }

    //학생의 모든 정보를 출력하는 메소드
    //이름 : 장길동, 나이 : 30, 연락처 : 010-0000-0000, 학점 : B
    public void printStuInfo(){
        System.out.println("이름 : " + name +
                ", 나이 : " + age +
                ", 연락처 : " + callNumber +
                ", 학점 : " + grade);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCallNumber() { return callNumber;}

    public String getGrade() {
        return grade;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }
}

