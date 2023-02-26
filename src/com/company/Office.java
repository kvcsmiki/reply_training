package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Office {

    Desk[][] desks;
    ArrayList<Developer> developers;
    ArrayList<Manager> managers;

    public Office(Desk[][] desks, ArrayList<Developer> developers, ArrayList<Manager> managers) {
        this.desks = desks;
        this.developers = developers;
        this.managers = managers;
    }
}
