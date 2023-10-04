import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class temp {

    public static void main(String[] args) {
        String filename = "C:\\Users\\diogo\\Desktop\\isep\\cadeiras\\2ANO\\ESINF\\First Project\\first-esinf-project\\project-data\\ex 8 test files\\exercicio8_Test1.csv";
        int n = 1;
        Set<String> estados = new HashSet<>();
        estados.add("Porto");
        estados.add("Braga");
        estados.add("Aveiro");
        Map<Set<String>, Map<Integer, Set<String>>> c =  EX8.findTheTop(filename, n, estados);

        for (Map.Entry<Set<String>, Map<Integer, Set<String>>> i: c.entrySet()) {
            for (String s: i.getKey() ) {
                System.out.println(s);
            }
            for (Map.Entry<Integer, Set<String>> j : i.getValue().entrySet()) {
                System.out.println(j.getKey());
                for (String st: j.getValue()) {
                    System.out.print(st+", ");
                }
            }
        }

    }
}