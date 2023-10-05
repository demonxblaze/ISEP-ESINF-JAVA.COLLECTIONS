import Classes.ParAnos;
import Classes.Powertrain;
import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EX3Test {
    EX3 teste = new EX3();

    //teste para um input de apenas um pais com alguns dados de pares anuais de venda
    @Test
    void getSalesData1() {
        String filename = "C:\\Users\\diogo\\Desktop\\isep\\cadeiras\\2ANO\\ESINF\\First Project\\first-esinf-project\\project-data\\ex 3 test files\\exercicio3_Test1.csv";
        Map<String, Set<ParAnos>> expectedResult = new HashMap<>();
        String key = "Australia";
        Set<ParAnos> values = new TreeSet<>();
        values.add(new ParAnos(2011, 2012, 8, -48));
        values.add(new ParAnos(2013, 2014, -5, -153));

        expectedResult.put(key, values);

        Map<String, Set<ParAnos>> result = teste.getSalesData(filename);

        assertEquals(result, expectedResult);
    }

    //teste para um input de varios paises com alguns dados de pares anuais de venda
    @Test
    void getSalesData2() {
        String filename = "C:\\Users\\diogo\\Desktop\\isep\\cadeiras\\2ANO\\ESINF\\First Project\\first-esinf-project\\project-data\\ex 3 test files\\exercicio3_Test2.csv";
        Map<String, Set<ParAnos>> expectedResult = new HashMap<>();
        String key = "Australia";
        Set<ParAnos> values = new TreeSet<>();
        values.add(new ParAnos(2011, 2012, 8, -48));
        values.add(new ParAnos(2013, 2014, -5, -153));
        expectedResult.put(key, values);

        String key1 = "Espanha";
        Set<ParAnos> values1 = new TreeSet<>();
        values1.add(new ParAnos(2011, 2012, 8, -48));
        values1.add(new ParAnos(2013, 2014, -5, -153));
        expectedResult.put(key1, values1);

        String key2 = "Portugal";
        Set<ParAnos> values2 = new TreeSet<>();
        values2.add(new ParAnos(2011, 2012, 8, -48));
        values2.add(new ParAnos(2013, 2014, -5, -153));
        expectedResult.put(key2, values2);


        Map<String, Set<ParAnos>> result = teste.getSalesData(filename);

        assertEquals(result, expectedResult);
    }

    //teste para um input de apenas um pais sem dados de pares anuais de venda
    @Test
    void getSalesData3() {
        String filename = "C:\\Users\\diogo\\Desktop\\isep\\cadeiras\\2ANO\\ESINF\\First Project\\first-esinf-project\\project-data\\ex 3 test files\\exercicio3_Test3.csv";
        Map<String, Set<ParAnos>> expectedResult = new HashMap<>();


        Map<String, Set<ParAnos>> result = teste.getSalesData(filename);


        assertEquals(result, expectedResult);
    }

    //teste para um input de varios paises com dados de pares anuais de venda e alguns sem
    @Test
    void getSalesData4() {
        String filename = "C:\\Users\\diogo\\Desktop\\isep\\cadeiras\\2ANO\\ESINF\\First Project\\first-esinf-project\\project-data\\ex 3 test files\\exercicio3_Test4.csv";
        Map<String, Set<ParAnos>> expectedResult = new HashMap<>();
        String key = "França";
        Set<ParAnos> values = new TreeSet<>();
        values.add(new ParAnos(2011, 2012, 8, -48));
        values.add(new ParAnos(2013, 2014, -5, -153));
        expectedResult.put(key, values);

        String key1 = "Portugal";
        Set<ParAnos> values1 = new TreeSet<>();
        values1.add(new ParAnos(2011, 2012, 8, -48));
        values1.add(new ParAnos(2013, 2014, -5, -153));
        expectedResult.put(key1, values1);


        Map<String, Set<ParAnos>> result = teste.getSalesData(filename);

        assertEquals(result, expectedResult);
    }

    //feito com ficheiro do professor ev_sales.csv
    @Test
    void getSalesData5() {
        String filename = "C:\\Users\\diogo\\Desktop\\isep\\cadeiras\\2ANO\\ESINF\\First Project\\first-esinf-project\\project-data\\ev_sales.csv";
        Map<String, Set<ParAnos>> expectedResult = new HashMap<>();

        Set<ParAnos> australiaValues = new TreeSet<>();
        australiaValues.add(new ParAnos(2015, 2016, -300, -90));
        australiaValues.add(new ParAnos(2019, 2020, -1200, -1100));
        expectedResult.put("Australia", australiaValues);


        Set<ParAnos> austriaValues = new TreeSet<>();
        austriaValues.add(new ParAnos(2021, 2022, -2000, 1000));
        expectedResult.put("Austria", austriaValues);


        Set<ParAnos> belgiumValues = new TreeSet<>();
        belgiumValues.add(new ParAnos(2012, 2013, -280, -70));
        belgiumValues.add(new ParAnos(2017, 2018, -2400, 900));
        expectedResult.put("Belgium", belgiumValues);


        Set<ParAnos> brazilValues = new TreeSet<>();
        brazilValues.add(new ParAnos(2013, 2014, -33, -69));
        brazilValues.add(new ParAnos(2017, 2018, -60, 41));
        expectedResult.put("Brazil", brazilValues);


        Set<ParAnos> chileValues = new TreeSet<>();
        chileValues.add(new ParAnos(2011, 2012, 0, -1));
        chileValues.add(new ParAnos(2015, 2016, -14, 9));
        chileValues.add(new ParAnos(2019, 2020, -61, -50));
        expectedResult.put("Chile", chileValues);


        Set<ParAnos> chinaValues = new TreeSet<>();
        chinaValues.add(new ParAnos(2018, 2019, -40000, 10000));
        expectedResult.put("China", chinaValues);


        Set<ParAnos> denmarkValues = new TreeSet<>();
        denmarkValues.add(new ParAnos(2015, 2016, 150, -3000));
        denmarkValues.add(new ParAnos(2016, 2017, 50, -590));
        denmarkValues.add(new ParAnos(2021, 2022, -14000, 6000));
        expectedResult.put("Denmark", denmarkValues);


        Set<ParAnos> eu27Values = new TreeSet<>();
        eu27Values.add(new ParAnos(2015, 2016, -5000, 4000));
        expectedResult.put("EU27", eu27Values);


        Set<ParAnos> icelandValues = new TreeSet<>();
        icelandValues.add(new ParAnos(2018, 2019, -1200, 130));
        expectedResult.put("Iceland", icelandValues);


        Set<ParAnos> indiaValues = new TreeSet<>();
        indiaValues.add(new ParAnos(2011, 2012, 0, -1210));
        indiaValues.add(new ParAnos(2014, 2015, 0, -550));
        indiaValues.add(new ParAnos(2018, 2019, 7, -240));
        expectedResult.put("India", indiaValues);


        Set<ParAnos> israelValues = new TreeSet<>();
        israelValues.add(new ParAnos(2012, 2013, 16, -140));
        israelValues.add(new ParAnos(2013, 2014, 35, -454));
        expectedResult.put("Israel", israelValues);


        Set<ParAnos> italyValues = new TreeSet<>();
        italyValues.add(new ParAnos(2021, 2022, -6000, -18000));
        expectedResult.put("Italy", italyValues);


        Set<ParAnos> japanValues = new TreeSet<>();
        japanValues.add(new ParAnos(2014, 2015, -2000, -6000));
        japanValues.add(new ParAnos(2017, 2018, -13000, 9000));
        japanValues.add(new ParAnos(2018, 2019, -5000, -6000));
        japanValues.add(new ParAnos(2019, 2020, -3000, -6000));
        expectedResult.put("Japan", japanValues);


        Set<ParAnos> koreaValues = new TreeSet<>();
        koreaValues.add(new ParAnos(2018, 2019, -1700, -22000));
        expectedResult.put("Korea", koreaValues);


        Set<ParAnos> mexicoValues = new TreeSet<>();
        mexicoValues.add(new ParAnos(2012, 2013, 0, -76));
        mexicoValues.add(new ParAnos(2018, 2019, -200, 90));
        expectedResult.put("Mexico", mexicoValues);


        Set<ParAnos> netherlandsValues = new TreeSet<>();
        netherlandsValues.add(new ParAnos(2013, 2014, -8000, 100));
        netherlandsValues.add(new ParAnos(2015, 2016, -22000, 300));
        netherlandsValues.add(new ParAnos(2016, 2017, -17900, 5100));
        expectedResult.put("Netherlands", netherlandsValues);


        Set<ParAnos> newzealandValues = new TreeSet<>();
        newzealandValues.add(new ParAnos(2019, 2020, -100, -1400));
        expectedResult.put("New Zealand", newzealandValues);


        Set<ParAnos> othereuropeValues = new TreeSet<>();
        othereuropeValues.add(new ParAnos(2012, 2013, -4, -530));
        expectedResult.put("Other Europe", othereuropeValues);


        Set<ParAnos> polandValues = new TreeSet<>();
        polandValues.add(new ParAnos(2012, 2013, 2, -13));
        expectedResult.put("Poland", polandValues);


        Set<ParAnos> portugalValues = new TreeSet<>();
        portugalValues.add(new ParAnos(2010, 2011, 0, -530));
        portugalValues.add(new ParAnos(2011, 2012, 0, -138));
        portugalValues.add(new ParAnos(2013, 2014, -28, 20));
        expectedResult.put("Portugal", portugalValues);


        Set<ParAnos> restoftheworldValues = new TreeSet<>();
        restoftheworldValues.add(new ParAnos(2012, 2013, -47, -140));
        restoftheworldValues.add(new ParAnos(2015, 2016, -200, -2410));
        expectedResult.put("Rest of the world", restoftheworldValues);


        Set<ParAnos> southafricaValues = new TreeSet<>();
        southafricaValues.add(new ParAnos(2013, 2014, 1, -20));
        southafricaValues.add(new ParAnos(2016, 2017, -150, -32));
        southafricaValues.add(new ParAnos(2017, 2018, -48, -2));
        expectedResult.put("South Africa", southafricaValues);


        Set<ParAnos> turkiyeValues = new TreeSet<>();
        turkiyeValues.add(new ParAnos(2012, 2013, 1, -92));
        turkiyeValues.add(new ParAnos(2015, 2016, -27, -76));
        turkiyeValues.add(new ParAnos(2016, 2017, -49, 33));
        expectedResult.put("Turkiye", turkiyeValues);


        Set<ParAnos> usaValues = new TreeSet<>();
        usaValues.add(new ParAnos(2014, 2015, -12000, 8000));
        usaValues.add(new ParAnos(2018, 2019, -35000, 0));
        usaValues.add(new ParAnos(2019, 2020, -21000, -10000));
        expectedResult.put("USA", usaValues);

        Map<String, Set<ParAnos>> result = teste.getSalesData(filename);

        assertEquals(result, expectedResult);
    }
}