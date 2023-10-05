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
    private Integer power = 0;
    private String state;

    /**
     * Number of chargers
     */
    private Integer numberChargers = 0;


    /**
     * Constructor
     * @param name city name
     * @param numberChargers number of chargers
     */
    public City(String name, Integer numberChargers) {
        setName(name);
        setNumberChargers(numberChargers);
    }

    /**
     * Constructor
     * @param name city name
     * @param stalls number of stalls
     * @param kw power of chargers
     */
    public City(String name, int stalls, int kw) {
        setName(name);
        setNumberChargers(numberChargers+stalls);
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

    /**
     * Getter
     * @return power of chargers
     */
    public Integer getPower() {
        return power;
    }

    /**
     * Setter
     * @param power power of chargers
     * @param stalls number of stalls
     */
    public void setPower(Integer power, Integer stalls) {
        this.power += power * stalls;
    }
}
