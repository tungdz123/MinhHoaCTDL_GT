package com.tungnt2005110014.tuan04;

public class Car {
    String ownerName;
    String productionCompany;
    String current;
    String license;
    String fuelCapacity;

    Car(){};
    Car(String o, String pc, String c, String l, String fc){
        ownerName = o;
        productionCompany = pc;
        current = c;
        license = l;
        fuelCapacity = fc;
    }
    void inThongTin(){
        System.out.println("Tên chủ xe: " + ownerName + " Hảng sản xuất: " + productionCompany + " Dòng: " + current + " Giấy phép: " + license + " Dung tích xăng: " + fuelCapacity);
    }
}
