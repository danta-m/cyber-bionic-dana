package cyberBionic.hw002;

import java.util.Scanner;

public class CalculatorFromHomeWork007 {

    static int calculate (int first, int second, int third) {
        int sum = (first + second + third) / 3;
     return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целочисленных числа:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        System.out.println("Cреднее арифметическое число равно: " + calculate(firstNumber, secondNumber, thirdNumber));
    }
}
