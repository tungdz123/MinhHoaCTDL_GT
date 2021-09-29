package com.tungnt2005110014.tuan02;

import java.util.Scanner;

public class Lap2Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        scanner.close(); 
        if(a==0){
            if(b==0){
                System.out.println("Phương trình vô số nghiệm");
            }
            else{
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else{
            double c = -b/a;
            System.out.printf("Phương trình có nghiệm là: %.1f", c);
        }
    }
}
