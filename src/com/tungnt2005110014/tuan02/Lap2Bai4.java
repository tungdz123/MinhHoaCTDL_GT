package com.tungnt2005110014.tuan02;

import java.util.Scanner;

public class Lap2Bai4 {
    public static void main(String[] args) {
        System.out.println("==========MENU==========");
        System.out.println(">>1. Giải Phương Trình Bậc I");
        System.out.println(">>2. Giải Phương Trình Bậc II");
        System.out.println(">>3. Tính Tiền Điện");
        System.out.println("========================");
        int suLuaChon;
        System.out.print("Lựa Chọn Chức Năng: ");
        Scanner bienNhap;
        bienNhap = new Scanner(System.in);
        suLuaChon = bienNhap.nextInt();

        switch(suLuaChon){
            case 1: giaiPTBacI(); break;
            case 2: giaiPTBacII(); break;
            case 3: tinhTienDien(); break;
            default: System.out.println("Chọn chức năng khác");
        }
    }
    static void giaiPTBacI(){
        System.out.println("Triển Khai");
    }

    static void giaiPTBacII(){
        System.out.println("Triển Khai");
    }

    static void tinhTienDien(){
        System.out.println("Triển Khai");
    }
}
