package cyberBionic.hw006;

//Используя IntelliJ IDEA, создайте класс SumMin.
public class SumMin {
    public static void main(String[] args) {
        int a = 3;
        int b = 20;
        int sum = 0 ;

// Дано два числа A и B (A<B) выведите суму всех чисел,
// расположенных между данными числами на экран.
        for (int i = a+1; i < b; i++) {
            sum += i;
        }
        System.out.println(sum);

//Дано два числа A и B (A<B) выведите все нечетные значения,
// расположенные между данными числами.
        for (int i = a+1; i < b; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
