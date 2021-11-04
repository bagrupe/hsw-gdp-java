package de.hsw;

import java.time.LocalDate;

public class Customer {
    private String name;

    private Address address;

    private LocalDate birthdate;
    public Customer(String name, Address address, LocalDate birthdate) {
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Customer [address=" + address + ", birthdate=" + birthdate + ", name=" + name + "]";
    }
}
