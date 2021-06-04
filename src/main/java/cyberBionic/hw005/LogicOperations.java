package cyberBionic.hw005;

public class LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        x += y >> x++ * z;
        System.out.println("x += y >> x++ * z" + "\nx = " + x + ", y = " + y + ", z = " + z);
        z = ++x & y * 5;
        System.out.println("z = ++x & y * 5" + "\nx = " + x + ", y = " + y + ", z = " + z);
        y /= x + 5 | z;
        System.out.println("y /= x + 5 | z" + "\nx = " + x + ", y = " + y + ", z = " + z);
        z = x++ & y * 5;
        System.out.println("z = x++ & y * 5" + "\nx = " + x + ", y = " + y + ", z = " + z);
        x = y << x++ ^ z;
        System.out.println("x = y << x++ ^ z" + "\nx = " + x + ", y = " + y + ", z = " + z);
    }
}
