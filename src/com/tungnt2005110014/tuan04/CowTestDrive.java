package com.tungnt2005110014.tuan04;

import java.util.Scanner;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow[] dsBo = new Cow[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào danh sách bò");
        for(int i=0; i < dsBo.length; i++){
            System.out.println("Nhập vào con bò thứ " + (i+1));
            System.out.print("Giống: ");
            String breed = scanner.nextLine();
            System.out.print("Màu sắc: ");
            String color = scanner.nextLine(); 
            System.out.print("Cân nặng: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            dsBo[i] = new Cow(weight, breed, color);
        }

        System.out.println("==========DS Bò==========");
        for(Cow cow : dsBo){
            cow.inThongTin();
        }
    }
}
