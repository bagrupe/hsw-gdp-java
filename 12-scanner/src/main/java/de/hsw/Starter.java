package de.hsw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        beispiel1();
    }

    public static void beispiel1() {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Eingabe: ");
        int b = scanner.nextInt();
        System.out.println("Eingabe: " + b);
        int c = scanner.nextInt();
        System.out.println("Eingabe: " + c);
        int a = b + c;

        System.out.println(a);
        scanner.close();
    }

    public static void beispiel2() {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Eingabe: ");
        int i = scanner.nextInt();
        System.out.println("Eingabe: " + i);
        double d = scanner.nextDouble();
        System.out.println("Eingabe: " + d);
        String s = scanner.next();
        System.out.println("Eingabe: " + s);
        String s2 = scanner.nextLine();
        System.out.println("Eingabe: " + s2);
        String s3 = scanner.nextLine();
        System.out.println("Eingabe: " + s3);
        scanner.close();
    }

    public static void beispiel3() {
        Scanner scanner = new Scanner(System.in); 
        boolean eingabeRichtig = false;
		int wert = 0;
        System.out.println("Eingabe: ");

		do {
			try {
				wert = scanner.nextInt();
                System.out.println("Eingabe: " + wert);
				eingabeRichtig = true;
			} catch (InputMismatchException e) {
				System.out.println("Du musst eine Zahl eingeben!");
				scanner.nextLine();
			}
        } while (!eingabeRichtig);
        scanner.close();
    }
}
