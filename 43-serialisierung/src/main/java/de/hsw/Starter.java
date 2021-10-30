package de.hsw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Starter {
    public static void main(String[] args) throws Exception {
        // Anstatt eines einzelnen Objekts kann auch eine Collection gespeichert werden
        // Oder sogar ein Objekt, dass selbst die anderen Objekte und Collections hält
        Point p = new Point(1,2);
        save(p);

        // hier try {} / catch() {} um zu verhindern, dass es zum Abbruch kommt, falls die Datei nicht vorhanden ist
        Point loaded = load();
        System.out.println(loaded);
    }

    public static Point load() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("point.dat"));
        // Point muss java.io.Serializable implementieren, damit writeObject/readObject funktioniert
        Point point = (Point) ois.readObject();
		ois.close();
		return point;
		
	}
	
	public static void save(Point point) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("point.dat"));
        // Point muss java.io.Serializable implementieren, damit writeObject/readObject funktioniert
        oos.writeObject(point);
		oos.close();
	}
}
