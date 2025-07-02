package org.example;

public class DistanceStudent extends Student {
    public DistanceStudent(String name, int rollNo, String course) {
        super(name, rollNo, course);
    }

    @Override
    public double calculateFees() {
        return 15000.0; // Reduced fee for distance learners
    }

    @Override
    public void displayDetails() {
        System.out.println("Distance Student:");
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Course: " + getCourse());
        System.out.println("Fees: " + calculateFees());
    }
}

