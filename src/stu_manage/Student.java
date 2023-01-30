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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }
}

