package com.company;

public class Desk {

    DeskType type;

    Person person;

    boolean isAvailable(){
        return !this.type.equals(DeskType.UNAVAILABLE);
    }
}
