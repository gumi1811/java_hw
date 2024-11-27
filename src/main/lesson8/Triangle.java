package main.lesson8;

public class Triangle {
  int a;
  int b;
  int c;

  public Triangle(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public static void main(String[] args) {
    Triangle triangle = new Triangle(3, 4, 5);
    int p = (triangle.a + triangle.b + triangle.c);
    System.out.println("Площадь: " + Math.sqrt(p * (p - triangle.a) * (p - triangle.b) * (p - triangle.c)));
    System.out.println("Периметр: " + p);
  }
}
