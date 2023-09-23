package Lists;

import org.example.SuperCharger;

import java.util.ArrayList;

public class SuperchargersList {
    private ArrayList<SuperCharger> chargers;

    public SuperchargersList() {
        setChargers(new ArrayList<SuperCharger>());
    }

    public ArrayList<SuperCharger> getChargers() {
        return chargers;
    }

    public void setChargers(ArrayList<SuperCharger> chargers) {
        this.chargers = chargers;
    }

    public void add(SuperCharger superCharger) {
        chargers.add(superCharger);
    }
}
