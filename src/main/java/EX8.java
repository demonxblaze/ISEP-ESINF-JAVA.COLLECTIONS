import Classes.City;
import Classes.State;
import Scanners.FileScanner;

import java.util.*;

public class EX8 {

    public static Map<String, Set<City>> cityPowerCounter(String fileName) {
        Map<String, Set<City>> map = new HashMap<>();

        List<String[]> lines = FileScanner.coutryStateCityPower(fileName);

        for (String[] s : lines) {

            String city = s[0];
            String state = s[1];
            String country = s[2];
            int stalls = Integer.parseInt(s[3]);
            int kw = Integer.parseInt(s[4]);


            Set<City> cities = map.getOrDefault(country, new HashSet<>());


            boolean cityFound = false;
            for (City c : cities) {
                if (c.getName().equals(city)) {
                    c.setPower(kw,stalls);
                    cityFound = true;
                }
            }

            if (!cityFound) {
                cities.add(new City(city, state, stalls,kw));
            }

            map.put(country, cities);
        }

        return map;
    }

    public static Object[] findTheTop(String filename, int n, Set<String> set) {
        Map<String, Set<City>> map= cityPowerCounter(filename);


        //Verifica se é uma lista de paises
        if (map.keySet().containsAll(set)){


            for(Map.Entry<String,Set<City>> entry : map.entrySet() ) {
                Set<City> entryCities = entry.getValue();

            }


        //Senão é uma lista de estados
        }else{

        }
        return null;
    }


}