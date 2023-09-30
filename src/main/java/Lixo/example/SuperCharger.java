package Lixo.example;

public class SuperCharger {

    private String name;
    private int stalls;
    private double kW;
    private int elevm;

    private Status status;

    public SuperCharger(String name, int stalls, double kW, int elevm, String street, String zip, String coordinates, String status) {
        setName(name);
        setStalls(stalls);
        setkW(kW);
        setElevm(elevm);
        //setAddress(street, zip,coordinates);
        setStatus(status);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStalls() {
        return stalls;
    }

    public void setStalls(int stalls) {
        this.stalls = stalls;
    }

    public double getkW() {
        return kW;
    }

    public void setkW(double kW) {
        this.kW = kW;
    }

    public int getElevm() {
        return elevm;
    }

    public void setElevm(int elevm) {
        this.elevm = elevm;
    }


    public Status getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equalsIgnoreCase("OPEN")){
            this.status = Status.OPEN;
        }else {
            this.status = Status.CLOSE;
        }
    }
}
