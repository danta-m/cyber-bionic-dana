import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("С какой валюты в какую Вы хотите конвертировать ваш запрос?");
        System.out.println("С UAH в USD нажмите 1 \nС USD в UAH нажмите 2 \nС UAH в EUR нажмите 3 \nС EUR в UAH нажмите 4");
        String choice = scanner.next();

        System.out.println("Введите сумму, которую Вы хотите конвертировать:");
        double cash = scanner.nextInt();

        switch (choice) {
            case "1":
                conversionUahToUsd(cash);
                break;
            case "2":
                conversionUsdToUah(cash);
                break;
            case "3":
                conversionUahToEur(cash);
                break;
            case "4":
                conversionEurToUah(cash);
                break;
            default:
                System.out.println ("Вы ввели неправильное значение");
                break;
        }
    }

    static void conversionUahToUsd (double cash) {
        double usd = 0.036;
        double uahToUsd = cash * usd;
        System.out.println(uahToUsd + " USD");
    }

    static void conversionUsdToUah (double cash) {
        double uah = 27.55;
        double usdToUah = cash * uah;
        System.out.println(usdToUah + " UAH");
    }

    static void conversionUahToEur (double cash) {
        double eur = 0.030;
        double uahToEur = cash * eur;
        System.out.println(uahToEur + " EUR");
    }

    static void conversionEurToUah (double cash) {
        double uah = 33.58;
        double eurToUah = cash * uah;
        System.out.println(eurToUah + "UAH");
    }
}
