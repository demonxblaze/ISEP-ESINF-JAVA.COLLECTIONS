import Classes.City;
import Classes.ResultEX8;
import Classes.State;
import Scanners.FileScanner;

import java.util.*;

public class EX8 {
    public EX8() {
    }

    private  Map<String, Set<State>> cityPowerCounter(String fileName) {
        Map<String, Set<State>> map = new HashMap<>();

        List<String[]> lines = FileScanner.coutryStateCityPower(fileName);

        for (String[] s : lines) {

            String c = s[0];
            String state = s[1];
            String country = s[2];
            int stalls = Integer.parseInt(s[3]);
            int kw = Integer.parseInt(s[4]);
            String status = s[5];

            if (status.equalsIgnoreCase("open")) {

                State stateTemp = new State(state,stalls*kw);
                stateTemp.addCities(c);

                boolean stateFound = false;

                map.computeIfAbsent(country, k -> new TreeSet<>());

                for (Map.Entry<String, Set<State>> entry : map.entrySet()) {
                    if (entry.getKey().equals(country)) {

                        for (State st : entry.getValue()) {
                            if (st.getName().equalsIgnoreCase(state)) {
                                st.addStatePower(stalls*kw);
                                st.addCities(c);
                                stateFound=true;

                            }
                        }
                        if (!stateFound) {
                            map.get(country).add(stateTemp);

                        }
                    }

                }
            }
        }

        return map;
    }

    public  ResultEX8 findTheTop(String filename, int n, Set<String> set) {
        Map<String, Set<State>> map = cityPowerCounter(filename);

        Set<State> topStates = new HashSet<>();

        //Verifica se é uma lista de paises
        if (map.keySet().containsAll(set)) {

            for (Map.Entry<String, Set<State>> entry : map.entrySet()) {

                if (set.contains(entry.getKey())) {

                    for (State state : entry.getValue()) {

                        addState(n, topStates, state);
                    }
                }
            }
            //Senão é uma lista de estados
        } else {
            for (Map.Entry<String, Set<State>> entry : map.entrySet()) {

                for (State state : entry.getValue()) {
                    if (set.contains(state.getName()))
                        addState(n, topStates, state);
                }
            }
        }


        Set<String> cities = new TreeSet<>();
        Set<String> states = new LinkedHashSet<>();
        Integer totalPower=0;
        for (State st : topStates ) {
            totalPower+= st.getStatePower();
            states.add(st.getName());
            cities.addAll(st.getCities());
        }

        return new ResultEX8(cities,states,totalPower);
    }

    private void addState(int n, Set<State> topStates, State state) {
        if (topStates.size() < n) {
            topStates.add(state);
        } else {
            State lessPowerState = new State("null",Integer.MAX_VALUE);
            for (State st : topStates) {
                if (st.getStatePower() < lessPowerState.getStatePower()) {
                    lessPowerState = st;
                }
            }
            if (!lessPowerState.getName().equalsIgnoreCase("null") && lessPowerState.getStatePower()<state.getStatePower()) {
                topStates.remove(lessPowerState);
                topStates.add(state);
            }
        }
    }


}
