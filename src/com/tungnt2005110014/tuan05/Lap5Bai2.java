package com.tungnt2005110014.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lap5Bai2 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList <String> list = new ArrayList<String>();
    static void Menu(){
        System.out.println("------------------MENU------------------");
        System.out.println(">>1. Nhập danh sách họ và tên.");
        System.out.println(">>2. Xuất danh sách vừa nhập.");
        System.out.println(">>3. Xuất danh sách ngẫu nhiên.");
        System.out.println(">>4. Sắp xếp giảm dần và xuất danh sách.");
        System.out.println(">>5. Tìm và xoá họ tên nhập từ bàn phím.");
        System.out.println(">>6. Kết thúc.");
        System.out.print("Chọn chức năng: ");
        int key = scanner.nextInt();
        scanner.nextLine();
        switch(key){
            case 1:
                nhap();
                break;
            case 2:
                xuat();
                break;
            case 3:
                xuatNgauNhien();
                break;
            case 4:
                sapXep();
                break;
            case 5:
                xoa();
                break;
            case 6:
                System.exit(0);
                break;
        }
    }
    static void nhap(){
        while(true){
            System.out.print("Nhập họ và tên: ");
            String x = scanner.nextLine();
            list.add(x);
            System.out.print("Nhập thêm (y/n)?: ");
            if(scanner.nextLine().equals("n"))
                break;
        }
    }
    static void xuat(){
        for (String a : list){
            System.out.println("Họ và tên: " +a);
        }    
    }
    static void xuatNgauNhien(){
        Collections.shuffle(list);
        xuat();
    }
    static void sapXep(){
        Collections.sort(list);
        Collections.reverse(list);
        xuat();
    }
    static void xoa(){
        System.out.print("Nhập tên cần xoá: ");
        String name = scanner.nextLine();
        for (String a : list) {
            if(a.equals(name)){
                list.remove(a);
                System.out.println("Đã xoá!");
                break;
            }
        }
    }
    public static void main(String[] args) {
        do {
            Menu();
            System.out.print("Quan về MENU lựa chọn ?(y/n): ");
        } while(scanner.nextLine().equals("y"));
    }
    
}