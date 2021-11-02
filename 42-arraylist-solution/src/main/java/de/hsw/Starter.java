package de.hsw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starter {
    private List<Integer> werte = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        new Starter().start();
        
    }

    public void start() {
        int eingaben = 4;

        for (int zaehler = 0; zaehler < eingaben; zaehler++) {
            werte.add(scanner.nextInt());
        }

        System.out.println(werte.toString());
        System.out.println("Min: " + calcMin());
        System.out.println("Max: " + calcMax());
        System.out.println("Avg: " + calcAvg());
    }

    public double calcAvg() {
        int sum = 0;
        for (int zaehler = 0; zaehler < werte.size(); zaehler++) {
            sum += werte.get(zaehler);
        }

        return sum / (double) werte.size();
    }

    public double calcMin() {
        int min = werte.get(0);
        for (int zaehler = 0; zaehler < werte.size(); zaehler++) {
            if (werte.get(zaehler) < min) {
                min = werte.get(zaehler);
            }
        }

        return min;
    }

    public double calcMax() {
        int max = werte.get(0);
        for (int zaehler = 0; zaehler < werte.size(); zaehler++) {
            if (werte.get(zaehler) > max) {
                max = werte.get(zaehler);
            }
        }

        return max;
    }
}
