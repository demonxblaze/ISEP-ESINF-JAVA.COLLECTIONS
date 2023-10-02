package Ricardo_1220606;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio1Test {

    @Test
    public void testExercicio1WithNonexistentFile() {
        Exercicio1 exercicio1 = new Exercicio1();
        String fileName = "nonexistent.csv";
        Map<String, Set<City>> result = exercicio1.exercicio1(fileName);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testExercicio1WithEmptyFile() {
        Exercicio1 exercicio1 = new Exercicio1();
        String fileName = "src/main/java/Ricardo_1220606/empty.csv";
        Map<String, Set<City>> result = exercicio1.exercicio1(fileName);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void exercicio1() {
        Exercicio1 instance = new Exercicio1(); // Replace 'YourClass' with the name of your class that contains the exercicio1 method
        Map<String, Set<City>> map = instance.exercicio1("src/main/java/Ricardo_1220606/exercicio1_Test3.csv");

        for (Map.Entry<String, Set<City>> entry : map.entrySet()) {
            System.out.println("Country: " + entry.getKey());
            Set<City> cities = entry.getValue();
            for (City city : cities) {
                System.out.println("  City: " + city.getName() + ", Number of Chargers: " + city.getNumberChargers());
            }
        }
    }

    @org.junit.jupiter.api.Test
    public void exercicio1_Ficheiro1_Test1() {
        Exercicio1 exercicio1 = new Exercicio1();

        String fileName = "src/main/java/Ricardo_1220606/exercicio1_Test1.csv";

        Map<String, Set<City>> result = exercicio1.exercicio1(fileName);


        assertNotNull(result);
        assertEquals(11, result.size());

    }

    @Test
    public void exercicio1_Ficheiro1_Test2() {
        Exercicio1 exercicio1 = new Exercicio1();

        String fileName = "src/main/java/Ricardo_1220606/exercicio1_Test1.csv";

        Map<String, Set<City>> result = exercicio1.exercicio1(fileName);


        Set<City> cities = result.get("Spain");
        City madrid = null;
        for (City city : cities) {
            if (city.getName().equals("Madrid")) {
                madrid = city;
            }
        }
        assertNotNull(madrid);
        assertEquals(6, madrid.getNumberChargers());

    }

    @Test
    public void exercicio1_Ficheiro1_Test3() {
        Exercicio1 exercicio1 = new Exercicio1();

        String fileName = "src/main/java/Ricardo_1220606/exercicio1_Test1.csv";

        Map<String, Set<City>> result = exercicio1.exercicio1(fileName);


        Set<City> cities = result.get("Mexico");
        City mexicoCity = null;
        for (City city : cities) {
            if (city.getName().equals("Mexico City")) {
                mexicoCity = city;
            }
        }
        assertNotNull(mexicoCity);
        assertEquals(6, mexicoCity.getNumberChargers());

    }

    @org.junit.jupiter.api.Test
    public void exercicio1_Ficheiro2_Test1() {
        Exercicio1 exercicio1 = new Exercicio1();

        String fileName = "src/main/java/Ricardo_1220606/exercicio1_Test2.csv";

        Map<String, Set<City>> result = exercicio1.exercicio1(fileName);


        assertNotNull(result);
        assertEquals(13, result.size());

    }

    @Test
    public void exercicio1_Ficheiro2_Test2() {
        Exercicio1 exercicio1 = new Exercicio1();

        String fileName = "src/main/java/Ricardo_1220606/exercicio1_Test2.csv";

        Map<String, Set<City>> result = exercicio1.exercicio1(fileName);


        Set<City> cities = result.get("Japan");
        City tokyo = null;
        for (City city : cities) {
            if (city.getName().equals("Tokyo")) {
                tokyo = city;
            }
        }
        assertNotNull(tokyo);
        assertEquals(4, tokyo.getNumberChargers());

    }

    @Test
    public void exercicio1_Ficheiro2_Test3() {
        Exercicio1 exercicio1 = new Exercicio1();

        String fileName = "src/main/java/Ricardo_1220606/exercicio1_Test2.csv";

        Map<String, Set<City>> result = exercicio1.exercicio1(fileName);


        Set<City> cities = result.get("Germany");
        City berlin = null;
        for (City city : cities) {
            if (city.getName().equals("Berlin")) {
                berlin = city;
            }
        }
        assertNotNull(berlin);
        assertEquals(4, berlin.getNumberChargers());

    }

    @org.junit.jupiter.api.Test
    public void exercicio1_Ficheiro3_Test1() {
        Exercicio1 exercicio1 = new Exercicio1();

        String fileName = "src/main/java/Ricardo_1220606/exercicio1_Test3.csv";

        Map<String, Set<City>> result = exercicio1.exercicio1(fileName);


        assertNotNull(result);
        assertEquals(15, result.size());

    }

    @Test
    public void exercicio1_Ficheiro3_Test2() {
        Exercicio1 exercicio1 = new Exercicio1();

        String fileName = "src/main/java/Ricardo_1220606/exercicio1_Test3.csv";

        Map<String, Set<City>> result = exercicio1.exercicio1(fileName);


        Set<City> cities = result.get("South Korea");
        City seoul = null;
        for (City city : cities) {
            if (city.getName().equals("Seoul")) {
                seoul = city;
            }
        }
        assertNotNull(seoul);
        assertEquals(3, seoul.getNumberChargers());

    }

    @Test
    public void exercicio1_Ficheiro3_Test3() {
        Exercicio1 exercicio1 = new Exercicio1();

        String fileName = "src/main/java/Ricardo_1220606/exercicio1_Test3.csv";

        Map<String, Set<City>> result = exercicio1.exercicio1(fileName);


        Set<City> cities = result.get("Italy");
        City rome = null;
        for (City city : cities) {
            if (city.getName().equals("Rome")) {
                rome = city;
            }
        }
        assertNotNull(rome);
        assertEquals(3, rome.getNumberChargers());

    }

    @org.junit.jupiter.api.Test
    public void exercicio1_Ficheiro4_Test1() {
        Exercicio1 exercicio1 = new Exercicio1();

        String fileName = "src/main/java/Ricardo_1220606/exercicio1_Test4.csv";

        Map<String, Set<City>> result = exercicio1.exercicio1(fileName);


        assertNotNull(result);
        assertEquals(12, result.size());

    }

    @Test
    public void exercicio1_Ficheiro4_Test2() {
        Exercicio1 exercicio1 = new Exercicio1();

        String fileName = "src/main/java/Ricardo_1220606/exercicio1_Test4.csv";

        Map<String, Set<City>> result = exercicio1.exercicio1(fileName);


        Set<City> cities = result.get("Canada");
        City toronto = null;
        for (City city : cities) {
            if (city.getName().equals("Toronto")) {
                toronto = city;
            }
        }
        assertNotNull(toronto);
        assertEquals(8, toronto.getNumberChargers());

    }

}