import Classes.CarregadoresPais;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class EX4Test {
/*
    @Test
    public void exercicio4_Print() {
        EX4 exercicio4 = new EX4();

        String fileName = "project-data/carregadores_europa.csv";

        Set<CarregadoresPais> dadosPorPais = exercicio4.getChargerPerCountryFromKW(fileName, 150);

        System.out.printf("%-15s %-12s %-10s %s%n", "", "kW > 150", "kW <= 150", "Total");


        for (CarregadoresPais carregador : dadosPorPais) {
            String country = carregador.getPais();
            int above150 = carregador.getNumKwAcima();
            int belowOrEqual150 = carregador.getNumKwAbaixo();
            int total = carregador.getTotal();

            System.out.printf("%-15s %-12d %-10d %d%n", country, above150, belowOrEqual150, total);
        }
    }
*/
    @Test
    public void exercicio4_CheckGermanyExists(){
        EX4 exercicio4 = new EX4();

        String fileName = "project-data/carregadores_europa.csv";

        Set<CarregadoresPais> dadosPorPais = exercicio4.getChargerPerCountryFromKW(fileName, 150);

        for (CarregadoresPais carregador : dadosPorPais) {
            if (carregador.getPais().equals("Germany")) {
                assert true;
            }
        }

    }

    @Test
    void exercicio4_TestGermany() {
        EX4 exercicio4 = new EX4();

        String fileName = "project-data/carregadores_europa.csv";

        Set<CarregadoresPais> dadosPorPais = exercicio4.getChargerPerCountryFromKW(fileName, 150);

        for (CarregadoresPais carregador : dadosPorPais) {
            String country = carregador.getPais();

            if (country.equals("Germany")) {
                int above150 = carregador.getNumKwAcima();
                int belowOrEqual150 = carregador.getNumKwAbaixo();
                int total = carregador.getTotal();

                assertEquals(above150, 133);
                assertEquals(belowOrEqual150, 50);
                assertEquals(total, 183);
            }
        }
    }

   /* @Test
    public void exercicio4_Test1_Print(){
        EX4 exercicio4 = new EX4();

        String fileName = "project-data/ex 4 test files/exercicio4_Test4.csv";

        Set<CarregadoresPais> dadosPorPais = exercicio4.getChargerPerCountryFromKW(fileName, 150);

        System.out.printf("%-15s %-12s %-10s %s%n", "", "kW > 150", "kW <= 150", "Total");


        for (CarregadoresPais carregador : dadosPorPais) {
            String country = carregador.getPais();
            int above150 = carregador.getNumKwAcima();
            int belowOrEqual150 = carregador.getNumKwAbaixo();
            int total = carregador.getTotal();

            System.out.printf("%-15s %-12d %-10d %d%n", country, above150, belowOrEqual150, total);
        }
    }*/

    @Test
    public void exercicio4_Test1_CheckCountries() {
        EX4 exercicio4 = new EX4();

        String fileName = "project-data/ex 4 test files/exercicio4_Test1.csv";

        Set<CarregadoresPais> dadosPorPais = exercicio4.getChargerPerCountryFromKW(fileName, 150);


        Map<String, Integer[]> expectedValues = new HashMap<>();
        expectedValues.put("USA", new Integer[]{8, 8, 16});
        expectedValues.put("Australia", new Integer[]{4, 4, 8});
        expectedValues.put("India", new Integer[]{3, 3, 6});
        expectedValues.put("France", new Integer[]{2, 3, 5});
        expectedValues.put("Germany", new Integer[]{2, 2, 4});
        expectedValues.put("United Kingdom", new Integer[]{2, 2, 4});
        expectedValues.put("Canada", new Integer[]{2, 1, 3});
        expectedValues.put("Japan", new Integer[]{2, 1, 3});
        expectedValues.put("Spain", new Integer[]{1, 2, 3});
        expectedValues.put("Turkey", new Integer[]{0, 3, 3});
        expectedValues.put("United Arab Emirates", new Integer[]{1, 2, 3});
        expectedValues.put("Argentina", new Integer[]{1, 1, 2});
        expectedValues.put("Brazil", new Integer[]{2, 0, 2});
        expectedValues.put("China", new Integer[]{1, 1, 2});
        expectedValues.put("Italy", new Integer[]{0, 2, 2});
        expectedValues.put("Singapore", new Integer[]{1, 1, 2});
        expectedValues.put("Hong Kong", new Integer[]{0, 1, 1});
        expectedValues.put("Mexico", new Integer[]{1, 0, 1});
        expectedValues.put("Russia", new Integer[]{1, 0, 1});
        expectedValues.put("South Africa", new Integer[]{1, 0, 1});

        for (CarregadoresPais carregador : dadosPorPais) {
            String country = carregador.getPais();
            int above150 = carregador.getNumKwAcima();
            int belowOrEqual150 = carregador.getNumKwAbaixo();
            int total = carregador.getTotal();

            if (expectedValues.containsKey(country)) {
                Integer[] expected = expectedValues.get(country);
                assertEquals(above150, expected[0]);
                assertEquals(belowOrEqual150, expected[1]);
                assertEquals(total, expected[2]);
            }
        }
    }

    @Test
    public void exercicio4_Test2_CheckCountries() {
        EX4 exercicio4 = new EX4();

        String fileName = "project-data/ex 4 test files/exercicio4_Test2.csv";

        Set<CarregadoresPais> dadosPorPais = exercicio4.getChargerPerCountryFromKW(fileName, 150);

        Map<String, Integer[]> expectedValues = new HashMap<>();
        expectedValues.put("USA", new Integer[] { 9, 0, 9 });
        expectedValues.put("India", new Integer[] { 2, 0, 2 });
        expectedValues.put("South Africa", new Integer[] { 2, 0, 2 });
        expectedValues.put("Spain", new Integer[] { 2, 0, 2 });
        expectedValues.put("Argentina", new Integer[] { 1, 0, 1 });
        expectedValues.put("Australia", new Integer[] { 1, 0, 1 });
        expectedValues.put("Canada", new Integer[] { 1, 0, 1 });
        expectedValues.put("China", new Integer[] { 1, 0, 1 });
        expectedValues.put("France", new Integer[] { 1, 0, 1 });
        expectedValues.put("Germany", new Integer[] { 1, 0, 1 });
        expectedValues.put("Italy", new Integer[] { 1, 0, 1 });
        expectedValues.put("Japan", new Integer[] { 1, 0, 1 });
        expectedValues.put("Mexico", new Integer[] { 1, 0, 1 });
        expectedValues.put("Russia", new Integer[] { 1, 0, 1 });
        expectedValues.put("Singapore", new Integer[] { 1, 0, 1 });
        expectedValues.put("Turkey", new Integer[] { 1, 0, 1 });
        expectedValues.put("United Arab Emirates", new Integer[] { 1, 0, 1 });
        expectedValues.put("United Kingdom", new Integer[] { 1, 0, 1 });

        for (CarregadoresPais carregador : dadosPorPais) {
            String country = carregador.getPais();
            int above150 = carregador.getNumKwAcima();
            int belowOrEqual150 = carregador.getNumKwAbaixo();
            int total = carregador.getTotal();

            if (expectedValues.containsKey(country)) {
                Integer[] expected = expectedValues.get(country);
                assertEquals(above150, expected[0]);
                assertEquals(belowOrEqual150, expected[1]);
                assertEquals(total, expected[2]);
            }
        }
    }

    @Test
    public void exercicio4_Test3_CheckCountries() {
        EX4 exercicio4 = new EX4();

        String fileName = "project-data/ex 4 test files/exercicio4_Test3.csv";

        Set<CarregadoresPais> dadosPorPais = exercicio4.getChargerPerCountryFromKW(fileName, 150);


        Map<String, Integer[]> expectedValues = new HashMap<>();
        expectedValues.put("USA", new Integer[]{18, 0, 18});


        for (CarregadoresPais carregador : dadosPorPais) {
            String country = carregador.getPais();
            int above150 = carregador.getNumKwAcima();
            int belowOrEqual150 = carregador.getNumKwAbaixo();
            int total = carregador.getTotal();

            if (expectedValues.containsKey(country)) {
                Integer[] expected = expectedValues.get(country);
                assertEquals(above150, expected[0]);
                assertEquals(belowOrEqual150, expected[1]);
                assertEquals(total, expected[2]);
            }
        }
    }

    @Test
    public void exercicio4_Test4_CheckCountries() {
        EX4 exercicio4 = new EX4();

        String fileName = "project-data/ex 4 test files/exercicio4_Test4.csv";

        Set<CarregadoresPais> dadosPorPais = exercicio4.getChargerPerCountryFromKW(fileName, 150);


        Map<String, Integer[]> expectedValues = new HashMap<>();
        expectedValues.put("Dominican Republic", new Integer[] { 2, 1, 3 });
        expectedValues.put("Haiti", new Integer[] { 3, 0, 3 });
        expectedValues.put("Jamaica", new Integer[] { 3, 0, 3 });
        expectedValues.put("Panama", new Integer[] { 3, 0, 3 });
        expectedValues.put("Puerto Rico", new Integer[] { 3, 0, 3 });

        for (CarregadoresPais carregador : dadosPorPais) {
            String country = carregador.getPais();
            int above150 = carregador.getNumKwAcima();
            int belowOrEqual150 = carregador.getNumKwAbaixo();
            int total = carregador.getTotal();

            if (expectedValues.containsKey(country)) {
                Integer[] expected = expectedValues.get(country);
                assertEquals(above150, expected[0]);
                assertEquals(belowOrEqual150, expected[1]);
                assertEquals(total, expected[2]);
            }
        }
    }

}