package com.company;

public class Max {
    public static void main(String[] args) {
        int[] array = new int[] {5, 6, 7, -7, -9, 2, 0, 11, -35, 5} ;
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);
    }
}
