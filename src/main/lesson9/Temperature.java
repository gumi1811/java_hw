package main.lesson9;

public class Temperature {
  private double temperature_value;
  private char scale_symbol;

  public Temperature(double temperature_value) {
    this.temperature_value = temperature_value;
    this.scale_symbol = 'C';
  }

  public Temperature(char scale_symbol) {
    this.temperature_value = 0;
    this.scale_symbol = scale_symbol;
  }

  public Temperature(double temperature_value, char scale_symbol) {
    this.temperature_value = temperature_value;
    this.scale_symbol = scale_symbol;
  }

  public Temperature() {
    this.temperature_value = 0;
    this.scale_symbol = 'C';
  }

  public double getTemperature_value() {
    return temperature_value;
  }

  public void setTemperature_value(double temperature_value) {
    this.temperature_value = temperature_value;
  }

  public char getScale_symbol() {
    return scale_symbol;
  }

  public void setScale_symbol(char scale_symbol) {
    this.scale_symbol = scale_symbol;
  }

  public double getDegreesInCelsium() {
    if (scale_symbol == 'C') {
      return temperature_value;
    } else {
      return 5 * (temperature_value - 32) / 9.0;
    }
  }

  public double getDegreesInFahrenheit() {
    if (scale_symbol == 'F') {
      return temperature_value;
    } else {
      return 9 * (temperature_value / 5.0) + 32;
    }
  }

  public void setFields(double temperature_value, char scale_symbol) {
    this.temperature_value = temperature_value;
    this.scale_symbol = scale_symbol;
  }

}
