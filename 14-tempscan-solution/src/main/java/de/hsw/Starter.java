package de.hsw;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {

        /*
        Lesen Sie Temperaturwerte als double von der Konsole ein.
        Geben Sie den Durchschnitt als Integer auf der Konsole aus.
        */

        Scanner scanner = new Scanner(System.in); 
        System.out.println("Anzahl: ");
        int anzahl  = scanner.nextInt();
        double temps = 0d;

        for(int i = 0; i<anzahl; i++) {
            temps += scanner.nextDouble();
        }

        int durchschnitt = (int)(temps / anzahl);

        System.out.println("Durchschnitt " + durchschnitt);
        scanner.close();

    }
}
