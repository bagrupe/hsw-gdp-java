package de.hsw;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {

        /*
        Lesen Sie Temperaturwerte als double von der Konsole ein.
        Lassen Sie den Nutzer jeweils auswählen, ob die Temperatur für Frühjahr, Sommer, Herbst oder Winter gewertet werden soll
        Nutzen Sie dafür das switch Statement
        Geben Sie den Durchschnitt als Integer je Jahreszeit auf der Konsole aus.
        */

        Scanner scanner = new Scanner(System.in); 
        System.out.println("Anzahl: ");
        int anzahl  = scanner.nextInt();

        int anzahlFrühjahr = 0;
        int anzahlSommer = 0;
        int anzahlHerbst = 0;
        int anzahlWinter = 0;
        double tempsFrühjahr = 0d;
        double tempsSommer = 0d;
        double tempsHerbst = 0d;
        double tempsWinter = 0d;

        int i = 0;

        while(i<anzahl) {
            System.out.println("Jahreszeit: ");
            String jahreszeit = scanner.next();

            switch(jahreszeit) {
                case "Frühjahr":
                case "F":
                System.out.println("Wert: ");
                tempsFrühjahr += scanner.nextDouble();
                anzahlFrühjahr++;
                break;

                case "Sommer":
                case "S":
                System.out.println("Wert: ");
                tempsSommer += scanner.nextDouble();
                anzahlSommer++;
                break;

                case "Herbst":
                case "H":
                System.out.println("Wert: ");
                tempsHerbst += scanner.nextDouble();
                anzahlHerbst++;
                break;

                case "Winter":
                case "W":
                System.out.println("Wert: ");
                tempsWinter += scanner.nextDouble();
                anzahlWinter++;
                break;

                default:
                System.out.println("Keine gültige Jahreszeit angegeben");
                continue;
            }

            i++;
        }

        int durchschnittFrühjahr = (int)(tempsFrühjahr / anzahlFrühjahr);
        System.out.println("Durchschnitt Frühjahr "  + durchschnittFrühjahr);
        int durchschnittSommer = (int)(tempsSommer / anzahlSommer);
        System.out.println("Durchschnitt Sommer   " + durchschnittSommer);
        int durchschnittHerbst = (int)(tempsHerbst / anzahlHerbst);
        System.out.println("Durchschnitt Herbst   " + durchschnittHerbst);
        int durchschnittWinter = (int)(tempsWinter / anzahlWinter);
        System.out.println("Durchschnitt Winter   "  + durchschnittWinter);
        scanner.close();

    }
}
