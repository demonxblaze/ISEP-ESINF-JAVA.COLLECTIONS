package Lixo.example;

public enum Powertrain {
    BEV("Battery Electric Vehicles"),
    PHEV("Plug-in Electric Vehicles");

    private String description;

    Powertrain(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
