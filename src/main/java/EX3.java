import Classes.ParAnos;
import Classes.Powertrain;

import java.util.*;

public class EX3 {
    private static final String BEV = "BEV";
    private static final String PHEV = "PHEV";


    public static Map<String, Map<Integer, Set<Powertrain>>> getSales(List<String[]> list) {
        Map<String, Map<Integer, Set<Powertrain>>> mapList = new HashMap<>();
        for (String[] row : list) {
            String country = row[0];
            String powertrainType = row[1];
            int year = Integer.parseInt(row[2]);
            int numberOfVehicles = Integer.parseInt(row[3]);

            Powertrain powertrain = new Powertrain(powertrainType, numberOfVehicles);

            mapList.computeIfAbsent(country, k -> new HashMap<>()).computeIfAbsent(year, k -> new HashSet<>()).add(powertrain);
        }

        return mapList;
    }

    public static Map<String, Set<ParAnos>> getSalesData(Map<String, Map<Integer, Set<Powertrain>>> mapList ) {
        Map<String, Set<ParAnos>> result = new TreeMap<>();
        for (Map.Entry<String, Map<Integer, Set<Powertrain>>> countryEntry : mapList.entrySet()) {
            Map<Integer, Set<Powertrain>> tempYears = countryEntry.getValue();

            for (Map.Entry<Integer, Set<Powertrain>> yearEntry : tempYears.entrySet()) {
                if (tempYears.containsKey(yearEntry.getKey() + 1)) {
                    Set<Powertrain> tempSet = yearEntry.getValue();
                    int yearEntrySales = 0;
                    int yearEntryPHEVSales = 0;
                    int yearEntryBEVSales = 0;
                    for (Powertrain pt : tempSet) {
                        if (pt.getType().equals(BEV)) {
                            yearEntryBEVSales = pt.getNumberOfVehicles();
                        } else {
                            yearEntryPHEVSales = pt.getNumberOfVehicles();
                        }
                        yearEntrySales += pt.getNumberOfVehicles();
                    }
                    int afterKey = yearEntry.getKey() + 1;
                    Set<Powertrain> tempSet1 = tempYears.get(afterKey);
                    int yearEntrySales1 = 0;
                    int yearEntryPHEVSales1 = 0;
                    int yearEntryBEVSales1 = 0;
                    for (Powertrain pt : tempSet1) {
                        if (pt.getType().equals(BEV)) {
                            yearEntryBEVSales1 = pt.getNumberOfVehicles();
                        } else {
                            yearEntryPHEVSales1 = pt.getNumberOfVehicles();
                        }
                        yearEntrySales1 += pt.getNumberOfVehicles();
                    }
                    if (yearEntrySales1 < yearEntrySales) {
                        int difBEV= yearEntryBEVSales1-yearEntryBEVSales;
                        int difPHEV= yearEntryPHEVSales1-yearEntryPHEVSales;
                        result.computeIfAbsent(countryEntry.getKey(), k -> new TreeSet<>()).add(new ParAnos(yearEntry.getKey(),afterKey,difPHEV,difBEV));
                    }
                }
            }
        }


        return result;
    }

}


