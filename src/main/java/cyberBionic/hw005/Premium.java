package cyberBionic.hw005;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество лет опыта:");
        int workExperience = scanner.nextInt();

        System.out.println("Введите размер своей заработной платы: ");
        int salary = scanner.nextInt();
        if (salary < 0) {
            System.out.println("Вы ввели недопустимое значение. Попробуйте ввести еще раз");
        }

        double bonus;

        if (workExperience >= 0 && workExperience < 5) {
            bonus = salary * 0.10;
            System.out.println("Размер премии составляет: " + bonus + " грн");
        } else if (workExperience >= 5 && workExperience < 10) {
            bonus = salary * 0.15;
            System.out.println("Размер премии составляет: " + bonus + " грн");
        } else if (workExperience >= 10 && workExperience < 15) {
                bonus = salary * 0.25;
                System.out.println("Размер премии составляет: " + bonus + " грн");
        } else if (workExperience >= 15 && workExperience < 20) {
            bonus = salary * 0.35;
            System.out.println("Размер премии составляет: " + bonus + " грн");
        } else if (workExperience >= 20 && workExperience < 25) {
            bonus = salary * 0.45;
            System.out.println("Размер премии составляет: " + bonus + " грн");
        } else if (workExperience >= 25 && workExperience < 60) { // мне кажется, что больше опыта не будет, поэтому 60
            bonus = salary * 0.5;
            System.out.println("Размер премии составляет: " + bonus + " грн");
        } else {
            System.out.println("Вы ввели недопустимое значение. Попробуйте ввести еще раз");
        }
//        Если выслуга до 5 лет, премия составляет 10% от заработной платы.
//        Если выслуга от 5 лет (включительно) до 10 лет, премия составляет 15% от заработной платы.
//        Если выслуга от 10 лет (включительно) до 15 лет, премия составляет 25% от заработной платы.
//        Если выслуга от 15 лет (включительно) до 20 лет, премия составляет 35% от заработной платы.
//        Если выслуга от 20 лет (включительно) до 25 лет, премия составляет 45% от заработной платы.
//        Если выслуга от 25 лет (включительно) и более, премия составляет 50% от заработной платы.
    }
}
