package main.lesson10.task_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contact {
  public String name;
  public String phone_number;

  public Contact(String name, String phone_number) {
    this.name = name;
    this.phone_number = phone_number;
  }

  public static void main(String[] args) {
    List<Contact> contacts = new ArrayList<>();

    while (true) {
      System.out.println("Главное меню");
      System.out.println("1 - добавить новый контакт");
      System.out.println("2 - просмотреть все контакты");
      System.out.println("3 - обновить информацию о конкретном контакте");
      System.out.println("4 - выполнить поиск контактов по имени");
      System.out.print("Выберите цифру: ");
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      System.out.println("---");

      String name;
      String phone_number;

      switch (a) {
        case 1:
          System.out.println("Добавляем новый контакт");
          System.out.print("Введите имя: ");
          name = scan.next();
          System.out.print("Введите телефонный номер: ");
          phone_number = scan.next();
          contacts.add(new Contact(name, phone_number));
          System.out.println("Новый контакт успешно добавлен");
          break;
        case 2:
          System.out.println("Отображаем все контакты");
          contacts.forEach(t -> {
            System.out.println(t.name + ", " + t.phone_number);
          });
          System.out.println("Все контакты отображены");
          break;
        case 3:
          int i = 0;
          for (Contact t : contacts) {
            System.out.println(i + " - " + t.name + ", " + t.phone_number);
            i++;
          }
          ;
          System.out.println("Выберите контакт для обновления: ");
          int contact_index = scan.nextInt();
          System.out.print("Введите имя: ");
          name = scan.next();
          System.out.print("Введите телефонный номер: ");
          phone_number = scan.next();
          Contact contact = contacts.get(contact_index);
          contact.name = name;
          contact.phone_number = phone_number;
          System.out.println("Контакт успешно обновлён");
          break;
        case 4:
          System.out.print("Введите имя контакта для поиска: ");
          name = scan.next();
          contacts.forEach(t -> {
            if (t.name.toLowerCase().contains(name.toLowerCase())) {
              System.out.println(t.name + ", " + t.phone_number);
            }
          });
          System.out.println("Поиск контактов по имени успешно выполнен");
        default:
          break;
      }

      System.out.println("---");
    }
  }

}
