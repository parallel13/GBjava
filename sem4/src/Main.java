import java.util.*;

public class Main {
    public static void main(String[] args) {

//        ex0();
//        ex1();
        ex3();


    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> revList = new LinkedList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {
            revList.add(Integer.valueOf(list.get(i)));
        }
        return revList;
    }

    public static void ex0() {
//        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.
        LinkedList<Integer> list = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rnd.nextInt(10) + 1);
        }
        System.out.println(list);
        System.out.println(reverseList(list));
    }

    public static void ex1() {
        //        Реализуйте очередь с помощью LinkedList со следующими методами:
        //• enqueue() — помещает элемент в конец очереди,
        //• dequeue() — возвращает первый элемент из очереди и удаляет его,
        //• first() — возвращает первый элемент из очереди, не удаляя.
        LinkedList<Integer> list1 = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            list1.add(rnd.nextInt(10) + 1);
        }
        System.out.println(list1);
        enqueue(list1, 15);
        enqueue(list1, 25);
        System.out.println(list1);
        System.out.println("первый элемент очереди: " + dequeue(list1));
        System.out.println(list1);
        System.out.println("первый элемент очереди: " + first(list1));

    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }

    public static void ex3() {
//        Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
        LinkedList<Integer> list2 = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < 3; i++) {
            list2.add(rnd.nextInt(8) + 1);
        }
        System.out.println(list2);
        System.out.println("сумма чисел равна "+iterateUsingIterator(list2));


    }
    public static Integer iterateUsingIterator(LinkedList<Integer> linkedList){
        Iterator<Integer> it = linkedList.iterator();
        int sum = 0;
        while(it.hasNext()){

            int a =it.next();
            sum = sum + a;
        }
        return sum;

    }
}




