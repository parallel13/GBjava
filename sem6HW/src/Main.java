import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

         /*
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
    Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …
    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
    Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
     */
        Map<String, String> parametrsMap = new HashMap<>();
        Set<Laptop> set = new HashSet<>();

        setLaptop(set);
        setParameters(parametrsMap);
        sortedNotebooks(parametrsMap, set);


    }

    static void setLaptop(Set<Laptop> set) {
        Laptop model1 = new Laptop(8, 256, 256, "black", "Windows 11", "i3");
        Laptop model2 = new Laptop(8, 256, 512, "white", "Windows 10", "i3");
        Laptop model3 = new Laptop(10, 512, 1024, "black", "Windows 10", "i5");
        Laptop model4 = new Laptop(16, 1024, 1024, "white", "Windows 11", "i5");
        set.add(model1);
        set.add(model2);
        set.add(model3);
        set.add(model4);
    }
    static void setParameters(Map<String, String> parametersMap) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("\n Выберите параметр: \n 1 - Диагональ" +
                    " \n 2 - Оперативная память \n 3 - Обьем жесткого диска" +
                    " \n 4 - Цвет \n 5 - Операционная система  \n 6 - Процессор \n 0 - Показать ноутбуки \n");
            String choice = scanner.next();
            String parameter;
            switch (choice) {
                case "1":
                    parameter = "diagonal";
                    recording(parametersMap, parameter);
                    System.out.println("Добавлен минимальный размер ");
                    break;
                case "2":
                    parameter = "ram";
                    recording(parametersMap, parameter);
                    System.out.println("\n Добавлен минимальный объем ЖД");
                    break;
                case "3":
                    parameter = "hdd";
                    recording(parametersMap, parameter);
                    System.out.println("Добавлен минимальный объем оперативной памяти ");
                    break;
                case "4":
                    parameter = "color";
                    recording(parametersMap, parameter);
                    System.out.println("Добавлен цвет ");
                    break;
                case "5":
                    parameter = "os";
                    recording(parametersMap, parameter);
                    System.out.println("Добавлен тип операционной системы");
                    break;
                case "6":
                    parameter = "processor";
                    recording(parametersMap, parameter);
                    System.out.println("Добавлен тип процессора ");
                    break;

                case "0":
                    flag = false;
                    System.out.println("Подходящие варианты:");
                    break;
                default:
                    break;
            }
        }
    }
        static void recording(Map<String, String> parametersMap, String parameter) {
            System.out.println("\n Введите необходимое/минимальное значение параметра " + parameter + "\n");
            Scanner scanner = new Scanner(System.in);
            String value = scanner.nextLine();
            if (parametersMap.containsKey(parameter)) {
                parametersMap.put(parameter, value);
                System.out.println("\n Значение перезаписано\n");
            } else {
                parametersMap.put(parameter, value);
                System.out.println("\n Значение принято\n");
            }
            System.out.println(parametersMap);

        }
    static void sortedNotebooks(Map<String, String> parametersMap, Set<Laptop> set) {
        int i = 1;
        for (Laptop laptop : set) {
            boolean validate = true;
            for (Map.Entry<String, String> entry : parametersMap.entrySet()) {
                if (entry.getKey().equals("ram")) {
                    if (!(laptop.getRam() >= Integer.parseInt(entry.getValue()))) {
                        validate = false;
                    }
                }
                if (entry.getKey().equals("hdd")) {
                    if (!(laptop.getHdd() >= Integer.parseInt(entry.getValue()))) {
                        validate = false;
                    }
                }
                if (entry.getKey().equals("os")) {
                    if (!(laptop.getOs().toLowerCase().contains(entry.getValue().toLowerCase()))) {
                        validate = false;
                    }
                }
                if (entry.getKey().equals("color")) {
                    if (!laptop.getColor().toLowerCase().contains(entry.getValue().toLowerCase())) {
                        validate = false;
                    }
                }
                if (entry.getKey().equals("diagonal")) {
                    if (!(laptop.getDiagonal() >= Integer.parseInt(entry.getValue()))) {
                        validate = false;
                    }
                }
                if (entry.getKey().equals("processor")) {
                    if (!laptop.getProcessor().toLowerCase().contains(entry.getValue().toLowerCase())) {
                        validate = false;
                    }
                }
            }
            if (validate) {
                System.out.println("Вариант " + i + " " + laptop);
                i++;
            }
        }
    }
}