package com.careerit.cj.day11;

record Student(int id, String name, double fee) { }

public class RecordExample {

    public static void main(String[] args) {
        Student student = new Student(1001, "Krish", 55000);
        System.out.println(student);
    }
}
