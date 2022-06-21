package by.itstep.Pomaleiko.javalessons.lesson18.controller;

import by.itstep.Pomaleiko.javalessons.lesson18.model.logic.ArraySearcher;
import by.itstep.Pomaleiko.javalessons.lesson18.model.logic.ArrayWorker;
import by.itstep.Pomaleiko.javalessons.lesson18.util.ArrayInitializer;
import by.itstep.Pomaleiko.javalessons.lesson18.util.Convertor;
import by.itstep.Pomaleiko.javalessons.lesson18.view.Printer;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            Printer.print("Input size for array: ");
            size = scanner.nextInt();
        } while (size <= 0);

        int[] array = new int[size];

        ArrayInitializer.randomInit(array);

        Printer.print("Array before: " + Convertor.toString(array));

        ArrayWorker.reverse(array);

        Printer.print("\nArray after: " + Convertor.toString(array));
    }
}
