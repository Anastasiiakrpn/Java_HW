package lesson_3;

import java.util.List;

public class Student {
    String name;
    int age;
    List<Grade> grades;
    String school;
    Address address;

    public Student(String name, int age, List<Grade> grades, String school, Address address) {
        this.name = name;
        this.age = age;
        this.grades = grades;
        this.school = school;
        this.address = address;
    }

}
