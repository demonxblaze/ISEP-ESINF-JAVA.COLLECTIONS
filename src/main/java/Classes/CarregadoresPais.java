package Classes;

import java.util.Objects;

public class CarregadoresPais {
    private String country;
    private int numKwAcima;
    private int numKwAbaixo;
    private int total;

    public CarregadoresPais(String pais) {
        this.country = pais;
        this.numKwAcima = 0;
        this.numKwAbaixo = 0;
        this.total = 0;
    }

    public void addAcima() {
        this.numKwAcima++;
        this.total ++;
    }

    public void addAbaixo() {
        this.numKwAbaixo++;
        this.total ++;
    }

    public String getPais() {
        return country;
    }

    public int getNumKwAcima() {
        return numKwAcima;
    }

    public int getNumKwAbaixo() {
        return numKwAbaixo;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CarregadoresPais other = (CarregadoresPais) obj;
        return Objects.equals(country, other.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country);
    }
}
