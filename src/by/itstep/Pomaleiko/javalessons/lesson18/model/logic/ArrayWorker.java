package by.itstep.Pomaleiko.javalessons.lesson18.model.logic;

import java.util.Scanner;

public class ArrayWorker {
    public static int sum(int[] array) {
        int s = 0;

        for (int i = 0; i < array.length; i++) {
            s += array[i];
        }

        return s;
    }
    public static int max(int[] array) {
//        int max = Integer.MIN_VALUE;
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }

        return max;
    }
    public static int min(int[] array) {
//        int min = Integer.MAX_VALUE;
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
    public static double avg(int[] array) {
        return sum(array) * 1.0 / array.length;
    }

    public static void reverse(int[] array) {
        int count = array.length / 2;

        for (int i = 0; i < count; i++) {
            int t = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = t;
        }
    }
}
