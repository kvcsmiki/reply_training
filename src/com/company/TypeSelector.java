package com.company;

public class TypeSelector {

    DeskType selectType(String type){
        switch(type){
            case "#" -> {
                return DeskType.UNAVAILABLE;
            }
            case "M" -> {
                return DeskType.MANAGER;
            }
            case "_" -> {
                return DeskType.DEVELOPER;
            }
            default -> {
                return null;
            }
        }
    }
}
