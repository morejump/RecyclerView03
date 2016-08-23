package com.example.hp.recyclerview03;

/**
 * Created by HP on 8/23/2016.
 */
public class Person {
    private int idImage;
    private String name;

    public Person(int idImage, String name) {
        this.idImage = idImage;
        this.name = name;
    }

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
