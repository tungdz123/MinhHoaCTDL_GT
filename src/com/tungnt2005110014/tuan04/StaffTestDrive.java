package com.tungnt2005110014.tuan04;

import java.util.Scanner;

public class StaffTestDrive {
    public static void main(String[] args) {
        Staff[] dsNV = new Staff[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào danh sách nhân viên");
        for(int i=0; i < dsNV.length; i++){
            System.out.println("Nhập vào nhân viên thứ " + (i+1));
            System.out.print("Tên nhân viên: ");
            String name = scanner.nextLine();
            System.out.print("Lương: ");
            String income = scanner.nextLine();
            System.out.print("Địa chỉ: ");
            String address = scanner.nextLine();
            System.out.print("Bộ phận làm việc: ");
            String workingParts = scanner.nextLine();
            System.out.print("Ngày sinh: ");
            String dateofBirth = scanner.nextLine();
            dsNV[i] = new Staff(name, income, address, workingParts, dateofBirth);
        }

        System.out.println("==========DS Nhân viên==========");
        for(Staff staff : dsNV){
            staff.inThongTin();
        }
    }
}
