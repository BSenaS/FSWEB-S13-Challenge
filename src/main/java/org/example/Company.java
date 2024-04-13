package org.example;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames) {
        if(giro < 0){
            this.giro = 0;
        } else {
            this.giro = giro;
        }
        this.id = id;
        this.name = name;
        this.developerNames = developerNames;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index: " + index);
        } else if (developerNames[index] == null) {
            developerNames[index] = name;
            System.out.println("Çalışan başarıyla eklendi: " + name);
        } else {
            System.out.println("Bu indeks zaten dolu: " + index);
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }

}
