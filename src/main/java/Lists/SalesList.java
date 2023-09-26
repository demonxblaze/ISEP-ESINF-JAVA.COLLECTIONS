package Lists;

import org.example.City;
import org.example.SalesData;

import java.util.ArrayList;

/**
 * Author @
 */
public class SalesList {
    /**
     * List of SalesData
     */
    private ArrayList<SalesData> sales;

    /**
     * Constructor
     */
    public SalesList() {
        setSales(new ArrayList<SalesData>());
    }

    /**
     * Getter
     * @return sales
     */
    public ArrayList<SalesData> getSales() {
        return sales;
    }

    /**
     * Setter
     * @param sales sales
     */
    public void setSales(ArrayList<SalesData> sales) {
        this.sales = sales;
    }

    /**
     * Add sales data to the list
     * @param s city
     */
    public void add(SalesData s){
        sales.add(s);
    }
}
