package com.tungnt2005110014.tuan01;

import java.util.Scanner;

public class Lap1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Chiều dài cạnh: ");
            double canh = scanner.nextDouble();
            double dienTich = Math.pow(canh, 3);
            System.out.printf("Diện tích là: %.1f", dienTich);
        scanner.close();
    }
}