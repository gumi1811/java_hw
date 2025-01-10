package main.lesson9;

public class Student {
  String name;
  Integer id;
  Integer year;

  public Student(String name, Integer id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public Integer getId() {
    return id;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public static void main(String[] args) {
    Student student = new Student("Гульмира", 5);
    System.out.println(student.getName());
    System.out.println(student.getId());
    student.setYear(2024);
    System.out.println(student.year);
  }
}
