package com.tungnt2005110014.tuan04;

public class Book {
    double price;
    String publishingCompany;
    String publishingYear;
    double quantity;
    String category;

    Book(){};
    Book(double pr, String pc, String py, double q, String c){
        price = pr;
        publishingCompany = pc;
        publishingYear = py;
        quantity = q;
        category = c;
    }
    void inThongTin(){
        System.out.println("Giá: " + price + " Nhà xuất bản: " + publishingCompany + " Năm xuất bản: " + publishingYear + " Số lượng: "+ quantity + " Thể loại: " + category);
    }
}
