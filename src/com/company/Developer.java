package com.company;

import java.util.HashSet;

public class Developer extends Person{

    HashSet<String> skills;

    public Developer(String company, int bonus, HashSet<String> skills) {
        super(company, bonus);
        this.skills = skills;
    }
}
