package Classes;

import Classes.City;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class State implements Comparable {

    private String name;

    private Set<String> cities;

    private int statePower;

    public State(String name,int power) {
        this.name = name;
        this.cities = new TreeSet<>();
        statePower=power;
    }
    public void addStatePower(int power) {
        this.statePower += power;
    }
    public int getStatePower() {
        return statePower;
    }

    public void setStatePower(int statePower) {
        this.statePower = statePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getCities() {
        return cities;
    }

    public void setCities(Set<String> cities) {
        this.cities = cities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof State state)) return false;
        return name.equals(state.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        if ((statePower <= ((State) o).getStatePower())) {
            return -1;
        } else {
            return 1;
        }
    }

    public void addCities(String city) {
        cities.add(city);
    }
}