package de.hsw;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {

        /*
        Lesen Sie 4 Integerwerte von der Konsole ein. Schrieben Sie if-Bedingungen mit folgen-den logischen Ausdrücken:
        •	Wenn der erste Wert größer als der zweite, kleiner als der dritte und größer als der vierte ist, soll „Die perfekte Welle“ ausgegeben werden
        •	Wenn der erste kleiner als der zweite oder der dritte kleiner als der vierte ist, soll „Zwergenrennen“ ausgegeben werden
        •	Wenn der erste + der zweite ungleich der dritte - vierte ist, soll „Chaos“ ausgegeben werden
        •	Wenn der erste - der zweite gleich der dritte + vierte ist, soll „Ordnung“ ausgegeben werden
        */

        // Beispiele
        logic(100, 50, 200, 15); // Die perfekte Welle, Chaos
        logic(250, 100, 50, 100); // Zwergenrennen, Chaos, Ordnung

        Scanner scanner = new Scanner(System.in); 
        System.out.println("Eingabe: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        logic(a, b, c, d);
        scanner.close();
    }

    public static void logic(int a, int b, int c, int d) {
        if(a > b && a < c && a > d) {
            System.out.println("Die perfekte Welle");
        }

        if(a < b || c < d) {
            System.out.println("Zwergenrennen");
        }

        if(a + b != c - d) {
            System.out.println("Chaos");
        }

        if(a - b == c + d) {
            System.out.println("Ordnung");
        }
    }
}
