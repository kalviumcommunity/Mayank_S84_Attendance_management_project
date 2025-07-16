package com.school;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the School Attendance System Project!");
        System.out.println("Session 1: Project Setup and Orientation Complete.");

        Student[] students = new Student[2];
        Course[] courses = new Course[2];

        students[0] = new Student();
        students[0].setDetails(1, "Mayank Sharma");

        students[1] = new Student();
        students[1].setDetails(2, "Avinash Guleria");

        courses[0] = new Course();
        courses[0].setDetails("UH24001","Front-end Web Development");

        courses[1] = new Course();
        courses[1].setDetails("UH24002", "Object riented Programming");

        System.out.println("     Registered Students");
        for (Student student : students) {
            student.displayDetails();
        }
        System.out.println("     Available Courses");
        for (Course course : courses) {
            course.displayDetails();
        }
    }
}
