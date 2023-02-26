package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashSet;

public class OfficeFactory {

    final TypeSelector typeSelector = new TypeSelector();
    Office office;
    Desk[][] desks;
    ArrayList<Developer> developers = new ArrayList<>();
    ArrayList<Manager> managers = new ArrayList<>();


    void readFile(String path){
        try{
            RandomAccessFile file = new RandomAccessFile(path,"r");
            String firstLine = file.readLine();
            int width = Integer.parseInt(firstLine.split(" ")[0]);
            int height = Integer.parseInt(firstLine.split(" ")[1]);
            this.desks = new Desk[width][height];
            for(int i=0;i<height;i++){
                String[] line = file.readLine().split("");
                for(int j = 0; j < line.length; j++){
                    desks[i][j].type = typeSelector.selectType(line[j]);
                }
            }
            int developerCount = Integer.parseInt(file.readLine());
            for(int i=0;i<developerCount;i++){
                String[] line = file.readLine().split(" ");
                String company = line[0];
                int bonus = Integer.parseInt(line[1]);
                int skillCount = Integer.parseInt(line[2]);
                HashSet<String> skills = new HashSet<>();
                for(int j = 1; j <= skillCount;j++){
                    skills.add(line[2+j]);
                }
                this.developers.add(new Developer(company,bonus,skills));
            }
            int managerCount = Integer.parseInt(file.readLine());

            for(int i=0;i<managerCount;i++){
                String[] line = file.readLine().split(" ");
                String company = line[0];
                int bonus = Integer.parseInt(line[1]);
                this.managers.add(new Manager(company,bonus));
            }
            office = new Office(this.desks,this.developers,this.managers);
            file.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
