package org.example;

import Lists.SalesList;
import Lists.StatesList;

public class Country {
    private String name;

    private StatesList states;

    private SalesList sales;

    public Country(String name) {
        setName(name);
        setStates(new StatesList());
        setSales(new SalesList());
    }

    public SalesList getSales() {
        return sales;
    }

    public void setSales(SalesList sales) {
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatesList getStates() {
        return states;
    }

    public void setStates(StatesList states) {
        this.states = states;
    }
    public void newState(String name){
        states.add(new State(name));
    }
}
