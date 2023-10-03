package Classes;

import EX8.City;

import java.util.Set;

public class State {

    private String name;

    private Set<EX8.City> cities;

    private int statePower;

    public State(String name, Set<EX8.City> cities) {
        this.name = name;
        this.cities = cities;
        statePower=0;
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

    public Set<EX8.City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof State state)) return false;
        return name.equals(state.name) ;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}