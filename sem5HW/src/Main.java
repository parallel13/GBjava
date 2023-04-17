import java.util.*;

public class Main {

    public static void main(String[] args) {
//ex1();
ex2();

    }

 static void ex1(){
     /*
      * Реализуйте структуру телефонной книги с помощью HashMap,
      * учитывая, что 1 человек может иметь несколько телефонов.
      */
PhoneBook phoneBook= new PhoneBook();
     phoneBook.add("Василий", "9811327597");
     phoneBook.add("Дмитрий", "9312255667");
     phoneBook.add("Михаил", "9552358700");
     phoneBook.add("Виктор", "9811112233");
     phoneBook.add("Сергей", "9213875465");
     phoneBook.add("Пётр", "9113335577");
     phoneBook.showAll();
     phoneBook.findNoteByNumber("9113335577");
     phoneBook.removeNumber("9213875465");
     phoneBook.showNote("Дмитрий");
     phoneBook.removeNote("Виктор");
     phoneBook.removeNote("Николай");
     phoneBook.showAll();

 }
 static void ex2(){
     /*
      * Пусть дан список сотрудников:
      * Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,
      * Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова,
      * Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,
      * Иван Мечников, Петр Петин, Иван Ежов.
      * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
      * Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
      */
     String employee = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, " +
             "Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, " +
             "Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, " +
             "Иван Мечников, Петр Петин, Иван Ежов";

     String[] array = employee.split(", ");
     List<String> names = new ArrayList<>();
     List<Integer> freq = new ArrayList<>();

     for (int i = 0; i < array.length; i++) {
         String name = array[i].split(" ")[0];
         if (names.contains(name)) {
             int index = names.indexOf(name);
             freq.set(index, freq.get(index) + 1);
         } else {
             names.add(name);
             freq.add(1);
         }
     }

     Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());

     for (int i = 0; i < names.size(); i++) {
         if (map.containsKey(freq.get(i))) {
             List<String> list = map.get(freq.get(i));
             list.add(names.get(i));
         } else {
             List<String> list = new ArrayList<>();
             list.add(names.get(i));
             map.put(freq.get(i), list);
         }

     }

     System.out.println(map);
 }

 }

