import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
//        Создать массив размера N элементов, заполнить его произвольными целыми значениями (размер
//массива задает пользователь).
//Вывести на экран: наибольшее значение массива, наименьшее значение массива, общую сумму всех
//элементов, среднее арифметическое всех элементов, вывести все нечетные значения.
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        max(array);
        min(array);
        summ(array);
        average(array);
        oddNumbers(array);

    }
    static void max (int[] array) {
        System.out.println("Наибольшее значение массива: ");
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    static void min (int[] array) {
        System.out.println("Наименьшее значение массива: ");
        int min = array [0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    static void summ (int[] array) {
        System.out.println("Общая сумма всех элементов: ");
        int summ = array[0];
        for (int i = 1; i < array.length; i++) {
            summ += array[i];
        }
        System.out.println(summ);
    }

    static void average (int[] array) {
        System.out.println("Среднее арифметическое всех элементов: ");
        double summ = array[0];
        for (int i = 1; i < array.length; i++) {
            summ += array[i];
        }
        System.out.println((double) (summ/array.length));
    }

    static void oddNumbers (int[] array) {
        System.out.println("Все нечетные числа: ");
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }
    }
}
