package com.tungnt2005110014.tuan03;

import java.util.Scanner;

public class Lap3Bai5TestDrive {
    public static void main(String[] args) {
        //tạo 1 ds sinh viên
        Lap3Bai5[] dsSinhVien = new Lap3Bai5[2];

        //nhập ds sinh viên từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào danh sách sinh viên");
        for(int i=0; i < dsSinhVien.length; i++ ){
            System.out.println("Nhập sinh viên thứ " + (i+1));
            System.out.print("Tên sinh viên: ");
            String ten = scanner.nextLine();
            System.out.print("Quê quán: ");
            String queQuan = scanner.nextLine();
            System.out.print("Mã số sinh viên: ");
            int mssv = scanner.nextInt();
            System.out.print("Tuổi: ");
            int tuoi = scanner.nextInt();   
            scanner.nextLine();   
            dsSinhVien[i] = new Lap3Bai5(ten, mssv, tuoi, queQuan);
        }

        //in ds sinh viên
        System.out.println("==========DSSV==========");
        for(Lap3Bai5 student : dsSinhVien){
            student.inThongTin();
        }
    }
}
