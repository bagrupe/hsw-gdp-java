package de.hsw;

import java.util.Arrays;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eingaben = 4;
        
        int[] a = new int[eingaben];

        for (int zaehler = 0; zaehler < eingaben; zaehler++) {
            a[zaehler] = scanner.nextInt();
        }

        // Alternativ zum schnellen testen:
        // int[] a = { 1, 2, 3, 4};

        System.out.println(Arrays.toString(a));
        System.out.println("Min: " + calcMin(a));
        System.out.println("Max: " + calcMax(a));
        System.out.println("Avg: " + calcAvg(a));

        scanner.close();
    }

    public static double calcAvg(int[] array) {
        int sum = 0;
        for (int zaehler = 0; zaehler < array.length; zaehler++) {
            sum += array[zaehler];
        }

        return sum / (double) array.length;
    }

    public static double calcMin(int[] array) {
        int min = array[0];
        for (int zaehler = 0; zaehler < array.length; zaehler++) {
            if (array[zaehler] < min) {
                min = array[zaehler];
            }
        }

        return min;
    }

    public static double calcMax(int[] array) {
        int max = array[0];
        for (int zaehler = 0; zaehler < array.length; zaehler++) {
            if (array[zaehler] > max) {
                max = array[zaehler];
            }
        }

        return max;
    }
}
