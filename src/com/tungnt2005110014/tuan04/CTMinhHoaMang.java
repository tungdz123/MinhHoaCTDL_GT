package com.tungnt2005110014.tuan04;

import java.util.Arrays;

public class CTMinhHoaMang {
    public static void main(String[] args) {
        //cú pháp khai báo mảng
        int[] mangSoNguyen;//chưa xác định số phần tử
        mangSoNguyen = new int[5];//=> mảng trong java là 1 kiểu tham chiếu đối tượng

        double mangSoThuc[] = new double[10];
        //trước khi dùng thì phải xác định số phần tử của mảng
        
        mangSoNguyen[0] = 2;

        //khai báo có khởi tạo giá trị cho mảng
        double diemMonHoc[] = new double[]{10.5, 2.5, 5, 6};
        System.out.println("Điểm môn học: " + Arrays.toString(diemMonHoc)); 
        diemMonHoc[0] = diemMonHoc[1];
        //2.5, 2.5, 5, 6
        System.out.println("Điểm môn học: " + Arrays.toString(diemMonHoc));
        System.out.println("Số phần tử của mảng điểm môn học: " + diemMonHoc.length);
        //cách 2
        String dsTenSV[] = {"Tèo", "Mập", "Mèo"};

        //dùng vòng lập để duyệt mảng
        System.out.println("==========DUYỆT MẢNG==========");
        for(int i = 0; i < diemMonHoc.length; i++){
            System.out.println(diemMonHoc[i]);
        }

        //FOR EACH
        System.out.println("==========FOR EACH=========");
        for(double diem : diemMonHoc){
            System.out.println(diem);
        }

        //mảng dữ liệu có kiểu tham chiếu đối tượng
        Dog[] dsDog = new Dog[7];
        
        Dog dog0 = new Dog(10, "Đen", "Fido");
        Dog dog1 = new Dog(7, "Vàng", "La La");
        Dog dog2 = new Dog(25, "Đen Trắng", "Lu Lu");
        Dog dog3 = new Dog(11, "Trắng", "Mi Lu");
        Dog dog4 = new Dog(21, "Vàng Trắng", "Ki");
        Dog dog5 = new Dog(31, "Vàng Đen", "Vàng");
        Dog dog6 = new Dog(29, "Trắng", "Sữa");

        dsDog[0] = dog0;
        dsDog[1] = dog1;
        dsDog[2] = dog2;
        dsDog[3] = dog3;
        dsDog[4] = dog4;
        dsDog[5] = dog5;
        dsDog[6] = dog6;

        dsDog[1] = new Dog(55, "Xám", "Nanh Trắng");

        dsDog[2].inThongTin();
        dsDog[4].inThongTin();
        dsDog[6].inThongTin();
    }
}
