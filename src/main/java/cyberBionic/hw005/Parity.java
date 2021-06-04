package cyberBionic.hw005;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkedNumber = scanner.nextInt();

        System.out.println("Первая проверка: ");

        if ((checkedNumber%2) == 0) {
            System.out.println("Число " + checkedNumber + " - четное");
        } else
        System.out.println("Число "+ checkedNumber + " - нечетное");

        System.out.println("Вторая проверка: ");

        if ((checkedNumber & 1) == 0) {
            System.out.println("Число " + checkedNumber + " - четное");
        } else {
            System.out.println("Число "+ checkedNumber + " - нечетное");
        }
    }
}
