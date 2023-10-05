import Classes.ParAnos;

import java.util.Map;
import java.util.Set;

public class temp {

    public static void main(String[] args) {
        EX3 ex3= new EX3();

        Map<String, Set<ParAnos>> map = ex3.getSalesData("C:\\Users\\diogo\\Desktop\\isep\\cadeiras\\2ANO\\ESINF\\First Project\\first-esinf-project\\project-data\\ev_sales.csv");

        for (Map.Entry<String, Set<ParAnos>> entry: map.entrySet()) {
            System.out.printf("Set<ParAnos> %sValues = new TreeSet<>();\n",entry.getKey().toLowerCase());
            for (ParAnos anos : entry.getValue()) {
                System.out.printf("%sValues.add(new ParAnos(%d, %d, %d, %d));\n", entry.getKey().toLowerCase(),anos.getAnoAntes(),anos.getAnoDepois(),anos.getDifPHEV(),anos.getDifBEV());
            }
            System.out.printf("expectedResult.put(\"%s\", %sValues);\n",entry.getKey(),entry.getKey().toLowerCase());
            System.out.println();
            System.out.println();
        }
    }
}
