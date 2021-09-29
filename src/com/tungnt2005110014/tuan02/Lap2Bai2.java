package com.tungnt2005110014.tuan02;

import java.util.Scanner;

public class Lap2Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        scanner.close();
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Phương trình vô số nghiệm");
                }
                else{
                    System.out.println("Phương trình vô nghiệm");
                }
            }
            else{
                System.out.printf("Phương trình có nghiệm là: %.1f", -c/b);
            }
        }
        else{
            double d = Math.pow(b, 2) - 4*a*c;
            if(d<0){
                System.out.println("Phương trình vô nghiệm");
            }
            else if(d==0){
                System.out.printf("Phương trình có nghiệm kép: %.1f", -b/(2*a));
            }
            else if(d>0){
                double x1 = (-b + Math.sqrt(d))/(2*a);
                double x2 = (-b - Math.sqrt(d))/(2*a);
                System.out.printf("Phương trình có hai nghiệm x1 = %.1f     x2 = %.1f", x1, x2);
            }
        }
    }
}