package Ricardo_1220606;

import Scanners.FileScanner;

import java.util.*;

/**
 * Classe que contém o método que resolve o exercício 1
 */
public class Exercicio1 {

    public Map<String, Set<City>> exercicio1(String fileName){
        Map<String, Set<City>> map = new HashMap<>();

        List<String[]> lines = FileScanner.lerCSV(fileName);

        for (String[] s : lines) {
            String country = s[5];
            String city = s[2];


            Set<City> cities = map.getOrDefault(country, new HashSet<>());


            boolean cityFound = false;
            for (City c : cities) {
                if (c.getName().equals(city)) {
                    c.setNumberChargers(c.getNumberChargers() + 1);
                    cityFound = true;
                }
            }

            if (!cityFound) {
                cities.add(new City(city, 1));
            }

            map.put(country, cities);
        }

        return map;
    }

}
