package org.example;

public class SuperCharger {

    private String name;
    private int Stalls;
    private double kW;
    private int elevm;

    private Address address;
    private Status status;

    public SuperCharger(String name, int stalls, double kW, int elevm, String street, String zip, String coordinates, Status status) {
        setName(name);
        setStalls(stalls);
        setkW(kW);
        setElevm(elevm);
        setAddress(street, zip,coordinates);
        setStatus(status);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStalls() {
        return Stalls;
    }

    public void setStalls(int stalls) {
        Stalls = stalls;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(String street, String zip, String coordinates) {
        this.address = new Address(street,zip,coordinates);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
