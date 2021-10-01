package com.tungnt2005110014.tuan04;

public class Cow {
    double weight;
    String breed;
    String color;   

    Cow(){};
    Cow(double w, String br, String cl){
        weight = w;
        breed = br;
        color = cl;
    }
    void inThongTin(){
        System.out.println("Weight: " + weight + " Breed: " + breed + " Color: " + color);
    }
}
