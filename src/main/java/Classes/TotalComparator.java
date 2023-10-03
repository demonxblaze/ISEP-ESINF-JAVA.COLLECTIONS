package Classes;

import java.util.Comparator;

public class TotalComparator implements Comparator<CarregadoresPais> {
    @Override
    public int compare(CarregadoresPais info1, CarregadoresPais info2) {
        // Compare by descending order of the total number of chargers
        int total1 = info1.getTotal();
        int total2 = info2.getTotal();
        if (total2 != total1) {
            return total2 - total1;
        }

        // In case of a tie, compare alphabetically by the country name
        return info1.getPais().compareTo(info2.getPais());
    }
}

