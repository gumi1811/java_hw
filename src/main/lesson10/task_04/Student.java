package main.lesson10.task_04;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
  private int grade;

  public Student(int grade) {
    this.grade = grade;
  }

  public static void main(String[] args) {
    Student student1 = new Student(4);
    Student student2 = new Student(5);
    Student student3 = new Student(3);
    ArrayList<Student> students = new ArrayList<>();
    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.forEach(t -> {
      System.out.println(t.grade);
    });
  }
}
