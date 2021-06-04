package cyberBionic.hw002;

import java.util.Scanner;
//Используя IntelliJ IDEA, создайте класс NumbersCheck.
//Напишите метод, который будет определять:
//1) является ли введенное число положительным или отрицательным.
//2) Является ли оно простым (используйте технику перебора значений).
//Простое число – это натуральное число, которое делится на 1 и само на себя. Чтобы определить простое
//число или нет, следует найти все его целые делители. Если делителей больше 2-х, значит оно не простое.
//3) Делится ли на 2, 5, 3, 6, 9 без остатка.

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        firstCheck(number);
        secondCheck(number);
        thirdCheck(number);

    }

    static void firstCheck (int number) {
        System.out.println("Проверка № 1 :");

        if (number >= 0)
            System.out.println("Число " + number + " является положительным");
        else
            System.out.println("Число " + number + " является отрицательным");
    }

    static void secondCheck (int number) {
        System.out.println("Проверка № 2 :");
        int temp;
        boolean check = true;

        for (int i = 2; i < number / 2; i++) {
            temp = number % i;
            if (temp == 0) {
                check = false;
                break;
            }
        }
        if (number == 4) {
            System.out.println("Число " + number + " составное");
        } else if (check) {
                System.out.println("Число " + number + " простое");
        } else {
                System.out.println("Число " + number + " составное");
        }
    }

    static void thirdCheck (int number) {
        System.out.println("Проверка № 3 :");

        if (number % 2 == 0)
            System.out.println("Число " + number + " делится на 2 без остатка");

        if (number % 5 == 0)
            System.out.println("Число " + number + " делится на 5 без остатка");

        if (number % 3 == 0)
            System.out.println("Число " + number + " делится на 3 без остатка");

        if (number % 6 == 0)
            System.out.println("Число " + number + " делится на 6 без остатка");

        if (number % 9 == 0)
            System.out.println("Число " + number + " делится на 9 без остатка");

        if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0 && number % 9 != 0 )
            System.out.println("Число " + number + " не делится на 2, 5, 3, 6, 9 без остатка");

        System.out.println("Проверка № 3 по другому условию: ") ; // я не поняла условие
        if ((number % 5 == 0) && (number % 6 == 0) && (number % 9 == 0)) {
            System.out.println("Число " + number + " делится на 2, 5, 3, 6 и 9 без остатка");
        } else {
            System.out.println("Число " + number + " не делится нацело");
        }
    }
}
