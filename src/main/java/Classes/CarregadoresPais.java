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
    private int totalNumOfVeichels;
    private int totalNumOfStalls;
    private double quota;
    private static final int RATIO = 10;

    /**
     * Constructor
     * @param pais country name
     */
    public CarregadoresPais(String pais) {
        this.country = pais;
        this.numKwAcima = 0;
        this.numKwAbaixo = 0;
        this.total = 0;
        this.totalNumOfVeichels = 0;
        this.totalNumOfStalls = 0;
        this.quota = 0;
    }
    public CarregadoresPais(String pais,int totalNumOfVeichels,int totalNumOfStalls) {
        this.country = pais;
        this.numKwAcima = 0;
        this.numKwAbaixo = 0;
        this.total = 0;
        this.totalNumOfVeichels = totalNumOfVeichels;
        this.totalNumOfStalls = totalNumOfStalls;
        this.quota = (double)(totalNumOfStalls/totalNumOfVeichels)*RATIO;
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

    public double getQuota() {
        return quota;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTotalNumOfVeichels() {
        return totalNumOfVeichels;
    }

    public void setTotalNumOfVeichels(int totalNumOfVeichels) {
        this.totalNumOfVeichels = totalNumOfVeichels;
    }

    public int getTotalNumOfStalls() {
        return totalNumOfStalls;
    }

    public void setTotalNumOfStalls(int totalNumOfStalls) {
        this.totalNumOfStalls = totalNumOfStalls;
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

    public void setQuota(double quota) {
        this.quota = quota;
    }

    /**
     * Hashcode method
     * @return hashcode
     */
    @Override
    public int hashCode() {
        return Objects.hash(country);
    }

    public void addStalls(int stalls) {
        this.totalNumOfStalls += stalls;
    }
    public void setStalls(int stalls) {
        this.totalNumOfStalls = stalls;
    }

    public void addNumberOfVehicles(int numberOfVehicles) {
     this.totalNumOfVeichels += numberOfVehicles;
    }

    public void calculateQuota() {
        if (totalNumOfVeichels == 0) {
            this.quota = 0;
            return;
        }
        double quota = ((double)totalNumOfStalls/(double) totalNumOfVeichels)*RATIO;
        this.quota = Math.round(quota * 100.0) / 100.0;
    }

}
