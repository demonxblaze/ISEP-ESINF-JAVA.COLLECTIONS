import Classes.ResultEX8;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class EX8Test {
    EX8 teste= new EX8();

   //teste lista de estados onde no top existem estados com capacidade igual
    @Test
    void findTheTop1() {
        String fileName= "project-data/ex 8 test files/exercicio8_Test1.csv";
        Set<String> estadosAvaliados= new TreeSet<>();
        estadosAvaliados.add("Beja");
        estadosAvaliados.add("Aveiro");
        estadosAvaliados.add("Porto");

        Set<String> estadosResultado= new TreeSet<>();
        estadosResultado.add("Beja");
        estadosResultado.add("Aveiro");
        int n = 2;
        Set<String> cities = new TreeSet<>();
        cities.add("Grandola");
        cities.add("Aveiro");
        cities.add("Figueira da Foz");
        cities.add("Gafanhas");
        int totalPower = 30000;

        ResultEX8 expectedResult = new ResultEX8(cities,estadosResultado, totalPower);

        ResultEX8 result = teste.findTheTop(fileName,n,estadosAvaliados);

        assertEquals(expectedResult,result);

    }
    //teste lista de estados onde os dois estados com mais capacidade partilham o mesmo valor, mas apenas queremos o retorno de um
    //sendo que nesta situação, é devolvido o ultimo deles que aparecer no ficheiro de entrada
    @Test
    void findTheTop2() {
        String fileName= "project-data/ex 8 test files/exercicio8_Test1.csv";
        Set<String> estadosAvaliados= new TreeSet<>();
        estadosAvaliados.add("Beja");
        estadosAvaliados.add("Aveiro");
        estadosAvaliados.add("Porto");

        Set<String> estadosResultado= new TreeSet<>();
        estadosResultado.add("Beja");
        int n = 1;
        Set<String> cities = new TreeSet<>();
        cities.add("Grandola");
        int totalPower = 15000;

        ResultEX8 expectedResult = new ResultEX8(cities,estadosResultado, totalPower);

        ResultEX8 result = teste.findTheTop(fileName,n,estadosAvaliados);

        assertEquals(expectedResult,result);

    }

    //o numero de estados pedidos para o top ser maior do que os existentes
    @Test
    void findTheTop3() {
        String fileName= "project-data/ex 8 test files/exercicio8_Test1.csv";
        Set<String> estadosAvaliados= new TreeSet<>();
        estadosAvaliados.add("Beja");
        estadosAvaliados.add("Aveiro");
        estadosAvaliados.add("Porto");
        estadosAvaliados.add("Braga");

        Set<String> estadosResultado= new TreeSet<>();
        estadosResultado.add("Beja");
        estadosResultado.add("Aveiro");
        estadosResultado.add("Porto");
        estadosResultado.add("Braga");
        int n = 5;
        Set<String> cities = new TreeSet<>();
        cities.add("Paços Ferreira");
        cities.add("Celorico");
        cities.add("Famalicao");
        cities.add("Vizela");
        cities.add("Guimarães");
        cities.add("Porto");
        cities.add("Santo Tirso");
        cities.add("Trofa");
        cities.add("Aveiro");
        cities.add("Figueira da Foz");
        cities.add("Gafanhas");
        cities.add("Grandola");
        int totalPower = 38000;

        ResultEX8 expectedResult = new ResultEX8(cities,estadosResultado, totalPower);

        ResultEX8 result = teste.findTheTop(fileName,n,estadosAvaliados);

        assertEquals(expectedResult,result);

    }
    // apenas entram para a equação os postos com o status a "Open"
    @Test
    void findTheTop4() {
        String fileName= "project-data/ex 8 test files/exercicio8_Test2.csv";
        Set<String> estadosAvaliados= new TreeSet<>();
        estadosAvaliados.add("Beja");
        estadosAvaliados.add("Aveiro");
        estadosAvaliados.add("Porto");
        estadosAvaliados.add("Braga");

        Set<String> estadosResultado= new TreeSet<>();
        estadosResultado.add("Beja");
        estadosResultado.add("Aveiro");
        estadosResultado.add("Porto");
        estadosResultado.add("Braga");
        int n = 5;
        Set<String> cities = new TreeSet<>();
        cities.add("Paços Ferreira");
        cities.add("Celorico");
        cities.add("Famalicao");
        cities.add("Vizela");
        cities.add("Porto");
        cities.add("Santo Tirso");
        cities.add("Aveiro");
        cities.add("Figueira da Foz");
        cities.add("Grandola");
        int totalPower = 31000;

        ResultEX8 expectedResult = new ResultEX8(cities,estadosResultado, totalPower);

        ResultEX8 result = teste.findTheTop(fileName,n,estadosAvaliados);

        assertEquals(expectedResult,result);

    }
    //teste lista de países onde os dois estados com mais capacidade partilham o mesmo valor, mas apenas queremos o retorno de um
    //sendo que nesta situação, é devolvido o ultimo deles que aparecer no ficheiro de entrada
    @Test
    void findTheTop5() {
        String fileName= "project-data/ex 8 test files/exercicio8_Test3.csv";
        Set<String> paisesAvaliados= new TreeSet<>();
        paisesAvaliados.add("Portugal");
        paisesAvaliados.add("Espanha");

        Set<String> estadosResultado= new TreeSet<>();
        estadosResultado.add("Madrid");
        estadosResultado.add("Porto");
        int n = 2;
        Set<String> cities = new TreeSet<>();
        cities.add("Madrid");
        cities.add("Porto");
        int totalPower = 20000;

        ResultEX8 expectedResult = new ResultEX8(cities,estadosResultado, totalPower);

        ResultEX8 result = teste.findTheTop(fileName,n,paisesAvaliados);

        assertEquals(expectedResult,result);

    }
    //teste lista de paises onde os dois estados com mais capacidade partilham o mesmo valor, mas apenas queremos o retorno de um
    //sendo que nesta situação, é devolvido o ultimo deles que aparecer no ficheiro de entrada
    @Test
    void findTheTop6() {
        String fileName= "project-data/ex 8 test files/exercicio8_Test3.csv";
        Set<String> paisesAvaliados= new TreeSet<>();
        paisesAvaliados.add("Portugal");
        paisesAvaliados.add("Espanha");

        Set<String> estadosResultado= new TreeSet<>();
        estadosResultado.add("Madrid");
        int n = 1;
        Set<String> cities = new TreeSet<>();
        cities.add("Madrid");
        int totalPower = 10000;

        ResultEX8 expectedResult = new ResultEX8(cities,estadosResultado, totalPower);

        ResultEX8 result = teste.findTheTop(fileName,n,paisesAvaliados);

        assertEquals(expectedResult,result);

    }
    //o numero de estados pedidos para o top ser maior do que os existentes
    @Test
    void findTheTop7() {
        String fileName= "project-data/ex 8 test files/exercicio8_Test3.csv";
        Set<String> paisesAvaliados= new TreeSet<>();
        paisesAvaliados.add("Portugal");
        paisesAvaliados.add("Espanha");

        Set<String> estadosResultado= new TreeSet<>();
        estadosResultado.add("Lisbon");
        estadosResultado.add("Porto");
        estadosResultado.add("Algarve");
        estadosResultado.add("Coimbra");
        estadosResultado.add("Valencia");
        estadosResultado.add("Madrid");
        estadosResultado.add("Catalonia");
        estadosResultado.add("Braga");
        estadosResultado.add("Andalusia");
        int n = 10;
        Set<String> cities = new TreeSet<>();
        cities.add("Lisbon");
        cities.add("Porto");
        cities.add("Faro");
        cities.add("Coimbra");
        cities.add("Alicante");
        cities.add("Madrid");
        cities.add("Barcelona");
        cities.add("Valencia");
        cities.add("Braga");
        cities.add("Seville");
        int totalPower = 52000;

        ResultEX8 expectedResult = new ResultEX8(cities,estadosResultado, totalPower);

        ResultEX8 result = teste.findTheTop(fileName,n,paisesAvaliados);

        assertEquals(expectedResult,result);

    }
    // apenas entram para a equação os postos com o status a "Open"
    @Test
    void findTheTop8() {
        String fileName= "project-data/ex 8 test files/exercicio8_Test4.csv";
        Set<String> paisesAvaliados= new TreeSet<>();
        paisesAvaliados.add("Portugal");
        paisesAvaliados.add("Espanha");

        Set<String> estadosResultado= new TreeSet<>();
        estadosResultado.add("Lisbon");
        estadosResultado.add("Porto");
        estadosResultado.add("Algarve");
        estadosResultado.add("Valencia");
        estadosResultado.add("Catalonia");
        estadosResultado.add("Braga");
        estadosResultado.add("Andalusia");
        int n = 10;
        Set<String> cities = new TreeSet<>();
        cities.add("Lisbon");
        cities.add("Porto");
        cities.add("Faro");
        cities.add("Barcelona");
        cities.add("Valencia");
        cities.add("Braga");
        cities.add("Seville");
        int totalPower = 36000;

        ResultEX8 expectedResult = new ResultEX8(cities,estadosResultado, totalPower);

        ResultEX8 result = teste.findTheTop(fileName,n,paisesAvaliados);

        assertEquals(expectedResult,result);

    }
    //Com o ficheiro do professor mas apenas mudamos o valor de um Supercharger para saber o resultado
    @Test
    void findTheTop9() {
        String fileName= "project-data/ex 8 test files/carregadores_europa.csv";
        Set<String> paisesAvaliados= new TreeSet<>();
        paisesAvaliados.add("Sweden");

        Set<String> estadosResultado= new TreeSet<>();
        estadosResultado.add("TESTE1");
        int n = 1;
        Set<String> cities = new TreeSet<>();
        cities.add("Bj�rkliden");
        int totalPower = 3*99999999;

        ResultEX8 expectedResult = new ResultEX8(cities,estadosResultado, totalPower);

        ResultEX8 result = teste.findTheTop(fileName,n,paisesAvaliados);

        assertEquals(expectedResult,result);

    }
}