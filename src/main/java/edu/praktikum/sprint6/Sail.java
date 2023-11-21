package edu.praktikum.sprint6;

public class Sail {

    private final int area;

    public Sail(int area) {
        this.area = area;
    }

    public int getMaxPower() {
        return area * 3;
    }
}
