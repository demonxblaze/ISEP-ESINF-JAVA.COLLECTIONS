package Lixo.example;

import Lixo.example.Lists.CitiesList;

public class State {
    private String name;

    private CitiesList cities;

    public State(String name) {
        setName(name);
        setCities(new CitiesList());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CitiesList getCities() {
        return cities;
    }

    public void setCities(CitiesList cities) {
        this.cities = cities;
    }

    public void newCity(String name){
        cities.add(new City(name));
    }
}
