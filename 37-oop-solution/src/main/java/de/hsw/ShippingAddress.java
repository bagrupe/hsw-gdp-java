package de.hsw;

public class ShippingAddress extends Address {

    public ShippingAddress(String street, String zip, String city, String country) {
        super(street, zip, city);
        this.country = country;
    }

    public ShippingAddress() {

    }
    
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "ShippingAddress [country=" + country + " " + super.toString() +  "]";
    }
}
