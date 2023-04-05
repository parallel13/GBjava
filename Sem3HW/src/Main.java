import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
    }

    static void ex2() {
//        Задан целочисленный список ArrayList.
//        Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

        List<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(10) + 1);
        }
        System.out.println(arr);
        int min = Collections.min(arr);
        int max = Collections.max(arr);
        int average= (min+max)/2;
        System.out.println("Min value is: "+ Collections.min(arr));
        System.out.println("Max value is: "+ Collections.max(arr));
        System.out.println("Average value is: "+ average);




    }


    static void ex1() {
        //Пусть дан произвольный список целых чисел, удалить из него четные числа
        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(10) + 1);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }


}
