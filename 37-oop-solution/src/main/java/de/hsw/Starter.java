package de.hsw;

import java.time.LocalDate;

public class Starter {
    public static void main(String[] args) {

        Address address = new Address("street", "zip", "city");

        Customer customer = new Customer("name", address, LocalDate.now());

        System.out.println(customer);

        ShippingAddress ship = new ShippingAddress("street", "zip", "city", "country");

        customer.setAddress(ship);

        System.out.println(customer);

        // Cast auf ShippingAddress - Fehler wenn es keine ist
        {
            ShippingAddress addr = (ShippingAddress) customer.getAddress();
            System.out.println(addr.getCountry());
        }
        
        // Besser: Prüfung
        if(customer.getAddress() instanceof ShippingAddress) {
            ShippingAddress addr = (ShippingAddress) customer.getAddress();
            System.out.println(addr.getCountry());
        }

    }
}
