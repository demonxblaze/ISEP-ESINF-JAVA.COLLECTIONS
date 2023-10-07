import Classes.Charger;
import Classes.GPScoords;
import Classes.POI;

import java.util.*;

public class EX6 {

    public static double getDistance(GPScoords gps1, GPScoords gps2) {
        double R = 6371;
        double lat1 =  gps1.getX();
        double lon1 = gps1.getY();
        double lat2 =  gps2.getX();
        double lon2 =  gps2.getY();

        double n1 = Math.toRadians(lat1);
        double n2 = Math.toRadians(lat2);
        double dn = Math.toRadians(lat2 - lat1);
        double dl = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dn / 2) * Math.sin(dn / 2)
                + Math.cos(n1) * Math.cos(n2)
                * Math.sin(dl / 2) * Math.sin(dl / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return R * c;
    }

    public TreeSet<POI> exercicio6(POI[] pois, Charger[] chargers){

        POI temp = null;
        double minDist;

        if (pois == null || chargers == null) {
            return null;
        }

        if (pois.length == 0 || chargers.length == 0) {
            return null;
        }


        for (Charger c : chargers) {
            minDist = Double.MAX_VALUE;
            for (POI p : pois) {
                if (getDistance(c.getGps(), p.getGps()) < minDist) {
                    minDist = getDistance(c.getGps(), p.getGps());
                    temp = p;
                }
            }

            temp.addCharger(c);

        }


        TreeSet<POI> treeSet = new TreeSet<>();

        treeSet.addAll(Arrays.asList(pois));

        return treeSet;
    }
}


