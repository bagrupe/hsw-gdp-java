package de.hsw;

public class Starter {
    public static void main(String[] args) {
        int value = 4;
        callByValue(value);
        System.out.println("Value nach Methode " + value);

        Point p = new Point(12,34);
        System.out.println("Value vor Methode " + p);
        callByReference(p);
        System.out.println("Value nach Methode " + p);

        Point p2 = new Point(12,34);
        System.out.println("Value vor Methode " + p2);
        callByReferenceValue(p2);
        System.out.println("Value nach Methode " + p2);
    }

    public static void callByValue(int value) {
        value++;
        System.out.println("Value in Methode " + value);
    }

    public static void callByReference(Point ref) {
        ref.setX(9999);
    }

    public static void callByReferenceValue(Point ref) {
        ref = new Point(666,666);
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}