package Classes;

import java.util.Objects;

/**
 * This class represents the information about the number of chargers in a country.
 */
public class CarregadoresPais {
    /**
     * Country name
     */
    private String country;
    /**
     * Number of chargers above x kW
     */
    private int numKwAcima;

    /**
     * Number of chargers below x kW
     */
    private int numKwAbaixo;

    /**
     * Total number of chargers
     */
    private int total;

    /**
     * Constructor
     * @param pais country name
     */
    public CarregadoresPais(String pais) {
        this.country = pais;
        this.numKwAcima = 0;
        this.numKwAbaixo = 0;
        this.total = 0;
    }

    /**
     * Add a charger above x kW
     */
    public void addAcima() {
        this.numKwAcima++;
        this.total ++;
    }

    /**
     * Add a charger below x kW
     */
    public void addAbaixo() {
        this.numKwAbaixo++;
        this.total ++;
    }

    /**
     * Getter
     * @return country name
     */
    public String getPais() {
        return country;
    }

    /**
     * Getter
     * @return number of chargers above x kW
     */
    public int getNumKwAcima() {
        return numKwAcima;
    }

    /**
     * Getter
     * @return number of chargers below x kW
     */
    public int getNumKwAbaixo() {
        return numKwAbaixo;
    }

    /**
     * Getter
     * @return total number of chargers
     */
    public int getTotal() {
        return total;
    }

    /**
     * Equals method
     * @param obj object to compare
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CarregadoresPais other = (CarregadoresPais) obj;
        return country.equals(other.country);
    }

    /**
     * Hashcode method
     * @return hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(country);
    }
}
