package by.itstep.Pomaleiko.javalessons.lesson18.controller;

import by.itstep.Pomaleiko.javalessons.lesson18.view.Printer;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            Printer.print("Input size for array");
            size = scanner.nextInt();
        } while (size <= 0);

        int[] array = new int[size];

        // logic

        // output result

    }
}
