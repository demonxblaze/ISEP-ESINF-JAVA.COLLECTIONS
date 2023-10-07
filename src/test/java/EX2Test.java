import Scanners.FileScanner;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EX2Test {
    private EX2 ex2 = new EX2();


    @Test
    void calculateRate() {
        List<String[]> imported = FileScanner.lerCSV("project-data/ex2 test files/exercicio2_Test2.csv");
        Map<String,Double> expected = new HashMap<>();
        expected.put("Australia",-0.816);
        expected.put("Portugal",1.333);
        Map<String,Double> actual = ex2.getSalesByCountrieAndYear(imported,2011,2012);
        assertEquals(expected,actual);
    }
    @Test
    void oneContryWithouSalesFirstYear(){
        List<String[]> imported = FileScanner.lerCSV("project-data/ex2 test files/exercicio2_Test1.csv");
        Map<String,Double> expected = new HashMap<>();
        expected.put("Australia",-0.816);
        expected.put("Portugal",null);
        Map<String,Double> actual = ex2.getSalesByCountrieAndYear(imported,2011,2012);
        assertEquals(expected,actual);
    }
    @Test
    void oneContryWithouSalesLastYear(){
        List<String[]> imported = FileScanner.lerCSV("project-data/ex2 test files/exercicio2_Test3.csv");
        Map<String,Double> expected = new HashMap<>();
        expected.put("Australia",-0.816);
        expected.put("Portugal",null);
        Map<String,Double> actual = ex2.getSalesByCountrieAndYear(imported,2011,2012);
        assertEquals(expected,actual);
    }
}