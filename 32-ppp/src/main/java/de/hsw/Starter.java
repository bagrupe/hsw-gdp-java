package de.hsw;

import de.hsw.package1.Point1;
import de.hsw.package2.Point2;
import de.hsw.package3.Point3;
import de.hsw.package4.Point4;

@SuppressWarnings("unused")
public class Starter {
    public static void main(String[] args) {
       Point1 p1 = new Point1(1,2);
        // The field Point.x is not visible
        //int x = p1.x;


        Point2 p2 = new Point2(1,2);
        // The field Point.x is not visible
        //int x = p2.x;
        // Siehe Point2Test


        Point3 p3 = new Point3(1,2);
        int x = p3.x;



        Point4 p4 = new Point4(1,2);
        // The field Point.x is not visible
        //int x = p4.x;
        //Siehe Point4Test
    }
}
