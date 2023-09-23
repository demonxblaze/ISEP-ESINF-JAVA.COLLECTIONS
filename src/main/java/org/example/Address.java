package org.example;

public class Address {

    private String street;
    private String zip;
    private Gps coordinates;

    public Address(String street, String zip, String coordinates) {
        setStreet(street);
        setZip(zip);
        setCoordinates(coordinates);
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Gps getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String  coordinates) {
        String[] crd= coordinates.split(",");
        this.coordinates = new Gps(crd);
    }

}
