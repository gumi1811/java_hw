package main.lesson10.task_02;

public enum Weekday {
  MONDAY,
  TUESDAY,
  WEDNESDAY,
  THURSDAY,
  FRIDAY,
  SATURDAY,
  SUNDAY;

  public boolean isWeekDay(Weekday weekday) {
    switch (weekday) {
      case MONDAY:
      case TUESDAY:
      case WEDNESDAY:
      case THURSDAY:
      case FRIDAY:
        return true;
      default:
        return false;
    }
  }

  public boolean isHoliday(Weekday weekday) {
    return !isWeekDay(weekday);
  }

  public static void main(String[] args) {
    for (Weekday weekday : Weekday.values()) {
      System.out.println(weekday + " - " +
        (weekday.isHoliday(weekday) ? "праздничный день" : "рабочий день"));
    }
  }
}
