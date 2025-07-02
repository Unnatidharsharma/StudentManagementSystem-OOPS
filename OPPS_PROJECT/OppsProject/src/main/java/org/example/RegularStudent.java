package org.example;

public class RegularStudent extends Student {
    public RegularStudent(String name, int rollNo, String course) {
        super(name, rollNo, course);
    }

    @Override
    public double calculateFees() {
        return 25000.0; // Flat rate for regular students
    }

    @Override
    public void displayDetails() {
        System.out.println("Regular Student:");
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Course: " + getCourse());
        System.out.println("Fees: " + calculateFees());
    }
}

