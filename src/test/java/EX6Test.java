import Classes.Charger;
import Classes.POI;
import Scanners.FileScanner;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class EX6Test {

    @Test
    void exercicio6teste1() {

        EX6 ex6 = new EX6();

        POI[] pois = new POI[3];

        pois[0] = new POI("48.8566, 2.3522", "POI1");
        pois[1] = new POI(" 51.5074, -0.1278", "POI2");
        pois[2] = new POI("40.7128, -74.0060", "POI3");

        POI[] poisResult = pois.clone();

        List<Charger> chargers = FileScanner.getChargerList("project-data\\ex6 test files\\ex6-teste1.csv");

        Charger[] chargersList = new Charger[6];

        chargersList[0] = new Charger("Bjšrkliden, Sweden", "Sweden", "68.407105, 18.67637");
        chargersList[1] = new Charger("Nottingham - Victoria Centre", "United Kingdom", "52.957009, -1.147388");
        chargersList[2] = new Charger("Pfaffenhofen, Germany", "Germany", "48.518159, 11.562124");
        chargersList[3] = new Charger("Beaune, France", "France", "47.017089, 4.836543");
        chargersList[4] = new Charger("Aichstetten, Germany", "Germany", "47.88036, 10.040488");
        chargersList[5] = new Charger("London - North Greenwich, UK", "United Kingdom", "51.5023724, -0.0018343");


        pois[1].addCharger(chargersList[0]);
        pois[1].addCharger(chargersList[1]);
        pois[0].addCharger(chargersList[2]);
        pois[0].addCharger(chargersList[3]);
        pois[0].addCharger(chargersList[4]);
        pois[1].addCharger(chargersList[5]);


        TreeSet<POI> treeSet = new TreeSet<>(Arrays.asList(pois));

        assertEquals(treeSet, ex6.exercicio6(poisResult, chargers.toArray(new Charger[chargers.size()])));
    }

    @Test
    void exercicio6teste2() {

        POI[] pois = {};

        List<Charger> chargers = FileScanner.getChargerList("project-data\\ex6 test files\\ex6-teste1.csv");

        EX6 ex6 = new EX6();

        assertNull(ex6.exercicio6(pois, chargers.toArray(new Charger[chargers.size()])));
    }

    @Test
    void exercicio6teste3() {

        POI[] pois = new POI[3];
        pois[0] = new POI("0, 0", "POI1");
        pois[1] = new POI("41.177196, -8.597014", "POI2");
        pois[2] = new POI("6, -4", "POI3");

        Charger[] chargers = {};

        EX6 ex6 = new EX6();

        assertNull(ex6.exercicio6(pois, chargers));

    }

    @Test
    void exercicio6teste4() {

        POI[] pois = {};
        Charger[] chargers = {};

        EX6 ex6 = new EX6();

        assertNull(ex6.exercicio6(pois, chargers));

    }

    @Test
    void exercicio6teste5() {

        EX6 ex6 = new EX6();

        POI[] pois = new POI[2];

        pois[0] = new POI("48.8566, 2.3522", "POI1");
        pois[1] = new POI("40.7128, -74.0060", "POI3");

        POI[] poisResult = pois.clone();

        List<Charger> chargers = FileScanner.getChargerList("project-data\\ex6 test files\\ex6-teste1.csv");

        Charger[] chargersList = new Charger[6];

        chargersList[0] = new Charger("Bjšrkliden, Sweden", "Sweden", "68.407105, 18.67637");
        chargersList[1] = new Charger("Nottingham - Victoria Centre", "United Kingdom", "52.957009, -1.147388");
        chargersList[2] = new Charger("Pfaffenhofen, Germany", "Germany", "48.518159, 11.562124");
        chargersList[3] = new Charger("Beaune, France", "France", "47.017089, 4.836543");
        chargersList[4] = new Charger("Aichstetten, Germany", "Germany", "47.88036, 10.040488");
        chargersList[5] = new Charger("London - North Greenwich, UK", "United Kingdom", "51.5023724, -0.0018343");

        pois[0].addCharger(chargersList[0]);
        pois[0].addCharger(chargersList[1]);
        pois[0].addCharger(chargersList[2]);
        pois[0].addCharger(chargersList[3]);
        pois[0].addCharger(chargersList[4]);
        pois[0].addCharger(chargersList[5]);

        TreeSet<POI> treeSet = new TreeSet<>(Arrays.asList(pois));

        assertEquals(treeSet, ex6.exercicio6(poisResult, chargers.toArray(new Charger[chargers.size()])));

    }

    @Test
    void exercicio6teste6() {

        EX6 ex6 = new EX6();

        POI[] pois = new POI[1];

        pois[0] = new POI("48.8566, 2.3522", "POI1");


        POI[] poisResult = pois.clone();

        List<Charger> chargers = FileScanner.getChargerList("project-data\\ex6 test files\\ex6-teste1.csv");

        Charger[] chargersList = new Charger[6];

        chargersList[0] = new Charger("Bjšrkliden, Sweden", "Sweden", "68.407105, 18.67637");
        chargersList[1] = new Charger("Nottingham - Victoria Centre", "United Kingdom", "52.957009, -1.147388");
        chargersList[2] = new Charger("Pfaffenhofen, Germany", "Germany", "48.518159, 11.562124");
        chargersList[3] = new Charger("Beaune, France", "France", "47.017089, 4.836543");
        chargersList[4] = new Charger("Aichstetten, Germany", "Germany", "47.88036, 10.040488");
        chargersList[5] = new Charger("London - North Greenwich, UK", "United Kingdom", "51.5023724, -0.0018343");


        pois[0].addCharger(chargersList[0]);
        pois[0].addCharger(chargersList[1]);
        pois[0].addCharger(chargersList[2]);
        pois[0].addCharger(chargersList[3]);
        pois[0].addCharger(chargersList[4]);
        pois[0].addCharger(chargersList[5]);

        TreeSet<POI> treeSet = new TreeSet<>(Arrays.asList(pois));

        assertEquals(treeSet, ex6.exercicio6(poisResult, chargers.toArray(new Charger[chargers.size()])));

    }
}