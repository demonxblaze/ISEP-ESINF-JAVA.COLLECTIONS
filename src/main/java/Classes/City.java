package Classes;

import Lixo.example.Lists.SuperchargersList;
import Lixo.example.SuperCharger;

/**
 * Author @
 */
public class City {
    /**
     * City name
     */
    private String name;
    private Integer power;
    private String state;

    /**
     * Number of chargers
     */
    private Integer numberChargers;


    /**
     * Constructor
     * @param name city name
     * @param numberChargers number of chargers
     */
    public City(String name, Integer numberChargers) {
        setName(name);
        setNumberChargers(numberChargers);
        setPower(0,0);
    }
    public City(String name, String state, int stalls, int kw) {
        setName(name);
        setNumberChargers(numberChargers);
        setPower(kw,stalls);
    }

    /**
     * Getter
     * @return city name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter
     * @param name city name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter
     * @return list of superchargers
     */
    public Integer getNumberChargers() {
        return numberChargers;
    }

    /**
     * Setter
     * @param numberChargers list of superchargers
     */
    public void setNumberChargers(Integer numberChargers) {
        this.numberChargers = numberChargers;
    }
    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power, Integer stalls) {
        this.power += power * stalls;
    }
}
