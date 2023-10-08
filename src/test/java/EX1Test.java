import Classes.City;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EX1Test {

    @Test
    public void testExercicio1WithNonexistentFile() {
        EX1 exercicio1 = new EX1();
        String fileName = "nonexistent.csv";
        Map<String, Set<City>> result = exercicio1.getChargerCityPerCountry(fileName);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testExercicio1WithEmptyFile() {
        EX1 exercicio1 = new EX1();
        String fileName = "project-data/empty.csv";
        Map<String, Set<City>> result = exercicio1.getChargerCityPerCountry(fileName);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void exercicio1_Print() {
        EX1 instance = new EX1(); // Replace 'YourClass' with the name of your class that contains the exercicio1 method
        Map<String, Set<City>> map = instance.getChargerCityPerCountry("project-data/carregadores_europa.csv");

        for (Map.Entry<String, Set<City>> entry : map.entrySet()) {
            System.out.println("Country: " + entry.getKey());
            Set<City> cities = entry.getValue();
            for (City city : cities) {
                System.out.println("  City: " + city.getName() + ", Number of Chargers: " + city.getNumberChargers());
            }
        }
    }

    @org.junit.jupiter.api.Test
    public void exercicio1_Ficheiro1_CheckResults() {
        EX1 exercicio1 = new EX1();

        String fileName = "project-data/ex1 test files/exercicio1_Test1.csv";

        Map<String, Set<City>> result = exercicio1.getChargerCityPerCountry(fileName);

        assertNotNull(result);
        assertEquals(6, result.size());

        Map<String, Integer> expectedCityCounts = new HashMap<>();
        expectedCityCounts.put("Canada", 1);
        expectedCityCounts.put("Argentina", 1);
        expectedCityCounts.put("Singapore", 1);
        expectedCityCounts.put("Mexico", 1);
        expectedCityCounts.put("Australia", 1);
        expectedCityCounts.put("Spain", 1);

        Map<String, Integer> expectedChargerCounts = new HashMap<>();
        expectedChargerCounts.put("Toronto", 6);
        expectedChargerCounts.put("Buenos Aires", 6);
        expectedChargerCounts.put("Singapore", 6);
        expectedChargerCounts.put("Mexico City", 6);
        expectedChargerCounts.put("Perth", 6);
        expectedChargerCounts.put("Madrid", 6);


        for (Map.Entry<String, Set<City>> entry : result.entrySet()) {
            String country = entry.getKey();
            Set<City> cities = entry.getValue();

            if (expectedCityCounts.containsKey(country)) {
                int expectedCityCount = expectedCityCounts.get(country);
                assertEquals(expectedCityCount, cities.size());
            }


            for (City city : cities) {
                if (expectedChargerCounts.containsKey(city.getName())) {
                    int expectedChargerCount = expectedChargerCounts.get(city.getName());
                    assertEquals(expectedChargerCount, city.getNumberChargers());
                }
            }
        }

    }

    @Test
    public void exercicio1_Ficheiro2_CheckResults() {
        EX1 exercicio1 = new EX1();

        String fileName = "project-data/ex1 test files/exercicio1_Test2.csv";

        Map<String, Set<City>> result = exercicio1.getChargerCityPerCountry(fileName);

        assertNotNull(result);
        assertEquals(13, result.size());

        Map<String, Integer> expectedCityCounts = new HashMap<>();
        expectedCityCounts.put("USA", 2);
        expectedCityCounts.put("Argentina", 1);
        expectedCityCounts.put("Japan", 1);
        expectedCityCounts.put("United Kingdom", 1);
        expectedCityCounts.put("India", 1);
        expectedCityCounts.put("Russia", 1);
        expectedCityCounts.put("South Korea", 1);
        expectedCityCounts.put("China", 1);
        expectedCityCounts.put("Brazil", 1);
        expectedCityCounts.put("Australia", 1);
        expectedCityCounts.put("France", 1);
        expectedCityCounts.put("Peru", 1);
        expectedCityCounts.put("Germany", 1);

        Map<String, Integer> expectedChargerCounts = new HashMap<>();
        expectedChargerCounts.put("Los Angeles", 2);
        expectedChargerCounts.put("New York", 4);
        expectedChargerCounts.put("Buenos Aires", 2);
        expectedChargerCounts.put("Tokyo", 4);
        expectedChargerCounts.put("London", 4);
        expectedChargerCounts.put("Mumbai", 4);
        expectedChargerCounts.put("Moscow", 4);
        expectedChargerCounts.put("Seoul", 2);
        expectedChargerCounts.put("Shanghai", 4);
        expectedChargerCounts.put("São Paulo", 4);
        expectedChargerCounts.put("Sydney", 4);
        expectedChargerCounts.put("Paris", 4);
        expectedChargerCounts.put("Lima", 2);
        expectedChargerCounts.put("Berlin", 4);


        for (Map.Entry<String, Set<City>> entry : result.entrySet()) {
            String country = entry.getKey();
            Set<City> cities = entry.getValue();

            if (expectedCityCounts.containsKey(country)) {
                int expectedCityCount = expectedCityCounts.get(country);
                assertEquals(expectedCityCount, cities.size());
            }


            for (City city : cities) {
                if (expectedChargerCounts.containsKey(city.getName())) {
                    int expectedChargerCount = expectedChargerCounts.get(city.getName());
                    assertEquals(expectedChargerCount, city.getNumberChargers());
                }
            }
        }
    }

    @Test
    public void exercicio1_Ficheiro3_CheckResults() {
        EX1 exercicio1 = new EX1();

        String fileName = "project-data/ex1 test files/exercicio1_Test3.csv";

        Map<String, Set<City>> result = exercicio1.getChargerCityPerCountry(fileName);

        assertNotNull(result);
        assertEquals(15, result.size());

        Map<String, Integer> expectedCityCounts = new HashMap<>();
        expectedCityCounts.put("USA", 3);
        expectedCityCounts.put("Japan", 1);
        expectedCityCounts.put("United Kingdom", 1);
        expectedCityCounts.put("Spain", 1);
        expectedCityCounts.put("India", 1);
        expectedCityCounts.put("Russia", 1);
        expectedCityCounts.put("Canada", 1);
        expectedCityCounts.put("South Korea", 1);
        expectedCityCounts.put("China", 2);
        expectedCityCounts.put("Brazil", 1);
        expectedCityCounts.put("Italy", 1);
        expectedCityCounts.put("Australia", 2);
        expectedCityCounts.put("France", 1);
        expectedCityCounts.put("Peru", 1);
        expectedCityCounts.put("Germany", 1);

        Map<String, Integer> expectedChargerCounts = new HashMap<>();
        expectedChargerCounts.put("Los Angeles", 1);
        expectedChargerCounts.put("Chicago", 3);
        expectedChargerCounts.put("New York", 1);
        expectedChargerCounts.put("Tokyo", 1);
        expectedChargerCounts.put("London", 1);
        expectedChargerCounts.put("Madrid", 1);
        expectedChargerCounts.put("Mumbai", 1);
        expectedChargerCounts.put("Moscow", 1);
        expectedChargerCounts.put("Toronto", 1);
        expectedChargerCounts.put("Seoul", 3);
        expectedChargerCounts.put("Beijing", 1);
        expectedChargerCounts.put("Shanghai", 3);
        expectedChargerCounts.put("São Paulo", 1);
        expectedChargerCounts.put("Rome", 3);
        expectedChargerCounts.put("Brisbane", 3);
        expectedChargerCounts.put("Sydney", 2);
        expectedChargerCounts.put("Paris", 1);
        expectedChargerCounts.put("Lima", 3);
        expectedChargerCounts.put("Berlin", 1);

        for (Map.Entry<String, Set<City>> entry : result.entrySet()) {
            String country = entry.getKey();
            Set<City> cities = entry.getValue();

            if (expectedCityCounts.containsKey(country)) {
                int expectedCityCount = expectedCityCounts.get(country);
                assertEquals(expectedCityCount, cities.size());
            }


            for (City city : cities) {
                if (expectedChargerCounts.containsKey(city.getName())) {
                    int expectedChargerCount = expectedChargerCounts.get(city.getName());
                    assertEquals(expectedChargerCount, city.getNumberChargers());
                }
            }
        }
    }

    @Test
    public void exercicio1_Ficheiro4_CheckResults() {
        EX1 exercicio1 = new EX1();

        String fileName = "project-data/ex1 test files/exercicio1_Test4.csv";

        Map<String, Set<City>> result = exercicio1.getChargerCityPerCountry(fileName);

        assertNotNull(result);
        assertEquals(17, result.size());

        Map<String, Integer> expectedCityCounts = new HashMap<>();
        expectedCityCounts.put("USA", 7);
        expectedCityCounts.put("Argentina", 1);
        expectedCityCounts.put("Singapore", 1);
        expectedCityCounts.put("Japan", 1);
        expectedCityCounts.put("United Kingdom", 1);
        expectedCityCounts.put("United Arab Emirates", 1);
        expectedCityCounts.put("India", 2);
        expectedCityCounts.put("Russia", 1);
        expectedCityCounts.put("Canada", 1);
        expectedCityCounts.put("Ireland", 1);
        expectedCityCounts.put("China", 1);
        expectedCityCounts.put("Brazil", 1);
        expectedCityCounts.put("Mexico", 1);
        expectedCityCounts.put("South Africa", 1);
        expectedCityCounts.put("Australia", 2);
        expectedCityCounts.put("France", 1);
        expectedCityCounts.put("Germany", 1);


        Map<String, Integer> expectedChargerCounts = new HashMap<>();
        expectedChargerCounts.put("New York", 1);
        expectedChargerCounts.put("Los Angeles", 1);
        expectedChargerCounts.put("Denver", 1);
        expectedChargerCounts.put("Miami", 1);
        expectedChargerCounts.put("San Francisco", 1);
        expectedChargerCounts.put("Chicago", 1);
        expectedChargerCounts.put("Seattle", 1);
        expectedChargerCounts.put("Buenos Aires", 1);
        expectedChargerCounts.put("Singapore", 2);
        expectedChargerCounts.put("Tokyo", 2);
        expectedChargerCounts.put("London", 1);
        expectedChargerCounts.put("Dubai", 1);
        expectedChargerCounts.put("New Delhi", 2);
        expectedChargerCounts.put("Mumbai", 2);
        expectedChargerCounts.put("Moscow", 1);
        expectedChargerCounts.put("Toronto", 2);
        expectedChargerCounts.put("Dublin", 1);
        expectedChargerCounts.put("Shanghai", 1);
        expectedChargerCounts.put("Rio de Janeiro", 2);
        expectedChargerCounts.put("Mexico City", 1);
        expectedChargerCounts.put("Cape Town", 1);
        expectedChargerCounts.put("Sydney", 3);
        expectedChargerCounts.put("Perth", 1);
        expectedChargerCounts.put("Paris", 2);
        expectedChargerCounts.put("Berlin", 2);


        for (Map.Entry<String, Set<City>> entry : result.entrySet()) {
            String country = entry.getKey();
            Set<City> cities = entry.getValue();

            if (expectedCityCounts.containsKey(country)) {
                int expectedCityCount = expectedCityCounts.get(country);
                assertEquals(expectedCityCount, cities.size());
            }


            for (City city : cities) {
                if (expectedChargerCounts.containsKey(city.getName())) {
                    int expectedChargerCount = expectedChargerCounts.get(city.getName());
                    assertEquals(expectedChargerCount, city.getNumberChargers());
                }
            }
        }
    }
}