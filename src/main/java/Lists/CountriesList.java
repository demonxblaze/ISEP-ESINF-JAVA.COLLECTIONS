package Lists;

import org.example.Country;

import java.util.ArrayList;

/**
 * Author @
 */
public class CountriesList {
    /**
     * List of countries
     */
    private ArrayList<Country> countries;

    /**
     * Constructor
     */
    public CountriesList(){
        countries = new ArrayList<Country>();
    }

    /**
     * Getter
     * @return countries
     */
    public  ArrayList<Country> getCountries() {
        return countries;
    }

    /**
     * Setter
     * @param countries countries
     */
    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }

    /**
     * Add a country to the list
     * @param c country
     */
    public void add(Country c) {
        countries.add(c);
    }
}
