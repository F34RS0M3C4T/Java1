import java.util.Scanner;

public class Arrays {
    public static void printArray(int[] array){
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }// Вывод массива на консоль//

    public static void fillArray(int[] array){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }
    }//Ввод элементов и заполнение ими массива //

    public static int elementAddition(int[] array){
        int summ = 0;
        for (int value : array) {
            summ += value;
        }
        return summ;
    }//Сумма всех элементов //

    public static int evenNumbers(int[] array){
        int even = 0;
        for (int value : array) {
            if (value % 2 != 0) {
                even++;
            }
        }
        return even;
    }//Подсчет количества четных чисел//

    public static int section(int[] array, int a, int b){
        if(a < b){
            int amount = 0;
            for (int value : array) {
                if (value >= a && value <= b) {
                    amount++;
                }
            }
            return amount;
        }
        else {
            return -1;
        }
    }//Подсчет чисел, принадлежащих отрезку [a;b]//

    public static boolean isAllPositive(int[] array){
        for (int value : array) {
            if (value <= 0) {
                return false;
            }
        }
        return true;
    }//Проверка того, что всё числа положительные//

    public static void inversion(int[] array){
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i -1] = temp;
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[6];
        fillArray(arr);
    }//Инвертирование массива//
}
