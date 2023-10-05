package Classes;

/**
 * This class represents the information about the number of chargers in a country.
 */
public class ParAnos implements Comparable<ParAnos> {
    /**
     * Variables
     */
    private int anoAntes;
    private int anoDepois;
    private int difPHEV;
    private int difBEV;
    private int difTotal;

    /**
     * Constructor
     * @param anoAntes year before
     * @param anoDepois year after
     * @param difPHEV difference of PHEV
     * @param difBEV difference of BEV
     */
    public ParAnos(int anoAntes, int anoDepois, int difPHEV, int difBEV) {
        setAnoAntes(anoAntes);
        setAnoDepois(anoDepois);
        setDifBEV(difBEV);
        setDifPHEV(difPHEV);
        setDifTotal();
    }

    /**
     * Getter
     * @return year before
     */
    public int getAnoAntes() {
        return anoAntes;
    }

    /**
     * Setter
     * @param anoAntes year before
     */
    public void setAnoAntes(int anoAntes) {
        this.anoAntes = anoAntes;
    }

    /**
     * Getter
     * @return year after
     */
    public int getAnoDepois() {
        return anoDepois;
    }

    /**
     * Setter
     * @param anoDepois year after
     */
    public void setAnoDepois(int anoDepois) {
        this.anoDepois = anoDepois;
    }

    /**
     * Getter
     * @return difference of PHEV
     */
    public int getDifPHEV() {
        return difPHEV;
    }

    /**
     * Setter
     * @param difPHEV difference of PHEV
     */
    public void setDifPHEV(int difPHEV) {
        this.difPHEV = difPHEV;
    }

    /**
     * Getter
     * @return difference of BEV
     */
    public int getDifBEV() {
        return difBEV;
    }

    /**
     * Setter
     * @param difBEV difference of BEV
     */
    public void setDifBEV(int difBEV) {
        this.difBEV = difBEV;
    }

    /**
     * Getter
     * @return total difference
     */
    public int getDifTotal() {
        return difTotal;
    }

    /**
     * Setter
     */
    public void setDifTotal() {
        this.difTotal = difBEV + difPHEV;
    }

    /**
     * Equals
     * @param o object
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParAnos parAnos)) return false;
        return anoAntes == parAnos.anoAntes && anoDepois == parAnos.anoDepois;
    }

    /**
     * Hashcode
     * @return hashcode
     */
    @Override
    public int hashCode() {
        return anoAntes;
    }

    @Override
    public int compareTo(ParAnos other) {
        return Integer.compare(this.anoAntes, other.anoAntes);
    }
}
