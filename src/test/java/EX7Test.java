import Classes.CarregadoresPais;
import Scanners.FileScanner;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class EX7Test {

    @Test
    void getReport1() {
        List<String[]> importedSales = FileScanner.lerCSV("project-data/ex7 test files/ex7_sales_teste1.csv");
        List<String[]> importedChargers = FileScanner.lerCSV("project-data/ex7 test files/ex7_charger_teste1.csv");
        EX7 ex7 = new EX7();
        Map<String, CarregadoresPais> expected = new TreeMap<>();
        Map<String, CarregadoresPais> result = ex7.getReport(importedSales,importedChargers,2011);
        CarregadoresPais p1 = new CarregadoresPais("Portugal");
        p1.addStalls(13);
        p1.addNumberOfVehicles(249);
        p1.setQuota(52.21);

        CarregadoresPais p2 = new CarregadoresPais("France");
        p2.addStalls(40);
        p2.addNumberOfVehicles(150);
        p2.setQuota(266.67);

        expected.put("Portugal",p1);
        assertEquals(expected.get("Portugal").getQuota(),result.get("Portugal").getQuota());
        assertEquals(expected.get("Portugal").getTotalNumOfStalls(),result.get("Portugal").getTotalNumOfStalls());
        assertEquals(expected.get("Portugal").getTotalNumOfVeichels(),result.get("Portugal").getTotalNumOfVeichels());

        expected.put("France",p2);
        assertEquals(expected.get("France").getQuota(),result.get("France").getQuota());
        assertEquals(expected.get("France").getTotalNumOfStalls(),result.get("France").getTotalNumOfStalls());
        assertEquals(expected.get("France").getTotalNumOfVeichels(),result.get("France").getTotalNumOfVeichels());


    }
    @Test
    void calculateQuota1() {
        CarregadoresPais p1 = new CarregadoresPais("Portugal");
        p1.addStalls(137);
        p1.addNumberOfVehicles(6000);
        p1.calculateQuota();
        double expected = 22.83;
        double result = p1.getQuota();
        assertEquals(expected,result);


    }

    @Test
    void calculateQuotaNoVeichelsSold() {
        CarregadoresPais p1 = new CarregadoresPais("Portugal");
        p1.addStalls(137);
        p1.addNumberOfVehicles(0);
        p1.calculateQuota();
        double expected = 0;
        double result = p1.getQuota();
        assertEquals(expected,result);

    }
    @Test
    void addStall() {
        CarregadoresPais p1 = new CarregadoresPais("Portugal");
        p1.setStalls(137);
        int expected = 147;
        p1.addStalls(10);
        int result = p1.getTotalNumOfStalls();
        assertEquals(expected,result);
    }
    @Test
    void addVeichel(){
        CarregadoresPais p1 = new CarregadoresPais("Portugal");
        p1.setTotalNumOfVeichels(1200);
        int expected = 1300;
        p1.addNumberOfVehicles(100);
        int result = p1.getTotalNumOfVeichels();
        assertEquals(expected,result);
    }
}