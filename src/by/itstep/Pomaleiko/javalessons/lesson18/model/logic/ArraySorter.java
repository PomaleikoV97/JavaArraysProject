package by.itstep.Pomaleiko.javalessons.lesson18.model.logic;

public class ArraySorter {
    public static void bobbleSortAcs(int[] array) {

    }

    public static void selectedSortAcs(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            int index = j;
            for (int i = index + 1; i < array.length; i++) {
                if (array[i] > array[index]) {
                    index = i;
                }
            }

            int temp = array[j];
            array[j] = array[index];
            array[index] = temp;
        }
        }
}
