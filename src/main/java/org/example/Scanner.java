package org.example;


import Singleton.Repository;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Scanner {
    private String filePath;

    public Scanner(String filePath) {

        this.filePath = filePath;
    }

    public static void readCSVFileSales(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] lineS = line.split(",");


                    SalesData s = new SalesData(Integer.parseInt(lineS[1]), Integer.parseInt(lineS[2]), lineS[3]);


            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

}

