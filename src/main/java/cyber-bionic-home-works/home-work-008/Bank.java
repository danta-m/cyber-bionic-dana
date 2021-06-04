import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        int debts = 6000;
        String currency = "UAH";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        welcome(name);

        boolean statusOk = true;

        while (statusOk) {

            selectOption();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    debtRepayment(debts, currency);
                    continue;
                case 2:
                    debtCalculation(debts, currency);
                    continue;
                case 3:
                    System.out.println("Банк желает вам хорошего дня!");
                    break;
                default:
                    System.out.println("Вы ввели неправильное значение. Попробуйте сделать выбор еще раз");
                    continue;
            }
            break;
        }
    }

    static void welcome(String name) {
        System.out.println("Приветствую, " + name);
    }

    static void selectOption() {
        System.out.println("\nВыберите операцию, которую хотите совершить: ");
        System.out.println("Посмотреть баланс - нажмите 1");
        System.out.println("Пополнить счет - нажмите 2");
        System.out.println("Выйти - нажмите 3");
    }

    static void debtRepayment(int debts, String currency) {
        System.out.println("Сумма вашей задолженности составляет: " + debts + currency);
    }

    static void debtCalculation(int debts, String currency) {
        System.out.println("На какую сумму Вы хотите пополнить счет?");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();

        if (payment < debts) {
            System.out.println("Сумма Вашей задолженности составляет: " + (debts - payment) + currency);
        } else if (payment == debts) {
            System.out.println("Кредит успешно погашен");
        } else if (payment > debts) {
            System.out.println("Кредит успешно погашен. \nПереплата составляет: " + (payment - debts) + currency);
        }
    }
}
