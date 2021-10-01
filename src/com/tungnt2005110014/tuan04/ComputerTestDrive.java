package com.tungnt2005110014.tuan04;

import java.util.Scanner;

public class ComputerTestDrive {
    public static void main(String[] args) {
        Computer[] dsMT = new Computer[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào danh sách máy tính");
        for(int i=0; i < dsMT.length; i++){
            System.out.println("Nhập vào máy tính thứ " + (i+1));
            System.out.print("Nhà sản xuất: ");
            String publishingCompany = scanner.nextLine();
            System.out.print("Năm sản xuất: ");
            String publishingYear = scanner.nextLine();
            System.out.print("Hệ điều hành: ");
            String operatingSystem = scanner.nextLine();
            System.out.print("Ram: ");
            String ram = scanner.nextLine();
            System.out.print("CPU: ");
            String cpu = scanner.nextLine();
            System.out.print("Giá: ");
            String price = scanner.nextLine();
            System.out.print("Năm bảo hành: ");
            String warrantyYear = scanner.nextLine();
            dsMT[i] = new Computer(publishingCompany, publishingYear, operatingSystem, ram, cpu, price, warrantyYear);
        }

        System.out.println("==========DS Máy tính==========");
        for(Computer computer : dsMT){
            computer.inThongTin();
        }
    }
}
