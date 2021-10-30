package de.hsw;

import java.util.Arrays;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tage = 7;
        int eingaben = 4;

        int[][] a = new int[tage][eingaben];

        for (int zaehler = 0; zaehler < tage; zaehler++) {
            for (int zaehlerInnen = 0; zaehlerInnen < eingaben; zaehlerInnen++) {
                a[zaehler][zaehlerInnen] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(a));
        System.out.println("Min: " + calcMin(a));
        System.out.println("Max: " + calcMax(a));
        System.out.println("Avg: " + calcAvg(a));
        scanner.close();
    }

    public static double calcAvg(int[][] array) {
        int sum = 0;
        int count = 0;
        for (int zaehler = 0; zaehler < array.length; zaehler++) {
            for(int zaehlerInnen = 0; zaehlerInnen<array[0].length;zaehlerInnen++) {
                sum += array[zaehler][zaehlerInnen];
                count++;
            }
            
        }

        return sum / (double) count;
    }

    public static double calcMin(int[][] array) {
        int min = array[0][0];
        for (int zaehler = 0; zaehler < array.length; zaehler++) {
            for(int zaehlerInnen = 0; zaehlerInnen<array[0].length;zaehlerInnen++) {
                if (array[zaehler][zaehlerInnen] < min) {
                    min = array[zaehler][zaehlerInnen];
                }
            }
            
        }

        return min;
    }

    public static double calcMax(int[][] array) {
        int max = array[0][0];
        for (int zaehler = 0; zaehler < array.length; zaehler++) {
            for(int zaehlerInnen = 0; zaehlerInnen<array[0].length;zaehlerInnen++) {
                if (array[zaehler][zaehlerInnen] > max) {
                    max = array[zaehler][zaehlerInnen];
                }
            }
        }

        return max;
    }
}
