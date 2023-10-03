package EX8;


public class City {
    /**
     * City name
     */
    private String name;

    private int power;

    public City(String name, Integer stalls, Integer power) {
        setName(name);
        setPower(stalls, power);
    }





    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power, Integer stalls) {
        this.power += power * stalls;
    }

    /**
     * Getter
     *
     * @return city name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter
     *
     * @param name city name
     */
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;
        return name.equals(city.name) ;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}