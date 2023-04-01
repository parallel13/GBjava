import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        int[] arr = new int[]{1,1,1,1,1,1,0,1,1,1};
        ex1(arr, 1);
        //ex0();


        }
    static void ex1(int[] arr, int val){
/*
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
*/
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val){
                count++;
            } else {
                if (count > maxCount){
                    maxCount = count;
                }
                count = 0;
            }
        }
        if (count > maxCount){
            maxCount = count;
        }
        System.out.println(maxCount);
    }
    static void ex0() {
        System.out.println("Как вас зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
// System.out.println("Привет, " + name);
        LocalTime time = LocalTime.now();
// LocalTime time1 = LocalTime.of(5, 32);
        int hour = time.getHour();
        if (hour >= 5 && hour < 12) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Добрый день, " + name + "!");
        } else if (hour >= 18 && hour < 23) {
            System.out.println("Добрый вечер, " + name + "!");
        } else {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }

    }
