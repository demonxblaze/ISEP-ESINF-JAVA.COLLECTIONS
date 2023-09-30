package DIOGO_1220941.EX3;

public class Powertrain {
    private String type;
    private int numberOfVehicles;

    public Powertrain(String type, int numberOfVehicles) {
        this.type = type;
        this.numberOfVehicles = numberOfVehicles;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }
}