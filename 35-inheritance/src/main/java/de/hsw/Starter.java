package de.hsw;

@SuppressWarnings("unused")
public class Starter {
    public static void main(String[] args) {
        // Normaler 2-dimensionaler Point
        Point p1 = new Point(1, 2);
        // 3-Dimensionaler Point
        ThreeDimPoint p2 = new ThreeDimPoint(1, 2, 3);
        // Wir casten den 3-dimensionalen Point zu einem 2-dimensionalen (ignorieren z)
        Point p3 = new ThreeDimPoint(4, 5, 6);
        // Wir können aber auch wieder zurückcasten
        ThreeDimPoint px = (ThreeDimPoint) p3;

        // Folgendes funktioniert nicht:
        // class de.hsw.Point cannot be cast to class de.hsw.ThreeDimPoint
        //ThreeDimPoint pz = (ThreeDimPoint) p1;
    }
}
