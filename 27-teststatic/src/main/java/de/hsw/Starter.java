package de.hsw;

public class Starter {
    public static void main(String[] args) {
        
    }

    // Aufgabe: Average für 1, 2, 3, 4 testen => 2.5
    public static double calcAvg(int[] array) {
        int sum = 0;
        for (int zaehler = 0; zaehler < array.length; zaehler++) {
            sum += array[zaehler];
        }

        return sum / (double) array.length;
    }

    // Aufgabe: Minimum für 1, 2, 3, 4 testen => 1
    public static double calcMin(int[] array) {
        int min = array[0];
        for (int zaehler = 0; zaehler < array.length; zaehler++) {
            if (array[zaehler] < min) {
                min = array[zaehler];
            }
        }

        return min;
    }

    // Aufgabe: Maximum für 1, 2, 3, 4 testen => 4
    public static double calcMax(int[] array) {
        int max = array[0];
        for (int zaehler = 0; zaehler < array.length; zaehler++) {
            if (array[zaehler] > max) {
                max = array[zaehler];
            }
        }

        return max;
    }

    // Aufgabe: Chiffre für Otto testen => Bggb
    public static String encryptDecrypt(String input) {
        int a = "a".codePointAt(0);
        int z = "z".codePointAt(0);
        int A = "A".codePointAt(0);
        int Z = "Z".codePointAt(0);

        String ergebnis = "";

        for (int i = 0; i < input.length(); i++) {
            int alt = input.codePointAt(i);
            int neu = input.codePointAt(i) + 13;

            if (alt >= a && alt <= z) {
                if (neu > z) {
                    neu = neu - 26;
                }
            } else if (alt >= A && alt <= Z) {
                if (neu > Z) {
                    neu = neu - 26;
                }
            } else {
                // ???
            }

            char x = (char) neu;

            ergebnis = ergebnis + String.valueOf(x);
        }

        return ergebnis;
    }
}
