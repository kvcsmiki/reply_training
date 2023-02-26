package com.company;

public class Manager extends Person{

    public Manager(String company, int bonus) {
        super(company, bonus);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "company='" + company + '\'' +
                ", bonus=" + bonus +
                ", isSit=" + isSit +
                '}';
    }
}
