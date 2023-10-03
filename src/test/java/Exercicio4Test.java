import Classes.CarregadoresPais;
import org.junit.jupiter.api.Test;

import java.util.Set;

class Exercicio4Test {

    @Test
    void exercicio4() {
        Exercicio4 exercicio4 = new Exercicio4();

        String fileName = "project-data/carregadores_europa.csv";

        Set<CarregadoresPais> dadosPorPais = exercicio4.exercicio4(fileName);

        System.out.printf("%-15s %-12s %-10s %s%n", "", "kW > 150", "kW <= 150", "Total");


        for (CarregadoresPais carregador : dadosPorPais) {
            String country = carregador.getPais();
            int above150 = carregador.getNumKwAcima();
            int belowOrEqual150 = carregador.getNumKwAbaixo();
            int total = carregador.getTotal();

            System.out.printf("%-15s %-12d %-10d %d%n", country, above150, belowOrEqual150, total);
        }
    }
}