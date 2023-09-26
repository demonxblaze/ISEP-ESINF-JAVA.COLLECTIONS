package org.example;
/**
 * Author @
 */
public class Address {
    /**
     * Street of the address
     */
    private String street;
    /**
     * Zip code of the address
     */
    private String zip;
    /**
     * Coordinates of the address
     */
    private Gps coordinates;

    /**
     * Constructor
     * @param street street
     * @param zip zip
     * @param coordinates coordinates
     */
    public Address(String street, String zip, String coordinates) {
        setStreet(street);
        setZip(zip);
        setCoordinates(coordinates);
    }

    /**
     * Getter
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * Setter
     * @param street street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Getter
     * @return zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * Setter
     * @param zip zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Getter
     * @return coordinates
     */
    public Gps getCoordinates() {
        return coordinates;
    }

    /**
     * Setter
     * @param coordinates coordinates
     */
    public void setCoordinates(String  coordinates) {
        String[] crd= coordinates.split(",");
        this.coordinates = new Gps(crd);
    }

}
