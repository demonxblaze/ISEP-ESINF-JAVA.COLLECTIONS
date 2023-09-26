package org.example;

import Lists.SuperchargersList;

/**
 * Author @
 */
public class City {
    /**
     * City name
     */
    private String name;
    /**
     * List of superchargers
     */
    private SuperchargersList chargersList;

    /**
     * Constructor
     * @param name city name
     */
    public City(String name) {
        setName(name);
        setChargersList(new SuperchargersList());
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
    public SuperchargersList getChargersList() {
        return chargersList;
    }

    /**
     * Setter
     * @param chargersList list of superchargers
     */
    public void setChargersList(SuperchargersList chargersList) {
        this.chargersList = chargersList;
    }

    /**
     * Add a supercharger to the list
     * @param name supercharger name
     * @param stalls number of stalls
     * @param kW kW
     * @param elevm elevation
     * @param street street
     * @param zip zip code
     * @param coordinates coordinates
     * @param status status
     */
    public void newCharger(String name, int stalls, double kW, int elevm, String street, String zip, String coordinates, String status){
        chargersList.add(new SuperCharger(name, stalls, kW, elevm, street, zip, coordinates, status));
    }
}
