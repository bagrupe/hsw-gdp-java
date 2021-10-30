package de.hsw.package2;

public class Point2 {
    protected final int x;
    protected final int y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
