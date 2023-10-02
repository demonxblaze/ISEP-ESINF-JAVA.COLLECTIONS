package DIOGO_1220941.EX8;

import java.util.HashSet;
import java.util.Set;

public class temp {

    public static void main(String[] args) {
        String filename = "exercicio8_Test1.csv";
        int n = 1;
        Set<String> estados = new HashSet<>();
        estados.add("Porto");
        estados.add("Braga");
        estados.add("Aveiro");
        Object[] result =  EX8.findTheTop(filename, n, estados);

        for (String a: ((Set<String>) result[0])) {
            System.out.println(a);
        }
        System.out.println("///////////////////////////////////////");
        System.out.println(((int) result[1]));
        System.out.println("///////////////////////////////////////");
        for (String a: ((Set<String>) result[2])) {
            System.out.println(a);
        }

    }
}