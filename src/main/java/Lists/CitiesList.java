package Lists;

import org.example.City;
import org.example.SuperCharger;

import java.util.ArrayList;

/**
 * Author @
 */
public class CitiesList {
    /**
     * List of cities
     */
    private ArrayList<City> cities;

    /**
     * Constructor
     */
    public CitiesList() {
        setCities(new ArrayList<City>());
    }

    /**
     * Getter
     * @return cities
     */
    public ArrayList<City> getCities() {
        return cities;
    }

    /**
     * Setter
     * @param cities cities
     */
    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    /**
     * Add a city to the list
     * @param city city
     */
    public void add(City city) {
        cities.add(city);
    }
}
