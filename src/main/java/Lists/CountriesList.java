package Lists;

import org.example.Country;

import java.util.ArrayList;

public class CountriesList {
    private ArrayList<Country> countries;

    public CountriesList(){
        countries = new ArrayList<Country>();
    }

    public  ArrayList<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }

    public void add(Country c) {
        countries.add(c);
    }
}
