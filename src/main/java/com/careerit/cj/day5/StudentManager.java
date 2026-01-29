package com.careerit.cj.day5;

class Student {
    private String id;
    private String name;

    public Student(){
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Id   :" + id);
        System.out.println("Name :" + name);
    }
}

public class StudentManager {

    public static void main(String[] args) {

        Student student1 = new Student("ST1001","Krish");
        student1.showDetails();

        Student student2 = new Student("ST1002","Manoj");
        student2.showDetails();
    }

}
