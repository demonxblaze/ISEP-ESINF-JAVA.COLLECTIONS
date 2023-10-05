import Classes.City;
import Classes.State;
import Scanners.FileScanner;

import java.util.*;

public class EX8 {

    public static Map<String, Map<String, Set<City>>> cityPowerCounter(String fileName) {
        Map<String, Map<String, Set<City>>> map = new HashMap<>();

        List<String[]> lines = FileScanner.coutryStateCityPower(fileName);

        for (String[] s : lines) {

            String c = s[0];
            String state = s[1];
            String country = s[2];
            int stalls = Integer.parseInt(s[3]);
            int kw = Integer.parseInt(s[4]);


            City city = new City(c,stalls,kw);

            boolean cityFound = false;

            map.computeIfAbsent(country, k -> new HashMap<>()).computeIfAbsent(state, k -> new HashSet<>());

            for (Map.Entry<String, Map<String, Set<City>>> entry : map.entrySet()) {
                if (entry.getKey().equals(country)) {

                    for (Map.Entry<String, Set<City>> values : entry.getValue().entrySet()) {
                        if (values.getKey().equalsIgnoreCase(state)) {
                            for (City ci : values.getValue()) {
                                if (ci.getName().equalsIgnoreCase(c)) {
                                    ci.setPower(kw, stalls);
                                    cityFound= true;
                                }
                            }
                        }
                    }
                }

            }
            if (!cityFound){
                map.get(country).get(state).add(city);
            }

        }

        return map;
    }

    public static Map<Set<String>, Map<Integer, Set<String>>> findTheTop(String filename, int n, Set<String> set) {
        Map<String, Map<String, Set<City>>> map= cityPowerCounter(filename);

        Map<String, Set<City>> topStates = new HashMap<>() ;
        //Verifica se é uma lista de paises
        if (map.keySet().containsAll(set)) {

            for (Map.Entry<String, Map<String, Set<City>>> entry : map.entrySet()) {

                if (set.contains(entry.getKey())) {

                    for (Map.Entry<String, Set<City>> values : entry.getValue().entrySet()) {
                        int statePower = 0;
                        for(City c : values.getValue()) {
                            statePower += c.getPower();
                        }
                        if (topStates.keySet().size()<n){
                            topStates.put(values.getKey(),values.getValue());
                        }else{
                            int lessPower = 999999999;
                            String lessPowerState= "null";
                            for (Map.Entry<String, Set<City>> s : topStates.entrySet() ) {
                                int powerState= 0;
                                for (City c: s.getValue()) {
                                    powerState+= c.getPower();
                                }
                                if (powerState<lessPower){
                                    lessPower= powerState;
                                    lessPowerState= s.getKey();
                                }
                            }
                            if (statePower>lessPower ){
                                topStates.remove(lessPowerState);
                                topStates.put(values.getKey(),values.getValue());
                            }
                        }
                    }


                }
            }
            //Senão é uma lista de estados
        }else{
            for (Map.Entry<String, Map<String, Set<City>>> entry : map.entrySet()) {

                for (Map.Entry<String, Set<City>> values : entry.getValue().entrySet()) {
                    // Se o estado estiver na lista de estados
                    if (set.contains(values.getKey())) {
                        int statePower = 0;
                        //calcular o power do estado
                        for(City c : values.getValue()) {
                            statePower += c.getPower();
                        }
                        //verificar se a lista de topEstados é menor que n
                        //se não for, adiciona o estado
                        if (topStates.keySet().size()<n){
                            topStates.put(values.getKey(),values.getValue());
                        }else{
                            //caso seja >n, será confirmado se existe algum estado na lista com menos potencia que ele
                            int lessPower = 999999999;
                            String lessPowerState= "null";
                            //calcula o power de cada state no top
                            for (Map.Entry<String, Set<City>> s : topStates.entrySet() ) {
                                int powerState= 0;
                                for (City c: s.getValue()) {
                                    powerState+= c.getPower();
                                }
                                //se for menor que o menor power registado até ao momento, passa a ser o menor
                                if (powerState<lessPower){
                                    lessPower= powerState;
                                    lessPowerState= s.getKey();
                                }
                            }
                            //se no final de verificar os top States todos, este tiver maior power, é adicionado e o com menor é removido
                            if (statePower>lessPower && !lessPowerState.equals("null" )){
                                topStates.remove(lessPowerState);
                                topStates.put(values.getKey(),values.getValue());
                            }
                        }
                    }
                }



            }
        }
        Set<String> cities = new TreeSet<>();
        Set<String> states = topStates.keySet();
        Integer totalPower=0;
        for (Map.Entry<String, Set<City>> s : topStates.entrySet() ) {
            for (City c: s.getValue()  ) {
                cities.add(c.getName()) ;
                totalPower+= c.getPower();
            }
        }
        Map<Integer, Set<String>> resultValue= new HashMap<>();
        resultValue.put(totalPower,cities);
        Map<Set<String>, Map<Integer, Set<String>>> result = new HashMap<>();

        result.put(states,resultValue);
        return result;
    }


}