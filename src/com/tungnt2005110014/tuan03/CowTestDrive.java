package com.tungnt2005110014.tuan03;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow;
        cow = new Cow(15, "Tây Ban Nha", "Đen");
        System.out.println("Weight: " + cow.weight + " Breed: " + cow.breed + " Color: " + cow.color);
    }
}
