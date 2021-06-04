import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ReversedArray {
//Создать метод myReverse(int [] array), который принимает в качестве аргумента массив
//целочисленных элементов и возвращает инвертированный массив (элементы массива в обратном
//порядке).

    static int[] myReverse(int[] array) {
        int[] arrayReverse = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            arrayReverse[j] = array[i];
        }
        return arrayReverse;
    }

//Создайте метод int [] subArray(int [] array, int index, int count). Метод возвращает
//часть полученного в качестве аргумента массива, начиная с позиции указанной в аргументе index,
//размерностью, которая соответствует значению аргумента count.

    //Если аргумент count содержит значение больше чем количество элементов, которые входят в
//выбираемую часть исходного массива (от указанного индекса index, до индекса последнего элемента),
//то при формировании нового массива размерностью в count, заполните единицами те элементы,
//которые не были скопированы из исходного массива.
//
    static int[] subArray(int[] array, int index, int count) {
        int[] arraySub = new int[count];
        for (int i = index, j = 0; i < count; i++, j++) {
            if (i <= ((array.length - index) + 1)) {
                arraySub[j] = array[i];
            } else {
                arraySub[j] = 1;
            }
        }
        return arraySub;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        System.out.println("Инвертированный массив: ");
        System.out.println(Arrays.toString(myReverse(array)));

        int index = 1;
        int count = 6;
        subArray(array, index, count);
        System.out.println(Arrays.toString(subArray(array, index, count)));
    }
}
