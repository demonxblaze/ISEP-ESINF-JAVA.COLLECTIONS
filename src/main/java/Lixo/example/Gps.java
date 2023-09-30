package Lixo.example;

/**
 * Author @
 */
public class Gps {
    /**
     * Latitude of location
     */
    private double latitude;
    /**
     * Longitude of location
     */
    private double longitude;

    /**
     * Constructor
     * @param crd coordinates
     */
    public Gps(String[] crd) {
        setLatitude(crd[0]);
        setLongitude(crd[1]);
    }

    /**
     * Getter
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Setter
     * @param latitude latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = Double.parseDouble(latitude);
    }

    /**
     * Setter
     * @return longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Setter
     * @param longitude longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = Double.parseDouble(longitude);
    }
}
