package Scanners;

import Classes.Charger;

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

    static List<Charger> getChargerList(String filename){

        List<String[]> lines = lerCSV(filename);

        List<Charger> chargerList = new ArrayList<>();

        for (String[] s : lines) {

            String country = s[5];
            String charger = s[3];
            String gps = s[8];

            chargerList.add(new Charger(charger, country,gps));
        }


        return chargerList;
    }

    static List<Charger> getCountryChargerList(String filename, String country) {

        List<String[]> lines = lerCSV(filename);

        List<Charger> chargerList = new ArrayList<>();

        for (String[] s : lines) {
            String country1 = s[5];
            String charger = s[3];
            String gps = s[8];

            if (country1.equalsIgnoreCase(country)) {
                chargerList.add(new Charger(charger, country, gps));
            }
        }

        return chargerList;
    }

    static List<String[]> coutryStateCityPower(String fileName) {

        List<String[]> lines = lerCSV(fileName);

        List<String[]> countryCityList = new ArrayList<>();

        for (String[] s : lines) {
            String city = s[2];
            String state = s[3];
            String country = s[5];
            String stalls = s[6];
            String kw = s[7];
            String status = s[10];

            String[] charger = new String[6];
            charger[0] = city;
            charger[1] = state;
            charger[2] = country;
            charger[3] = stalls;
            charger[4] = kw;
            charger[5] = status;

            countryCityList.add(charger);
        }

        return countryCityList;
    }
}


