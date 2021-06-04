import java.util.Scanner;

public class DeliveryHomeWork008 {
    public static void main(String[] args) {
        System.out.println("Введите количество клиентов, ожидающих доставку:");

        Scanner scanner = new Scanner(System.in);
        int clients = scanner.nextInt();
        numberOfWays(clients);

        System.out.println("Количество возможных вариантов доставки товара:" + numberOfWays(clients));
    }

    static int numberOfWays (int clients) {
        if ((clients == 1) || (clients == 0)) {
            return 1;
        } else if (clients < 0) {
            return 0;
        } else
            return clients * numberOfWays(clients-1);
    }
}
