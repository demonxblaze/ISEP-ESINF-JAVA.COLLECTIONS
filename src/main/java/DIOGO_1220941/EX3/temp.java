package DIOGO_1220941.EX3;
import DIOGO_1220941.EX3.ParAnos;
import DIOGO_1220941.EX3.Powertrain;
import Scanners.FileScanner;

import java.util.*;

public class temp {


    private static final String BEV = "BEV";


    public static void main(String[] args) {
        List<String[]> csvData = FileScanner.lerCSV("exercicio3_Test1.csv");

        Map<String, Map<Integer, Set<Powertrain>>> resultMap = EX3.getSales(csvData);

        Map<String, Set<ParAnos>> map = EX3.getSalesData(resultMap);

        printMapFromCSV(resultMap);

        printMapDecreasedSales(map);


    }
    public static void printMapFromCSV(Map<String, Map<Integer, Set<Powertrain>>> resultMap){
        for (Map.Entry<String, Map<Integer, Set<Powertrain>>> entry : resultMap.entrySet()) {
            String country = entry.getKey();
            Map<Integer, Set<Powertrain>> yearPowertrains = entry.getValue();


            System.out.println("Country: " + country);
            for (Map.Entry<Integer, Set<Powertrain>> yearEntry : yearPowertrains.entrySet()) {
                int year = yearEntry.getKey();
                Set<Powertrain> powertrains = yearEntry.getValue();

                System.out.println("  Year: " + year);
                for (Powertrain powertrain : powertrains) {
                    System.out.println("    Powertrain: " + powertrain.getType() +
                            ", Number of Vehicles: " + powertrain.getNumberOfVehicles());
                }
            }
        }
    }
    public static void printMapDecreasedSales(Map<String, Set<ParAnos>> map) {
        for (Map.Entry<String, Set<ParAnos>> entry : map.entrySet()) {
            String key = entry.getKey();
            Set<ParAnos> value = entry.getValue();

            System.out.println("Pais: " + key);
            System.out.println("Values:");

            for (ParAnos parAnos : value) {
                System.out.println(parAnos.getAnoAntes()+"/"+parAnos.getAnoDepois());

                System.out.println("  Difference PHEV: " + parAnos.getDifPHEV());
                System.out.println("  Difference BEV: " + parAnos.getDifBEV());
                System.out.println("  Difference Total: " + parAnos.getDifTotal());
            }
        }
    }
}

