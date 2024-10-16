package lesson_3;

import java.util.*;

public class StudentGradeProcessor {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 16,
                        Arrays.asList(
                                new Grade("Science", 92),
                                new Grade("English", 85)),
                        "High School A",
                        new Address("New York", "1st Ave")),

                new Student("Bob", 18,
                        Arrays.asList(
                                new Grade("Math", 92),
                                new Grade("Science", 88)),
                        "High School B",
                        new Address("Los Angeles", "2nd St")),

                new Student("Charlie", 15,
                        Arrays.asList(
                                new Grade("Math", 95),
                                new Grade("History", 80)),
                        "High School A",
                        new Address("New York", "3rd Ave")),

                new Student("David", 18,
                        Arrays.asList(
                                new Grade("Math", 88),
                                new Grade("English", 90)),
                        "High School C",
                        new Address("New York", "4th Ave")),

                new Student("Eva", 16,
                        Arrays.asList(
                                new Grade("Math", 89),
                                new Grade("Science", 94)),
                        "High School A",
                        new Address("New York", "5th Ave"))
        );

        List<StudentGradeRecord> topGrades = students.stream()
                .filter(student -> student.age > 15 && "New York".equals(student.address.city))
                .flatMap(student -> student.grades.stream()
                        .map(grade -> new StudentGradeRecord(student.name, student.school, grade.subject, grade.score)))
                .sorted(Comparator.comparingDouble(StudentGradeRecord::score).reversed())
                .limit(3)
                .toList();

        System.out.println("Top 3 Grades:");
        for (StudentGradeRecord record : topGrades) {
            System.out.println(record.studentName() + ", " + record.school() + ", " + record.subject() + ", " + record.score());
        }
    }
}
