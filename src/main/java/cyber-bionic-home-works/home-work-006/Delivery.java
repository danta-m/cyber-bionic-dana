import java.util.Scanner;

public class Delivery {
// Имеется N клиентов, которым компания производитель должна доставить товар. Сколько существует
//возможных маршрутов доставки товара, с учетом того, что товар будет доставлять одна машина?
//Используя IntelliJ IDEA, создайте класс Delivery.
//Напишите программу, которая будет рассчитывать, и выводить на экран количество возможных
//вариантов доставки товара. Для решения задачи, используйте факториал N!, рассчитываемый с помощью
//цикла do-while.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество клиентов:");
        int clients = scanner.nextInt();
        int result = 1;
        int i = 1;

        System.out.println("Количество возможных маршрутов:");
            do {
                result *= i;
                i++;
            } while (i <= clients);
        System.out.println(result);
    }
}
