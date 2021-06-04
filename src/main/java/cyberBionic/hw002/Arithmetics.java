package cyberBionic.hw002;

import java.util.Scanner;
//Создайте четыре метода для выполнения арифметических операций, с именами: add – сложение, sub –
//вычитание, mul – умножение, div – деление.
// Каждый метод должен принимать два целочисленных
//аргумента и выводить на экран результат выполнения арифметической операции соответствующей
//имени метода. Метод деления div, должен выполнять проверку попытки деления на ноль.
//Требуется предоставить пользователю возможность вводить с клавиатуры значения операндов и знак
//арифметической операции, для выполнения вычислений.

public class Arithmetics {

    static void add (int a, int b) {
        System.out.println(a + b);
    }

    static void sub (int a, int b) {
        System.out.println(a - b);
    }

    static void mul (int a, int b) {
        System.out.println(a * b);
    }

    static void div (int a, int b) {
        if (b == 0) {
            System.out.println("Делить на ноль запрещено!");
        } else {
        System.out.println(a / b);}
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Введите знак арифметической операции:");
        String sign = scanner.next();

        switch (sign) {
            case "+":
                add (a, b);
                break;
            case "-":
                sub(a, b);
                break;
            case  "*":
                mul(a, b);
                break;
            case "/":
                div(a, b);
                break;
            default:
                System.out.println ("Вы ввели неправильное значение");
                break;
        }
    }
}
