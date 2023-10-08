import Classes.Charger;
import Scanners.FileScanner;
import org.junit.jupiter.api.Test;


import java.util.HashMap;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class EX5Test {

    @Test
    void exercicio5Austria() {

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 546.92;

        HashMap <String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Austria"), 0.01);
    }

    @Test
    void exercicio5Belgium() {

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 251.30;

        HashMap <String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Belgium"), 0.01);
    }
    @Test
    void exercicio5Bulgaria() {

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 132.39;

        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Bulgaria"), 0.01);
    }
    @Test

    void exercicio5Croatia() {

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 298.93;

        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Croatia"), 0.01);
    }
    @Test
    void exercicio5CzechRepublic() {

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 283.95;

        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Czech Republic"), 0.01);
    }
    @Test
    void exercicio5Denmark() {

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 310.67;

        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Denmark"), 0.01);
    }
    @Test
    void exercicio5Finland(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 921.55;

        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Finland"), 0.01);
    }
    @Test
    void exercicio5France(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 1038.47;

        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("France"), 0.01);
    }
    @Test
    void exercicio5Germany(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 815.05;

        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Germany"), 0.01);
    }
    @Test
    void exercicio5Greece(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();
        double expectedDistance = 210.14;

        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Greece"), 0.01);
    }
    @Test
    void exercicio5Hungary(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");
        EX5 ex5 = new EX5();
        double expectedDistance = 374.39;

        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Hungary"), 0.01);
    }
    @Test
    void exercicio5Iceland(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");
        EX5 ex5 = new EX5();
        double expectedDistance = 377.87;

        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Iceland"), 0.01);
    }
    @Test
    void exercicio5Ireland(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");
        EX5 ex5 = new EX5();
        double expectedDistance = 285.25;

        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Ireland"), 0.01);
    }
    @Test
    void exercicio5Italy(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");
        EX5 ex5 = new EX5();
        double expectedDistance = 1111.15;

        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Italy"), 0.01);
    }
    @Test
    void exercicio5Latvia(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");
        EX5 ex5 = new EX5();
        double expectedDistance = 198.93;

        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Latvia"), 0.01);
    }
    @Test
    void exercicio5Litcheinstein(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");
        EX5 ex5 = new EX5();
        double expectedDistance = 0.0;

        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Liechtenstein"), 0.01);
    }
    @Test
    void exercicio5Lithuania(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");
        EX5 ex5 = new EX5();
        double expectedDistance = 0.0;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Lithuania"), 0.01);
    }
    @Test
    void exercicio5Luxembourg(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");
        EX5 ex5 = new EX5();
        double expectedDistance = 0.0;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Luxembourg"), 0.01);
    }
    @Test
    void exercicio5Morroco(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");
        EX5 ex5 = new EX5();

        double expectedDistance = 677.14;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Morocco"), 0.01);
    }
    @Test
    void exercicio5Netherlands(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");
        EX5 ex5 = new EX5();

        double expectedDistance = 288.17;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Netherlands"), 0.01);
    }
    @Test
    void exercicio5Norway(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");
        EX5 ex5 = new EX5();

        double expectedDistance = 1673.65;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Norway"), 0.01);
    }
    @Test
    void exercicio5Poland(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");
        EX5 ex5 = new EX5();

        double expectedDistance = 506.22;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Poland"), 0.01);
    }
    @Test
    void exercicio5Portugal(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");
        EX5 ex5 = new EX5();

        double expectedDistance = 490.23;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Portugal"), 0.01);
    }
    @Test
    void exercicio5Romania(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 606.69;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Romania"), 0.01);
    }
    @Test
    void exercicio5Russia(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 0.0;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Russia"), 0.01);
    }
    @Test
    void exercicio5Serbia(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 160.26;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Serbia"), 0.01);
    }
    @Test
    void exercicio5Slovakia(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance  =310.93;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Slovakia"), 0.01);
    }
    @Test
    void exercicio5Slovenia(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 171.22;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Slovenia"), 0.01);
    }
    @Test
    void exercicio5Spain(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 1005.51;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Spain"), 0.01);
    }
    @Test
    void exercicio5Sweden(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();

        double expectedDistance = 1463.45;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Sweden"), 0.01);

    }
    @Test
    void exercicio5Switzerland(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();
        double expectedDistance = 288.05;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Switzerland"), 0.01);

    }
    @Test
    void exercicio5Turkey(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();
        double expectedDistance = 559.94;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("Turkey"), 0.01);
    }
    @Test
    void exercicio5UnitedKingdom(){

        List<Charger> chargers = FileScanner.getChargerList("project-data\\carregadores_europa.csv");

        EX5 ex5 = new EX5();
        double expectedDistance = 809.51;
        HashMap<String, Double> result = ex5.getMinimalAuthonomyByCountry(chargers);

        assertEquals(expectedDistance, result.get("United Kingdom"), 0.01);
    }
}