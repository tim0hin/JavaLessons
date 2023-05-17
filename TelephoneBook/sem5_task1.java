package TelephoneBook;
import java.util.*;

public class sem5_task1 {
    public static void main(String[] args) {
        // Реализуйте структуру телефонной книги с помощью HashMap, 
        // учитывая, что 1 человек может иметь несколько телефонов.

        TelephoneBook phoneBook = new TelephoneBook();

        // Добавляем контакты
        phoneBook.addContact("Иван Иванов", "+79991234567");
        phoneBook.addContact("Петр Петров", "+79998887766");
        phoneBook.addContact("Иван Иванов", "+79995553322");

        // Получаем телефоны для контакта
        ArrayList<String> phones = phoneBook.getPhones("Иван Иванов");
        System.out.println("Телефоны для контакта Иван Иванов: " + phones.toString());

        // Получаем список всех контактов
        ArrayList<String> contacts = phoneBook.getAllContacts();
        System.out.println("Все контакты: " + contacts.toString());

        // Получаем список всех телефонов
        ArrayList<String> allPhones = phoneBook.getAllPhones();
        System.out.println("Все телефоны: " + allPhones.toString());

        // Удаляем контакт
        phoneBook.removeContact("Петр Петров");

        // Проверяем, что контакт удален
        contacts = phoneBook.getAllContacts();
        System.out.println("Все контакты после удаления: " + contacts.toString());

    }
}
