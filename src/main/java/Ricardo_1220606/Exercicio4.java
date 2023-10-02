package Ricardo_1220606;

import Scanners.FileScanner;

import java.util.*;

public class Exercicio4 {

    public Set<CarregadoresPais> exercicio4(String fileName) {
        Map<String, CarregadoresPais> countryMap = new HashMap<>();
        List<String[]> lines = FileScanner.coutryKwList(fileName);

        for (String[] line : lines) {
            String country = line[0];
            int kW = Integer.parseInt(line[1]);

            CarregadoresPais carregadoresPais = countryMap.get(country);

            if (carregadoresPais == null) {
                carregadoresPais = new CarregadoresPais(country);
                countryMap.put(country, carregadoresPais);
            }

            if (kW > 150) {
                carregadoresPais.addAcima();
            } else {
                carregadoresPais.addAbaixo();
            }
        }

        // Create a TreeSet with your TotalComparator
        Set<CarregadoresPais> dadosPorPais = new TreeSet<>(new TotalComparator());

        // Add the CarregadoresPais objects to the TreeSet
        dadosPorPais.addAll(countryMap.values());

        return dadosPorPais;
    }

//    public Set<CarregadoresPais> exercicio4(String fileName){
//        Set<CarregadoresPais> dadosPorPais = new TreeSet<>(new TotalComparator());
//
//        List<String[]> lines = FileScanner.coutryKwList(fileName);
//
//        for (String[] line: lines) {
//            String country = line[0];
//            int kW = Integer.parseInt(line[1]);
//
//            if (dadosPorPais.contains(new CarregadoresPais(country))) {
//                for (CarregadoresPais c : dadosPorPais) {
//                    if (c.equals(new CarregadoresPais(country))) {
//                        if (kW > 150) {
//                            c.addAcima();
//                        } else {
//                            c.addAbaixo();
//                        }
//                    }
//                }
//            } else {
//                CarregadoresPais c = new CarregadoresPais(country);
//                if (kW > 150) {
//                    c.addAcima();
//                } else {
//                    c.addAbaixo();
//                }
//                dadosPorPais.add(c);
//            }
//        }
//
//        return dadosPorPais;
//    }
}




