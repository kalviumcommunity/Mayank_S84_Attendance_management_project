package com.school;

public class Course {
    String courseId;
    String name;

    public void setDetails(String id, String courseName) {
        this.courseId = id;
        this.name = courseName;
    }

    public void displayDetails() {
        System.out.println("Course ID: " + this.courseId + ", Name: " + this.name);
    }
}
