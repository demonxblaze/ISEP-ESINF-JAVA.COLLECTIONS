package Scanners;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Interface que permite ler ficheiros CSV
 */
public interface FileScanner {

    /**
     * Método que lê um ficheiro CSV e retorna uma lista de arrays de Strings
     * @param fileName nome do ficheiro CSV
     * @return lista de arrays de Strings
     */
    static List<String[]> lerCSV(String fileName) {

        // Lista de arrays de Strings
        List<String[]> lines = new ArrayList<>();


        // Tenta ler o ficheiro CSV
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            line = br.readLine();
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    String[] data = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                    lines.add(data);
                }
            }
        } catch (IOException e) { // Caso não consiga ler o ficheiro
            System.err.println("Ficherio em formato inválido, tente o formato CSV " + e.getMessage());
        }

        return lines;
    }

    static List<String[]> coutryCityList(String fileName) {

        List<String[]> lines = lerCSV(fileName);

        List<String[]> countryCityList = new ArrayList<>();

        for (String[] s : lines) {
            String country = s[5];
            String city = s[2];

            String[] countryCity = new String[2];
            countryCity[0] = country;
            countryCity[1] = city;

            countryCityList.add(countryCity);
        }

        return countryCityList;
    }

    static List<String[]> coutryKwList(String fileName) {

        List<String[]> lines = lerCSV(fileName);

        List<String[]> countryCityList = new ArrayList<>();

        for (String[] s : lines) {
            String country = s[5];
            String kw = s[7];

            String[] countryKw = new String[2];
            countryKw[0] = country;
            countryKw[1] = kw;

            countryCityList.add(countryKw);
        }

        return countryCityList;
    }
}
