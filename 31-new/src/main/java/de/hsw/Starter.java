package de.hsw;

@SuppressWarnings("unused")
public class Starter {
    public static void main(String[] args) {

        // Neues Stringobjekt - normalerweise nicht notwendig, auch mit String myString = "xxxxx" möglich
        String myString = new String("xxxxxx");

        // Neues Objekt unserer "Point"-Klasse
        Point p = new Point(1,2);
        //Point p = new Point();
        System.out.println(p);

    }
}

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}