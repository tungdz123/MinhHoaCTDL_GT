package com.tungnt2005110014.tuan03;

import java.util.Arrays;
import java.util.Scanner;

public class Lap3Bai3 {
    public static void main(String[] args) {
    int[] soNguyen = new int [5];
    
    Scanner scanner = new Scanner(System.in);
    for(int i = 0; i < soNguyen.length; i++){
        System.out.print("số thứ " + (i+1) + ": ");
        soNguyen[i] = scanner.nextInt();
        
    }
    
    System.out.print("Mảng vừa nhập: ");
    for (int i : soNguyen) {
        System.out.print("\t"+i);
    }
    
    System.out.print("\nMảng sau khi sắp xếp: ");
    Arrays.sort(soNguyen);
    for (int i : soNguyen) {
        System.out.print("\t"+i);
    }
    
    int min = soNguyen[0];
    for(int i = 0; i< soNguyen.length; i++){
        min = Math.min(min, soNguyen[i]);
    }
    System.out.print("\nPhần tử có giá trị nhỏ nhất: "+min);
    
    int tong = 0;
    int dem = 0;
    for(int i=0; i < soNguyen.length; i++){
        if(soNguyen[i] % 3 == 0){
            tong+=soNguyen[i];
            dem++;
        }
    }
    System.out.println("\ntrung bình cộng các số chia hết cho 3: "+(tong/dem));
}
}