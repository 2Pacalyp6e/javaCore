import java.util.HashMap;

public class MainClass_3 {
    public static void main(String[] args) {
        String[] brands = {"nike", "reebok", "adidas", "armani", "fendi", "gucci", "LV", "fendi", "nike", "TMC", "PUMA"};
        HashMap<String, Integer> fitch = new HashMap<>();
        for (String x : brands) {
            fitch.put(x, fitch.getOrDefault(x,0)+1);
        }
        System.out.println(fitch);
/////Создание тел книги
        PhoneBook book = new PhoneBook();
        book.addContact("Arkadij" , "3275");
        book.addContact("Georgiy", "2565");
        book.addContact("Evganiy", "4487");
        book.addContact("Arman", "7172");
        book.addContact("Arkadij", "4444");
        book.addContact("Arman", "7272");

        ////// поиск по имени
        book.findAndPrint("Arkadij");
        book.findAndPrint("Arman");
        book.findAndPrint("Georgiy");

    }
}