package Lists;

import org.example.City;
import org.example.SalesData;

import java.util.ArrayList;

public class SalesList {

    private ArrayList<SalesData> sales;

    public SalesList() {
        setSales(new ArrayList<SalesData>());
    }

    public ArrayList<SalesData> getSales() {
        return sales;
    }

    public void setSales(ArrayList<SalesData> sales) {
        this.sales = sales;
    }
    public void add(SalesData s){
        sales.add(s);
    }
}
