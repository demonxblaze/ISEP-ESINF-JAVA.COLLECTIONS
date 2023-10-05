import Classes.Charger;
import Classes.POI;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class EX6Test {

    @Test
    void exercicio6() {

        POI [] pois = new POI[3];
        pois[0] = new POI("0, 0", "POI1");
        pois[1] = new POI("41.177196, -8.597014", "POI2");
        pois[2] = new POI("6, -4", "POI3");

        Charger [] chargers = new Charger[6];

        chargers[0] = new Charger("bababoey", "Charger1", "0, 1");
        chargers[1] = new Charger("bruh", "Charger2", "1, 0");
        chargers[2] = new Charger("nome3", "Charger3", "6, 0");
        chargers[3] = new Charger("nome4", "Charger4", "0, -4");
        chargers[4] = new Charger("nome5", "Charger5", "42, -4");
        chargers[5] = new Charger("nome6", "Charger6", "41, -8");

        TreeSet<POI> treeSet = new TreeSet<>();

        pois[0].addCharger(chargers[0]);
        pois[0].addCharger(chargers[1]);
        pois[0].addCharger(chargers[3]);
        pois[1].addCharger(chargers[5]);
        pois[2].addCharger(chargers[2]);
        pois[1].addCharger(chargers[4]);

        treeSet.add(pois[0]);
        treeSet.add(pois[1]);
        treeSet.add(pois[2]);

        EX6 ex6 = new EX6();
        assertEquals(treeSet, ex6.exercicio6(pois, chargers));



    }
}