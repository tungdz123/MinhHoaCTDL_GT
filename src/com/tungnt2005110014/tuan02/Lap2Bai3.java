package com.tungnt2005110014.tuan02;

import java.util.Scanner;

public class Lap2Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện: ");
        double soDien = scanner.nextDouble();
        scanner.close();
        if(soDien<50){
            double tien = soDien*1000;
            System.out.printf("Số tiền phải trả là: %.1f", tien);
        } 
        else{
            double tien = 50*1000 + (soDien-50)*1200;
            System.out.printf("Số tiền phải trả là: %.1f", tien);
        }
    }
    
}
