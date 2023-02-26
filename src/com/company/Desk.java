package com.company;

public class Desk {

    DeskType type;

    boolean isAvailable(){
        return !this.type.equals(DeskType.UNAVAILABLE);
    }
}
