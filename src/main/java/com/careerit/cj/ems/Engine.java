package com.careerit.cj.ems;

public class Engine {
    private String type;
    private int horsePower;
    private double displacement;

    public Engine() {
    }

    public Engine(String type, int horsePower, double displacement) {
        this.type = type;
        this.horsePower = horsePower;
        this.displacement = displacement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }
}