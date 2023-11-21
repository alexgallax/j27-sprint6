package edu.praktikum.sprint6;

public class Ship {

    private final Sail sail;

    public Ship(Sail sail) {
        this.sail = sail;
    }

    public int getMaxSpeed() {
        return sail.getMaxPower() * 4;
    }
}
