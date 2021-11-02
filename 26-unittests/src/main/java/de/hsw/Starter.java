package de.hsw;

public class Starter {
    public static void main(String[] args) {
        
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int add2(int a, int b) {
        if(a > 1000) {
            throw new IllegalArgumentException();
        }

        return a+b;
    }
}
