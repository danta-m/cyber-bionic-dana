package cyberBionic.hw003;

public class Volume {
    public static void main(String[] args) {
        final double Pi = Math.PI;
        double v;
        double s;
        double r = 15;
        double h = 20;
        // V = πR2h
        // S = 2πR2 + 2πR2 = 2πR(R+h)
        v = Pi * Math.pow(r, 2) * h;
        s = 2 * Pi * r * (r + h);
        System.out.println("Обьем цилиндра равен: " + v);
        System.out.println("Площадь поверхности цилиндра равна: " + s);
    }
}
