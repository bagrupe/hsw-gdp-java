package de.hsw;

import java.time.LocalDate;

public class Starter {
    public static void main(String[] args) {
		double weight = 12.12345;
		// Ausgabe: Das Gewicht ist 12,12 kg
		System.out.println(String.format("Das Gewicht ist %1$.2f kg", weight));

		int pin = 17;
		// Ausgabe: Der PIN ist 0017
		System.out.println(String.format("Der PIN ist %1$04d", pin));

		LocalDate date = LocalDate.of(1997, 1, 1);
		// Ausgabe: 01.01.1997
		System.out.println(String.format("%1$td.%1$tm.%1$tY", date));
    }
}
