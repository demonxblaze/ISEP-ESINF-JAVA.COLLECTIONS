package Classes;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ResultEX8 {

    private Set<String> cities;
    private Set<String> states;
    private int totalPower;

    public ResultEX8(Set<String> cities, Set<String> states, int totalPower) {
        this.cities = cities;
        this.states = states;
        this.totalPower = totalPower;
    }

    public Set<String> getCities() {
        return cities;
    }

    public void setCities(Set<String> cities) {
        this.cities = cities;

    }

    public Set<String> getStates() {
        return states;
    }

    public void setStates(Set<String> states) {
        this.states = states;
    }

    public int getTotalPower() {
        return totalPower;
    }

    public void setTotalPower(int totalPower) {
        this.totalPower = totalPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ResultEX8 resultEX8)) return false;
        return totalPower == ((ResultEX8) o).getTotalPower() && cities.equals(((ResultEX8) o).getCities()) && states.equals(((ResultEX8) o).getStates());
    }

    @Override
    public int hashCode() {
        return Objects.hash(cities, states, totalPower);
    }
}
