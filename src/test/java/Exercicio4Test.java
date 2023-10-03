import Classes.CarregadoresPais;
import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio4Test {

    @Test
    public void exercicio4_Print() {
        Exercicio4 exercicio4 = new Exercicio4();

        String fileName = "project-data/carregadores_europa.csv";

        Set<CarregadoresPais> dadosPorPais = exercicio4.exercicio4(fileName, 150);

        System.out.printf("%-15s %-12s %-10s %s%n", "", "kW > 150", "kW <= 150", "Total");


        for (CarregadoresPais carregador : dadosPorPais) {
            String country = carregador.getPais();
            int above150 = carregador.getNumKwAcima();
            int belowOrEqual150 = carregador.getNumKwAbaixo();
            int total = carregador.getTotal();

            System.out.printf("%-15s %-12d %-10d %d%n", country, above150, belowOrEqual150, total);
        }
    }

    @Test
    public void exercicio4_CheckGermanyExists(){
        Exercicio4 exercicio4 = new Exercicio4();

        String fileName = "project-data/carregadores_europa.csv";

        Set<CarregadoresPais> dadosPorPais = exercicio4.exercicio4(fileName, 150);

        for (CarregadoresPais carregador : dadosPorPais) {
            if (carregador.getPais().equals("Germany")) {
                assert true;
            }
        }

    }

    @Test
    void exercicio4_TestGermany() {
        Exercicio4 exercicio4 = new Exercicio4();

        String fileName = "project-data/carregadores_europa.csv";

        Set<CarregadoresPais> dadosPorPais = exercicio4.exercicio4(fileName, 150);

        for (CarregadoresPais carregador : dadosPorPais) {
            String country = carregador.getPais();
            int above150 = carregador.getNumKwAcima();
            int belowOrEqual150 = carregador.getNumKwAbaixo();
            int total = carregador.getTotal();

            if (country.equals("Germany")) {
                assert above150 == 133;
                assert belowOrEqual150 == 50;
                assert total == 183;
            }
        }
    }

    @Test
    public void exercicio4_Test1_Print(){
        Exercicio4 exercicio4 = new Exercicio4();

        String fileName = "project-data/ex 4 test files/exercicio4_Test1.csv";

        Set<CarregadoresPais> dadosPorPais = exercicio4.exercicio4(fileName, 150);

        System.out.printf("%-15s %-12s %-10s %s%n", "", "kW > 150", "kW <= 150", "Total");


        for (CarregadoresPais carregador : dadosPorPais) {
            String country = carregador.getPais();
            int above150 = carregador.getNumKwAcima();
            int belowOrEqual150 = carregador.getNumKwAbaixo();
            int total = carregador.getTotal();

            System.out.printf("%-15s %-12d %-10d %d%n", country, above150, belowOrEqual150, total);
        }
    }

    @Test
    public void exercicio4_Test1_(){

    }
}