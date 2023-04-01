import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("\n" +
                "1- Вычислить n-ое треугольного число (сумма чисел от 1 до n)\n" +
                "2- Вычислить n! (произведение чисел от 1 до n)\n" +
                "3-Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)\n" +
                "4-Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую " +
                "операцию, ответ) \n" +
                "Введите номер задания:");
        Scanner taskScanner = new Scanner(System.in);
        int i = taskScanner.nextInt();
        //taskScanner.close();
        //int tasknumber = Scanner();
        if (i == 1) {
            System.out.println("Введите n-ное треугольное число ");
            int a = Scanner();
            int res1 = Triangularnumber(a);
            System.out.println("Сумма чисел от 1 до " + a + " равна " + res1);
        } else if (i == 2) {
            System.out.printf("Введите число !n ");
            int b = Scanner();
            int res2 = Factorial(b);
            System.out.println("факториал числа " + b + " равен " + res2);

        } else if (i == 3) {
            System.out.printf("Введите число до которого искать простые числа ");
            int c = Scanner();
            PrimesNumbers(c);
        } else if (i == 4) {
            System.out.println("Введите последовательно первое и второе число:");
            Scanner inp = new Scanner(System.in);
            int num1, num2;
            num1 = inp.nextInt();
            num2 = inp.nextInt();
            int ans;
            System.out.println("Введите требуемую операцию: 1 сложение, 2 вычетание 3 умножение 4 деление:");
            int choose;
            choose = inp.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(add(num1, num2));
                    break;
                case 2:
                    System.out.println(sub(num1, num2));
                    break;
                case 3:
                    System.out.println(mult(num1, num2));
                    break;
                case 4:
                    System.out.println(div(num1, num2));
                    break;
                default:
                    System.out.println("Illigal Operation");
            }

        }
    }


    static int Triangularnumber(int a) {

        return (a * (a + 1)) / 2;
    }

    static int Factorial(int f) {

        int factorial = 1;
        for (int i = 1; i <= f; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    static void PrimesNumbers(int n) {
        int num = n;
        boolean primeNum = true;
        List<Integer> primes = new ArrayList<>();

        for (int i = 1; i <= num; i += 2) {
            int q = (int) Math.sqrt(i);
            for (int j = 2; j < q; j++) {
                if (i % j == 0) {
                    primeNum = false;
                }
            }
            if (primeNum) {
                primes.add(i);
            } else primeNum = true;
        }
        System.out.println("Простые числа от 1 до" + ":\n " + primes);
    }

    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int sub(int x, int y) {
        int result = x - y;
        return result;
    }

    public static int mult(int x, int y) {
        int result = x * y;
        return result;
    }

    public static int div(int x, int y) {
        int result = x / y;
        return result;
    }


    static int Scanner() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int : ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println("вы ввели число: " + i);
        iScanner.close();
        return i;
    }


}