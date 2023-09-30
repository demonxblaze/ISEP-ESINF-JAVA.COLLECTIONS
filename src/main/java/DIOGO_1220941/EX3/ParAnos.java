package DIOGO_1220941.EX3;

public class ParAnos implements Comparable<ParAnos> {
    private int anoAntes;
    private int anoDepois;
    private int difPHEV;
    private int difBEV;
    private int difTotal;


    public ParAnos(int anoAntes, int anoDepois, int difPHEV, int difBEV) {
        setAnoAntes(anoAntes);
        setAnoDepois(anoDepois);
        setDifBEV(difBEV);
        setDifPHEV(difPHEV);
        setDifTotal();
    }

    public int getAnoAntes() {
        return anoAntes;
    }

    public void setAnoAntes(int anoAntes) {
        this.anoAntes = anoAntes;
    }

    public int getAnoDepois() {
        return anoDepois;
    }

    public void setAnoDepois(int anoDepois) {
        this.anoDepois = anoDepois;
    }

    public int getDifPHEV() {
        return difPHEV;
    }

    public void setDifPHEV(int difPHEV) {
        this.difPHEV = difPHEV;
    }

    public int getDifBEV() {
        return difBEV;
    }

    public void setDifBEV(int difBEV) {
        this.difBEV = difBEV;
    }

    public int getDifTotal() {
        return difTotal;
    }

    public void setDifTotal() {
        this.difTotal = difBEV + difPHEV;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParAnos parAnos)) return false;
        return anoAntes == parAnos.anoAntes && anoDepois == parAnos.anoDepois;
    }

    @Override
    public int hashCode() {
        return anoAntes;
    }

    @Override
    public int compareTo(ParAnos other) {
        return Integer.compare(this.anoAntes, other.anoAntes);
    }
}
