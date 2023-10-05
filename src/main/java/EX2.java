import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EX2 {
    //Pretende-se conhecer a evolução do número de veículos elétricos dos vários países.
    //Para isso determine a taxa de crescimento entre 2 quaisquer anos do número de veículos
    // elétricos nos vários países.
    // A taxa é dada por (último ano - primeiro ano) / primeiro ano.

    public Map<String,Double> getSalesByCountrieAndYear(List<String[]> imported,int firtYear,int lastYear) {
        Map<String, Map<Integer, Integer>> salesBycountryAndYear = new HashMap<>();
        for (String[] row : imported) {
            String country = row[0];
            int year = Integer.parseInt(row[2]);
            int numberOfVehicles = Integer.parseInt(row[3]);

            salesBycountryAndYear.get(country).put(year, salesBycountryAndYear.get(country).get(year) + numberOfVehicles);

            getEvolutationRateByCounty(salesBycountryAndYear,firtYear,lastYear);

        }
        return getEvolutationRateByCounty(salesBycountryAndYear,firtYear,lastYear);
    }
    public Map<String,Double> getEvolutationRateByCounty(Map<String, Map<Integer, Integer>> salesBycountryAndYear,int firtYear,int lastYear) {
        Map<String, Double> evolutationRateByCounty = new HashMap<>();
        for (Map.Entry<String, Map<Integer, Integer>> country : salesBycountryAndYear.entrySet()) {
            Map<Integer, Integer> tempYears = country.getValue();

            int firstYearSales = country.getValue().get(firtYear);
            int lastYearSales = tempYears.get(lastYear);
            double evolutationRate = (lastYearSales - firstYearSales) / firstYearSales;
            evolutationRateByCounty.put(country.getKey(), evolutationRate);

        }
        return evolutationRateByCounty;
    }
}

