import Scanners.FileScanner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EX2 {
    //Pretende-se conhecer a evolução do número de veículos elétricos dos vários países.
    //Para isso determine a taxa de crescimento entre 2 quaisquer anos do número de veículos
    // elétricos nos vários países.
    // A taxa é dada por (último ano - primeiro ano) / primeiro ano.
    public static void main(String[] args) {
        List<String[]> imported = FileScanner.lerCSV("project-data/ev_sales.csv");
        EX2 ex2 = new EX2();
        Map<String, Double> report = ex2.getSalesByCountrieAndYear(imported, 2011, 2012);
        for (Map.Entry<String, Double> entry : report.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public Map<String, Double> getSalesByCountrieAndYear(List<String[]> imported, int firtYear, int lastYear) {
        Map<String, Map<Integer, Integer>> salesBycountryAndYear = new HashMap<>();
        for (String[] row : imported) {
            String country = row[0];
            int year = Integer.parseInt(row[2]);
            int numberOfVehicles = Integer.parseInt(row[3]);

            if (!salesBycountryAndYear.containsKey(country)) {
                salesBycountryAndYear.put(country, new HashMap<Integer, Integer>());
                salesBycountryAndYear.get(country).put(year, numberOfVehicles);

            } else {
                if (!salesBycountryAndYear.get(country).containsKey(year)) {
                    salesBycountryAndYear.get(country).put(year, numberOfVehicles);

                } else {
                    salesBycountryAndYear.get(country).put(year, salesBycountryAndYear.get(country).get(year) + numberOfVehicles);
                }
            }


        }
        return getEvolutationRateByCounty(salesBycountryAndYear, firtYear, lastYear);
    }

    private Map<String, Double> getEvolutationRateByCounty(Map<String, Map<Integer, Integer>> salesBycountryAndYear, int firtYear, int lastYear) {
        Map<String, Double> evolutationRateByCounty = new HashMap<>();
        for (Map.Entry<String, Map<Integer, Integer>> country : salesBycountryAndYear.entrySet()) {

            if (country.getValue().get(firtYear) != null && country.getValue().get(lastYear) != null) {
                //q: does it make mor sense to use .getValue().contains ?
                //a:
                double evolutationRate = evolutionRate(country.getValue().get(firtYear), country.getValue().get(lastYear));
                evolutationRateByCounty.put(country.getKey(), evolutationRate);
            } else {
                evolutationRateByCounty.put(country.getKey(), null);
            }

        }
        return evolutationRateByCounty;
    }

    private double evolutionRate(int firstYearValues, int lastYearValues) {
            double evolutationRate = ((double) lastYearValues - (double) firstYearValues) / (double) firstYearValues;
        return Math.round(evolutationRate * 1000.0) / 1000.0;
        }

    }


