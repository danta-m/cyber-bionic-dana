public class Figures {
    public static void main(String[] args) {
// Выведите на экран:

        int figureWidth = 5;
        int figureLength = 5;

//прямоугольник
        for (int i = 0; i < figureLength; i++) {
            for (int x = 0; x < figureWidth; x++)
                System.out.print("*");

            System.out.print("\n");
        }
        System.out.print("\n");
//прямоугольный треугольник
        for (int i = 0; i < figureLength; i++) {
            for (int x = 0; x <= i; x++)
                System.out.print("*");

            System.out.print("\n");
        }
        System.out.print("\n");
//равносторонний треугольник
        for (int i = 1; i <= figureLength; ++i) {
            for (int j = figureWidth; j > i; --j)
                System.out.print(" ");

            for (int x = 0; x < i*2-1; ++x)
                System.out.print("*");

            System.out.print("\n");
        }
        System.out.print("\n");

//ромб
        for (int i = 1; i < figureLength; ++i){

            for (int x = figureWidth; x > i; --x)
                System.out.print(" ");

            for (int x = 1; x < 2 * i; ++x)
                System.out.print("*");

            System.out.print("\n");
        }
        for (int i = figureLength; i >= 1; --i){

            for (int x = figureWidth; x > i; --x)
                System.out.print(" ");

            for (int x = 1; x < i*2; ++x)
                System.out.print("*");

            System.out.print("\n");
        }
    }
}
