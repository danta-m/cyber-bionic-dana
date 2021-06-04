import java.util.Scanner;

public class CalculatorHomeWork008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        calculate(numberOne, numberTwo, numberThree);
    }

    static void calculate(int numberOne, int numberTwo, int numberThree) {
        numberOne /= 5;
        numberTwo /= 5;
        numberThree /= 5;
        System.out.println(numberOne + " , " + numberTwo + " , " + numberThree);
    }
}

