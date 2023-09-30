package Ricardo_1220606;

import Scanners.FileScanner;

import java.util.*;

/**
 * Classe que contém o método que resolve o exercício 1
 */
public class Exercicio1 {

    public Map<String, Set<City>> exercicio1(String fileName){
        Map <String, Set<City>> map = new HashMap<>();

        List<String[]> lines = FileScanner.lerCSV(fileName);

        for (String[] s: lines ) {
            String country = s[1];
            String city = s[2];

            if (map.containsKey(country)) {
                for (City c : map.get(country)) {
                    if (c.getName().equals(city)) {
                        c.setNumberChargers(c.getNumberChargers() + 1);
                    } else {
                        map.get(country).add(new City(city, 1));
                    }
                }
            } else {
                Set<City> set = new HashSet<>();
                set.add(new City(city, 1));
                map.put(country, set);
            }
        }


        return map;

    }

}
