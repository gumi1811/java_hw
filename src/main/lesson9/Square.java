package main.lesson9;

import java.util.Scanner;

public class Square {
  int a;

  public Square(int a) {
    this.a = a;
  }

  public double getSquare() {
    return a * a;
  }

  public double getPerimeter() {
    return 4 * a;
  }

  public double getDiagonalLength() {
    return a * Math.sqrt(2);
  }

  public static void main(String[] args) {
    System.out.print("Введите значение стороны квадрата: ");
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    Square square = new Square(a);
    System.out.println(square.getSquare());
    System.out.println(square.getPerimeter());
    System.out.println(square.getDiagonalLength());
  }
}
