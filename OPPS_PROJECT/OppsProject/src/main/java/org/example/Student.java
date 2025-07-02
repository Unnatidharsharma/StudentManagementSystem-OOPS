package org.example;

public abstract class Student implements Payable {
    private String name;
    private int rollNo;
    private String course;

    public Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public String getName() { return name; }
    public int getRollNo() { return rollNo; }
    public String getCourse() { return course; }

    public abstract void displayDetails();
}

