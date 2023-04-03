// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int [] array = {12, 10, 13, 55, 89, 2, 5, 7, 6, 11, 11};
       bubbleSorting(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

    }

    static void bubbleSorting(int[] array){
        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j+1] < array[j]) {
                    int temp= array[j];
                    array[j]= array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }




}