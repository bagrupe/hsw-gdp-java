package de.hsw.package1;

public class Point1 {
    private final int x;
    private final int y;

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
