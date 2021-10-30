package de.hsw.package3;

public class Point3 {
    public final int x;
    public final int y;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}
