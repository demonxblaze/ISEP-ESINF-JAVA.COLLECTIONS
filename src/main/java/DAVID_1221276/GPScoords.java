package DAVID_1221276;

public class GPScoords {

    private int x; //latitude

    private int y; //longitude

    public GPScoords(String coords) {
        int [] coordenadas = stringToIntGps(coords);
        setX(coordenadas[0]);
        setY(coordenadas[1]);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int [] stringToIntGps(String gps){
        String [] coordenadas = gps.split(", ");
        return new int [] {Integer.parseInt(coordenadas[0]),Integer.parseInt(coordenadas[1])};
    }

}
