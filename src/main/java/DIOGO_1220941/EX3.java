package DIOGO_1220941;


import Scanners.FileScanner;


import java.util.*;

public class EX3 {

    public static Map<String,Map<Integer, Set<Powertrain>>> mapList = new HashMap<>();

    public static List<String[]> list = FileScanner.lerCSV("project-data/ev_sales.csv");

    public static Map<String,Map<Integer, Set<Powertrain>>> getSales(){

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


}


