package Lixo.example;

import Scanners.FileScanner;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String[]> a= FileScanner.lerCSV("project-data/carregadores_europa.csv");

        for (String[] s: a
             ) {

            for (String as :s
                 ) {
                System.out.print(as+" ");
            }
            System.out.println();
        }
    }
}