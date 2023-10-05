package Classes;

import java.util.Comparator;

/**
 * Comparator for the class CarregadoresPais
 */
public class TotalComparator implements Comparator<CarregadoresPais> {
    @Override
    public int compare(CarregadoresPais info1, CarregadoresPais info2) {
        int total1 = info1.getTotal();
        int total2 = info2.getTotal();
        if (total2 != total1) {
            return total2 - total1;
        }

        return info1.getPais().compareTo(info2.getPais());
    }
}

