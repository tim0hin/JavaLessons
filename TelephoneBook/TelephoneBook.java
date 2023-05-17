package TelephoneBook;
import java.util.ArrayList;
import java.util.HashMap;

public class TelephoneBook {
    private HashMap<String, ArrayList<String>> contacts;

    public TelephoneBook() {
        contacts = new HashMap<String, ArrayList<String>>();
    }

    // Метод добавления контакта
    public void addContact(String name, String phone) {
        ArrayList<String> phones;
        if (contacts.containsKey(name)) {
            phones = contacts.get(name);
        } else {
            phones = new ArrayList<String>();
        }
        phones.add(phone);
        contacts.put(name, phones);
    }

    // Метод удаления контакта
    public void removeContact(String name) {
        contacts.remove(name);
    }

    // Метод получения списка телефонов для контакта
    public ArrayList<String> getPhones(String name) {
        return contacts.get(name);
    }

    // Метод получения списка всех контактов
    public ArrayList<String> getAllContacts() {
        ArrayList<String> result = new ArrayList<String>();
        for (String name : contacts.keySet()) {
            result.add(name);
        }
        return result;
    }

    // Метод получения списка всех телефонов
    public ArrayList<String> getAllPhones() {
        ArrayList<String> result = new ArrayList<String>();
        for (ArrayList<String> phones : contacts.values()) {
            result.addAll(phones);
        }
        return result;
    }
}