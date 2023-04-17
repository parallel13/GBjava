import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    Map<String, List<String>> book = new HashMap<>();

    void showAll(){
        System.out.println(book);
    }

    void add(String name, String number){
        if (!doesNumberExist(number)) {
            if (!book.containsKey(name)) {
                book.put(name, new ArrayList<>());
            }
            book.get(name).add(number); //
        }else{
            System.out.println("Такой номер уже есть!");
        }
    }

    boolean doesNumberExist(String number){
        for (String key : book.keySet()) { //
            if (book.get(key).contains(number)) {
                return true;
            }
        }
        return false;
    }

    void showNote(String name){
        if (book.containsKey(name)) {
            System.out.println(name + ": " + book.get(name));
        }else{
            System.out.println("Такого имени нет!");
        }
    }

    void findNoteByNumber(String number){
        for (String key : book.keySet()) {
            if (book.get(key).contains(number)) {
                showNote(key);
                return;
            }
        }
        System.out.println("Такого номера нет!");
    }

    void removeNote(String name){
        if (book.containsKey(name)) {
            book.remove(name);
        }else{
            System.out.println("Такого имени нет!");
        }

    }

    void removeNumber(String number){
        for (String key : book.keySet()) {
            if (book.get(key).contains(number)) {
                book.get(key).remove(number);
                return;
            }
        }
        System.out.println("Такого номера нет!");
    }
}
