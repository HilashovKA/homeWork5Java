import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork12 {
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Сидаров");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Соколов", List.of("+7(111)111-11-11", "+7(222)222-22-22"));
        phoneBook.put("Сидаров", List.of("+7(333)333-33-33", "+7(444)444-44-44"));
        phoneBook.put("Антонова", List.of("+7(555)555-55-55", "+7(666)666-66-66"));
        phoneBook.put("Иванов", List.of("+7(777)777-77-77", "+7(888)888-88-88"));
    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}