package main.lesson9;

public class Student {
  String name;
  Integer id;
  Integer year;

  public Student(String name, Integer id) {
    this.name = name;
    this.id = id;
    this.year = 1;
  }

  public String getName() {
    return name;
  }

  public Integer getId() {
    return id;
  }

  public void increaseYear(Integer year) {
    this.year = this.year + 1;
  }

  public static void main(String[] args) {
    Student student = new Student("Гульмира", 5);
    System.out.println(student.getName());
    System.out.println(student.getId());
    student.increaseYear(1);
    System.out.println(student.year);
  }
}
