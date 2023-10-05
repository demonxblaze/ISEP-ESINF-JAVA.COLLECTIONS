package Classes;

import Classes.Charger;
import Classes.GPScoords;

import java.util.ArrayList;
import java.util.List;

public class POI implements Comparable<POI>{

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

    public GPScoords getGps() {
        return gps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Charger> getChargers() {
        return chargers;
    }

    public int getChargersNumber(){
        return chargers.size();
    }

    public void addCharger(Charger charger){
        chargers.add(charger);

    }

    @Override
    public String toString() {
        return "POI{" +
                "name='" + name + '\'' +
                ", chargers=" + chargers +
                '}';
    }

    @Override
    public int compareTo(POI o) {
        return this.getChargersNumber() - o.getChargersNumber();
    }


}
