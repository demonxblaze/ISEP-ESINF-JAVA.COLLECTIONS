package Lixo.example;

import Lixo.example.Lists.SalesList;
import Lixo.example.Lists.StatesList;

/**
 * Author @
 */
public class Country {
    /**
     * Name of the country
     */
    private String name;
    /**
     * List of states
     */
    private StatesList states;
    /**
     * List of sales
     */
    private SalesList sales;

    /**
     * Constructor
     * @param name name of the country
     */
    public Country(String name) {
        setName(name);
        setStates(new StatesList());
        setSales(new SalesList());
    }

    /**
     * Getter
     * @return sales
     */
    public SalesList getSales() {
        return sales;
    }

    /**
     * Setter
     * @param sales sales
     */
    public void setSales(SalesList sales) {
        this.sales = sales;
    }

    /**
     * Getter
     * @return name of the country
     */
    public String getName() {
        return name;
    }

    /**
     * Setter
     * @param name name of the country
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter
     * @return list of states
     */
    public StatesList getStates() {
        return states;
    }

    /**
     * Setter
     * @param states list of states
     */
    public void setStates(StatesList states) {
        this.states = states;
    }

    /**
     * Add a state to the list
     * @param name name of the state
     */
    public void newState(String name){
        states.add(new State(name));
    }
}
