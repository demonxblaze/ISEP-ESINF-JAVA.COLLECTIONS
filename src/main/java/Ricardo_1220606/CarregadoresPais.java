package Ricardo_1220606;

public class CarregadoresPais {
    private String city;
    private int kWAcima;
    private int kWAbaixo;
    private int total;

    public CarregadoresPais(String pais) {
        this.city = pais;
        this.kWAcima = 0;
        this.kWAbaixo = 0;
        this.total = 0;
    }

    public void addAcima(int kWAcima) {
        this.kWAcima += kWAcima;
        this.total += kWAcima;
    }

    public void addAbaixo(int kWAbaixo) {
        this.kWAbaixo += kWAbaixo;
        this.total += kWAbaixo;
    }

    public String getPais() {
        return city;
    }

    public int getkWAcima() {
        return kWAcima;
    }

    public int getkWAbaixo() {
        return kWAbaixo;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarregadoresPais that = (CarregadoresPais) o;
        return city.equals(that.city);
    }

    @Override
    public int hashCode() {
        return city.hashCode();
    }
}
