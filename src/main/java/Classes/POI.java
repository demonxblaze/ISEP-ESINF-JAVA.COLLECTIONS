package Classes;

import Classes.Charger;
import Classes.GPScoords;

import java.util.ArrayList;
import java.util.List;

public class POI {

    private GPScoords gps;

    private String name;

    private List<Charger> chargers;

    public POI(String coordenadas, String name) {
        setGps(new GPScoords(coordenadas));
        setName(name);
        chargers = new ArrayList<>();
    }

    public void setGps(GPScoords gps) {
        this.gps = gps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Charger> getChargers() {
        return chargers;
    }

    public void addCharger(Charger charger){
        chargers.add(charger);
    }
}
