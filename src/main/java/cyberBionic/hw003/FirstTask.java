package cyberBionic.hw003;

public class FirstTask {
    public static void main(String[] args) {
        //Задание 1
        //Имеется 3 переменные типа int x = 10, y = 12, и z = 3;
        //Выполните и рассчитайте результат следующих операций для этих переменных:
        // x += y - x++ * z;
        // z = --x – y * 5;
        // y /= x + 5 % z;
        // z = x++ + y * 5;
        // x = y - x++ * z;
        int x = 10, y = 12, z = 3;
        x += y - x++ * z; // 10 += 12 - 10 * 3;
        System.out.println("x = " + x);
        z = --x - y * 5; //
        System.out.println("z = " + z);
        y /= x + 5 % z; // расскажите очередность выполнения действий
        // 12 /= (-9 + 0)
        // откуда результат -3 ?
        System.out.println("y = " + y);
        z = x++ + y * 5;
        System.out.println("z = " + z);
        x = y - x++ * z;
        System.out.println("x = " + x);
    }
}
