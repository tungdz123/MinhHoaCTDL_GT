package com.tungnt2005110014.tuan03;

public class Lap3Bai5 {
    String ten;
    int mssv;
    int tuoi;
    String queQuan;

    Lap3Bai5(){};
    Lap3Bai5(String t, int m, int ti, String q){
        ten = t;
        mssv = m;
        tuoi = ti;
        queQuan = q;
    }
    
    void inThongTin(){
        System.out.println("Tên: "+ ten + " Mã số sinh viên: " + mssv + " Tuổi: " + tuoi + " Quê quán: " + queQuan);
    }
}

