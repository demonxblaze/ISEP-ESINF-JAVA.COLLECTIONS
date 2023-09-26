package Lists;

import org.example.SuperCharger;

import java.util.ArrayList;

/**
 * Author @
 */
public class SuperchargersList {
    /**
     * List of superchargers
     */
    private ArrayList<SuperCharger> chargers;

    /**
     * Constructor
     */
    public SuperchargersList() {
        setChargers(new ArrayList<SuperCharger>());
    }

    /**
     * Getter
     * @return list of chargers
     */
    public ArrayList<SuperCharger> getChargers() {
        return chargers;
    }

    /**
     * Setter
     * @param chargers list of chargers
     */
    public void setChargers(ArrayList<SuperCharger> chargers) {
        this.chargers = chargers;
    }

    /**
     * Add a supercharger to the list
     * @param superCharger supercharger
     */
    public void add(SuperCharger superCharger) {
        chargers.add(superCharger);
    }
}
