package com.tungnt2005110014.tuan04;

import java.util.Scanner;

public class CarTestDrive {
    public static void main(String[] args) {
        Car[] dsXe = new Car[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào danh sách xe");
        for(int i=0; i < dsXe.length; i++){
            System.out.println("Nhập vào xe thứ " + (i+1));
            System.out.print("Chủ xe: ");
            String ownerName = scanner.nextLine();
            System.out.print("Hảng sản xuất: ");
            String productionCompany = scanner.nextLine();
            System.out.print("Dòng: ");
            String current = scanner.nextLine();
            System.out.print("Giấy phép: ");
            String license = scanner.nextLine();
            System.out.print("Dung tích: ");
            String fuelCapacity = scanner.nextLine();
            dsXe[i] = new Car(ownerName, productionCompany, current, license, fuelCapacity);
        }

        System.out.println("==========DS Xe==========");
        for(Car car : dsXe){
            car.inThongTin();
        }
    }
}
