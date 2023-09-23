package Singleton;

import Lists.CountriesList;
import org.example.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Repository {

    private CountriesList countriesList;

    public Repository(){
        countriesList= new CountriesList();
    }

    public void addCountry(Country c){
        countriesList.add(c);
    }

    public  ArrayList<Country> getCountriesList() {
        return countriesList.getCountries();
    }
}
