package com.tungnt2005110014.tuan04;

public class Staff {
    String name;
    String income;
    String address;
    String workingParts;
    String dateofBirth;

    Staff(){};
    Staff(String n, String i, String add, String wp, String d){
        name = n;
        income = i;
        address = add;
        workingParts = wp;
        dateofBirth = d;
    }
    void inThongTin(){
        System.out.println("Họ & Tên: " + name + " Lương: " + income + " Địa chỉ: " + address + " Bộ phận làm việc: " + workingParts + " Ngày sinh: " + dateofBirth);
    }
}
