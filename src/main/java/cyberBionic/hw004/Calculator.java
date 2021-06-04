package cyberBionic.hw004;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = 513;
        int operand2 = 1;
        System.out.println("Введите знак арифметической операции: ");
        Scanner scanner = new Scanner(System.in);
        String sign = scanner.next();

        switch (sign) {
            case "-": {
                System.out.println("Результат выполнения арифметической операции: " + "\n" + operand1 + " - " + operand2 + " = " + (operand1-operand2));
                break;
            }
            case "+": {
                System.out.println("Результат выполнения арифметической операции: " + "\n" + operand1 + " + " + operand2 + " = " + (operand1+operand2));
                break;
            }
            case "*": {
                System.out.println("Результат выполнения арифметической операции: " + "\n" + operand1 + " * " + operand2 + " = " + (operand1*operand2));
                break;
            }
            case "/": {
                if (operand2 == 0)
                    System.out.println("Деление на ноль недопустимо");
                 else
                    System.out.println("Результат выполнения арифметической операции: " + "\n" + operand1 + " / " + operand2 + " = " + (operand1/operand2));

                break;
            }
            case "%": {
                if (operand2 == 0)
                    System.out.println("Деление на ноль недопустимо");
                 else
                    System.out.println("Результат выполнения арифметической операции: " + "\n" + operand1 + " % " + operand2 + " = " + (operand1%operand2));

                break;
            }
            default: {
                System.out.println("Введен недопустимый символ");
                break;
            }
        }
    }
}
