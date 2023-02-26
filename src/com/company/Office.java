package com.company;

import java.util.ArrayList;

public class Office {

    Desk[][] desks;
    int width;
    int height;
    ArrayList<Developer> developers;
    ArrayList<Manager> managers;

    public Office(int width, int height, ArrayList<Developer> developers, ArrayList<Manager> managers) {
        Desk[][] desks = new Desk[width][height];
        this.developers = developers;
        this.managers = managers;
    }
}
