package Scanners;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScannerFicheiros {
    public static List<String[]> lerCSV(String fileName) {
        List<String[]> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                lines.add(data);
            }
        } catch (IOException e) {
            System.err.println("Ficherio em formato inválido, tente o formato CSV " + e.getMessage());
        }

        return lines;
    }

}
