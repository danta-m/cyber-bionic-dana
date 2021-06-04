public class Array {
    public static void main(String[] args) {
        int[] array = new int [] {5, 6, 7, -7, -9, 2, 0, 11, -35, 5};
//        int back;
//        for (int i = 0; i < array.length/2; i++) {
//            back = array[array.length - i - 1];
//            array[array.length - i - 1] = array [i];
//            array [i] = back;
//        }

        for (int i = array.length - 1; i >= 0; i--)
            System.out.println(array[i]);


//        for (int j= 0; j < array.length; j++) {
//            System.out.println(array[j]);
//        }
    }
}
