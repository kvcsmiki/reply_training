package com.company;

import java.util.ArrayList;

public class Office {

    Desk[][] desks;
    ArrayList<Developer> developers;
    ArrayList<Manager> managers;

    public Office(int width, int height, ArrayList<Developer> developers, ArrayList<Manager> managers) {
        this.desks = new Desk[width][height];
        this.developers = developers;
        this.managers = managers;
    }
}
