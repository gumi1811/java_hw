package main.lesson8;

import java.util.Arrays;

public class Rectangle {
  int length;
  int width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  int returnArea() {
    return length * width;
  }

  public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle(5, 9);
    System.out.println(rectangle1.returnArea());

    Rectangle rectangle2 = new Rectangle(10, 14);
    System.out.println(rectangle2.returnArea());
  }
}
