package Lists;

import org.example.City;
import org.example.SuperCharger;

import java.util.ArrayList;

public class CitiesList {

    private ArrayList<City> cities;

    public CitiesList() {
        setCities(new ArrayList<City>());
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public void add(City city) {
        cities.add(city);
    }
}
