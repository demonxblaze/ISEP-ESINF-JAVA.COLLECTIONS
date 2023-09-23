package org.example;

import Lists.SuperchargersList;

public class City {
    private String name;
    private SuperchargersList chargersList;

    public City(String name) {
        setName(name);
        setChargersList(new SuperchargersList());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SuperchargersList getChargersList() {
        return chargersList;
    }

    public void setChargersList(SuperchargersList chargersList) {
        this.chargersList = chargersList;
    }
    public void newCharger(String name, int stalls, double kW, int elevm, String street, String zip, String coordinates, Status status){
        chargersList.add(new SuperCharger(name, stalls, kW, elevm, street, zip, coordinates, status));
    }
}
