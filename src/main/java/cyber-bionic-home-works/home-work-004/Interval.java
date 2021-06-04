import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 100 включительно :");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        if (userChoice >= 0 && userChoice <= 14) {
            System.out.println("Ваше число входит в диапазон [0 - 14]");
        } else if (userChoice > 14 && userChoice <= 35) {
            System.out.println("Ваше число входит в диапазон [15 - 35]");
        } else if (userChoice > 35 && userChoice <= 50) {
            System.out.println("Ваше число входит в диапазон [36 - 50]");
        } else if (userChoice > 50 && userChoice <= 100) {
            System.out.println("Ваше число входит в диапазон [50 - 100]");
        } else {
            System.out.println("Вы ввели число, не входящее ни в один из имеющихся числовых промежутков");
        }
    }
}
