package Classes;

public class Charger {

    private String supercharger;

    private String country;

    private GPScoords gps;

    public Charger(String supercharger, String country, String gps) {
        setSupercharger(supercharger);
        setCountry(country);
        setGps(new GPScoords(gps));
    }

    public void setSupercharger(String supercharger) {
        this.supercharger = supercharger;
    }

    public String getSupercharger() {
        return supercharger;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setGps(GPScoords gps) {
        this.gps = gps;
    }

    public GPScoords getGps() {
        return gps;
    }

    @Override
    public String toString() {
        return "Charger{" +
                "supercharger='" + supercharger + '\'' +
                '}';
    }
}
