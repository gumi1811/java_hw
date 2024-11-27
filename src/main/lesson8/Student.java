package main.lesson8;

public class Student {
  String name;
  String surname;
  String address;
  int id;

  @Override
  public String toString() {
    return "Student{" +
      "name='" + name + '\'' +
      ", surname='" + surname + '\'' +
      ", address='" + address + '\'' +
      ", id=" + id +
      '}';
  }

  public static void main(String[] args) {
    Student student1 = new Student();
    student1.name = "Алиса";
    student1.surname = "Смит";
    student1.address = "Коктем-2";
    student1.id = 24;

    Student student2 = new Student();
    student2.name = "Азамат";
    student2.surname = "Уразаков";
    student2.address = "Майлина, 142";
    student2.id = 28;

    Student student3 = new Student();
    student3.name = "Кристина";
    student3.surname = "Орбакайте";
    student3.address = "Алматы-1";
    student3.id = 32;

    System.out.println(student1.toString());
    System.out.println(student2.toString());
    System.out.println(student3.toString());

  }
}
