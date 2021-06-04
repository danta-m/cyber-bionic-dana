import java.util.Scanner;

public class MainFromHomeWork005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int figureWidth = scanner.nextInt();
        int figureLength = scanner.nextInt();

        for (int i = 0; i < figureLength; i++) {

            for (int x = 0; x < figureWidth; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

	// write your code here
    }
}
