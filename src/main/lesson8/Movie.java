package main.lesson8;

import java.util.Arrays;

public class Movie {
  String title;
  String studio;
  String rating;

  public Movie(String title, String studio, String rating) {
    this.title = title;
    this.studio = studio;
    this.rating = rating;
  }

  public Movie(String title, String studio) {
    this.title = title;
    this.studio = studio;
    this.rating = "PG";
  }

  @Override
  public String toString() {
    return "Movie{" +
      "title='" + title + '\'' +
      ", studio='" + studio + '\'' +
      ", rating='" + rating + '\'' +
      '}';
  }

  public static void main(String[] args) {
    Movie movie1 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
    System.out.println(movie1);

    Movie movie2 = new Movie("Главный герой","20th Century Studios");
    System.out.println(movie2);
  }
}
