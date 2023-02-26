package com.company;

public class Main {

    public static void main(String[] args) {
        OfficeFactory officeFactory = new OfficeFactory();

        officeFactory.readFile("C:\\Users\\kovac\\Downloads\\a_solar.txt");
        for(int i=0;i<officeFactory.desks.length;i++){
            for(int j=0;j<officeFactory.desks[i].length;j++){
                System.out.print(officeFactory.desks[i][j].type+" ");
            }
            System.out.println();
        }
        System.out.println(officeFactory.developers);
        System.out.println(officeFactory.managers);
    }

}
