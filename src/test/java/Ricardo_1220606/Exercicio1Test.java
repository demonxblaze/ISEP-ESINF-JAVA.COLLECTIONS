package Ricardo_1220606;

import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio1Test {

    @org.junit.jupiter.api.Test
    void exercicio1() {
        Exercicio1 instance = new Exercicio1(); // Replace 'YourClass' with the name of your class that contains the exercicio1 method
        Map<String, Set<City>> map = instance.exercicio1("project-data/carregadores_europa.csv");

        for (Map.Entry<String, Set<City>> entry : map.entrySet()) {
            System.out.println("Country: " + entry.getKey());
            Set<City> cities = entry.getValue();
            for (City city : cities) {
                System.out.println("  City: " + city.getName() + ", Number of Chargers: " + city.getNumberChargers());
            }
        }
    }
}