package de.hsw;

import java.time.LocalDate;

public class Starter {
    public static void main(String[] args) {
        Point p1 = new Point();
        System.out.println(p1);

        Point p2 = new Point(1);
        System.out.println(p2);

        Point p3 = new Point(2, 3);
        System.out.println(p3);

        Student s = new Student("Hans", "Wurst", LocalDate.now());
        System.out.println(s);
    }
}

class Point {
    private int x;
    private int y;

    public Point() {

    }
    public Point(int x) {
        this.x = x;
        this.y = x;
    }

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

class Student {
    private String vorname;
    private String nachname;
    private LocalDate geburtsdatum;

    public Student(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Student(String vorname, String nachname, LocalDate geburtsdatum) {
        this(vorname, nachname);
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public String toString() {
        return "Student [geburtsdatum=" + geburtsdatum + ", nachname=" + nachname + ", vorname=" + vorname + "]";
    }

}