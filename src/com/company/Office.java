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

    public void sit(Person person, int x, int y) {
        Desk currentDesk = this.desks[y][x];
        if (currentDesk.person != null) {
            currentDesk.person.isSit = false;
        }
        currentDesk.person = person;
        person.isSit = true;
    }
}
