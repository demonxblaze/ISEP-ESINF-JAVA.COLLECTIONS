import EX8.City;
import Classes.State;
import Scanners.FileScanner;

import java.util.*;

public class EX8 {

    public static Map<String, Set<State>> cityPowerCounter(String fileName) {
        Map<String, Set<State>> map = new HashMap<>();

        List<String[]> lines = FileScanner.lerCSV(fileName);

        for (String[] s : lines) {
            String country = s[5];
            String city = s[2];
            String state = s[3];
            Integer stalls = Integer.parseInt(s[6]);
            Integer power = Integer.parseInt(s[7]);


            Set<State> states = map.getOrDefault(country, new HashSet<>());


            boolean stateFound = false;
            for (State st : states) {
                if (st.getName().equals(state)) {
                    stateFound = true;
                    for (City c : st.getCities()) {
                        if (c.getName().equals(city)) {
                            c.setPower(power, stalls);
                        }
                    }
                }
            }

            if (!stateFound) {
                Set<City> cities = new HashSet<>();
                if (s[10].equalsIgnoreCase("open")) {
                    City ct = new City(city, stalls, power);
                    cities.add(ct);
                }
                states.add(new State(state, cities));
            }

            map.put(country, states);
        }

        return map;
    }

    public static Object[] findTheTop(String filename, int n, Set<String> set) {
        Map<String, Set<State>>powerPerCountry = EX8.cityPowerCounter(filename);
        Set<State> topStates = new TreeSet<>();
        int power = 0;
        Set<String> cities = new TreeSet<>();

        //verifica se o input é de paises
        if (powerPerCountry.keySet().containsAll(set)) {
            //itera cada pais
            for (Map.Entry<String, Set<State>> entry : powerPerCountry.entrySet()) {
                //verifica se o pais pertence ao input
                if (set.contains(entry.getKey())){
                    //itera cada estado do pais
                    power = getPower(n, topStates, power, entry);

                }
            }


        } else {
            for (Map.Entry<String, Set<State>> entry : powerPerCountry.entrySet()) {

                if (entry.getValue().containsAll(set)){

                    power = getPower(n, topStates, power, entry);

                }
            }
        }
        for (State state: topStates) {
            for(City c: state.getCities()) {
                cities.add(c.getName());
            }
        }
        Set<String> topStatesString = new HashSet<>();
        for ( State i : topStates ) {
            topStatesString.add(i.getName());
        }
        return new Object[]{topStatesString, power, cities};
    }

    private static int getPower(int n, Set<State> topStates, int power, Map.Entry<String, Set<State>> entry) {
        for (State st : entry.getValue()) {
            int statePower = 0;
            for (City c : st.getCities()) {
                statePower += c.getPower();
            }
            st.setStatePower(statePower);
            if (topStates.size() < n) {
                power+= statePower;
                topStates.add(st);
            } else {
                State lesspower = new State("null", null);
                for (State sta : topStates) {
                    if (lesspower.getStatePower() > sta.getStatePower()) {
                        lesspower = sta;
                    }
                }
                if (statePower > lesspower.getStatePower()) {
                    topStates.remove(lesspower);
                    power+= statePower;
                    topStates.add(st);
                }
            }

        }
        return power;
    }
}