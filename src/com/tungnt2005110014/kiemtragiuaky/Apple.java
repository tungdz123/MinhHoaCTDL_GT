package com.tungnt2005110014.kiemtragiuaky;

public class Apple {
    String id;
    String weigh;
    String color;

    Apple(){}

    Apple(String i, String w, String c){
        id = i;
        weigh = w;
        color = c;
    }

    void inThongTin(){
        System.out.println("ID: " + id + " Khối lượng: " + weigh + " Màu sắc: " + color);
    }
}
