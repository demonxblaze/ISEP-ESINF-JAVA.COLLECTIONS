package Classes;


public class GPScoords {

    private double x; //latitude

    private double y; //longitude

    public GPScoords(String coords) {
        double [] coordenadas = stringToIntGps(coords);
        setX(coordenadas[0]);
        setY(coordenadas[1]);
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double [] stringToIntGps(String gps){
        if(gps.charAt(0) == '\"'){
            gps = gps.substring(1,gps.length()-1);
        }
        String [] coordenadas = gps.split(", ");
        return new double [] {Double.parseDouble(coordenadas[0]),Double.parseDouble(coordenadas[1])};
    }

}
