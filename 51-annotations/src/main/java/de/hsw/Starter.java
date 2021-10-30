package de.hsw;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class Starter {
    public static void main(String[] args) throws Exception {
        PointHolder ph = new PointHolder();
        ph.getPoints().add(new Point(1,2));
        save(ph);

        PointHolder loaded = load();
        System.out.println(loaded);
    }

    public static PointHolder load() throws JAXBException {
		Unmarshaller unmarshaller = JAXBContext.newInstance(PointHolder.class).createUnmarshaller();
		return (PointHolder) unmarshaller.unmarshal(new File("points.xml"));
	}
	
	public static void save(PointHolder bean) throws JAXBException {
		Marshaller marshaller = JAXBContext.newInstance(PointHolder.class).createMarshaller();
		marshaller.marshal(bean, new File("points.xml"));
	}
}
