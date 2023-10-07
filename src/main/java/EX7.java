import Classes.CarregadoresPais;
import Scanners.FileScanner;

import java.util.*;

public class EX7 {
    // Pretende-se um relatório de quotas que indique para um determinado ano, por país o número de tomadas de carregamento (stalls),
    // o número total de veículos elétricos, calculado somando os BEV (Battery Electric Vehicles) com os PHEV (Plug-in Electric Vehicles) do campo <powertrain>,
    // e a respetiva quota de superchargers, assumindo um determinado rácio de veículos por tomada.


    // carregadores_europa.csv : Supercharger,StreetAddress,City,State,Zip,Country,Stalls,kW,GPS,Elevm,Status
    //ev_sales.csv : country,powertrain,year,number_of_vehicles


    public static void main(String[] args) {
       //List<String[]> importedSales = FileScanner.lerCSV("project-data/ex7 test files/ex7_sales_teste1.csv");
       //List<String[]> importedChargers = FileScanner.lerCSV("project-data/ex7 test files/ex7_charger_teste1.csv");
        List<String[]> importedSales = FileScanner.lerCSV("project-data/ev_sales.csv");
        List<String[]> importedChargers = FileScanner.lerCSV("project-data/carregadores_europa.csv");
        EX7 ex7 = new EX7();
        Map<String, CarregadoresPais> report = ex7.getReport(importedSales, importedChargers, 2011);
        for (Map.Entry<String, CarregadoresPais> entry : report.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().getTotalNumOfStalls() + " " + entry.getValue().getTotalNumOfVeichels() + " " + entry.getValue().getQuota());
        }


    }

    public Map<String, CarregadoresPais> getReport(List<String[]> importedSales, List<String[]> importedChargers, int year) {

        Map<String, CarregadoresPais> report = new TreeMap<>();
        for (String[] lines : importedChargers) {
            String country = lines[5];
            int stalls = Integer.parseInt(lines[6]);
            // if the country is not in the map, create a new object and add it to the map
            if (!report.containsKey(country)) {
                report.put(country, new CarregadoresPais(country));
            }
            //if country is in the map, get the object and add the stalls
            if (report.containsKey(country))
                report.get(country).addStalls(stalls);

        }
        for (String[] lines : importedSales) {
            String country = lines[0];
            int yearOfSales = Integer.parseInt(lines[2]);
            int numberOfVehicles = Integer.parseInt(lines[3]);
            // if the country is not in the map, create a new object and add it to the map
            if (!report.containsKey(country) && yearOfSales == year) {
                report.put(country, new CarregadoresPais(country));
            }
            //if country is in the map, get the object and add the veichels
            if (report.containsKey(country) && yearOfSales == year) {
                report.get(country).addNumberOfVehicles(numberOfVehicles);
                report.get(country).calculateQuota();
            }

        }
        return report;
    }


}
