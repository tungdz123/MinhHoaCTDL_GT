package com.tungnt2005110014.kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleArrayList {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Apple> list = new ArrayList<Apple>();
    
    //NHẬP THÔNG TIN TÁO
    static void nhap(){
        while(true){
            Apple apple = new Apple();
            System.out.print("Nhập id: ");
            apple.id = scanner.nextLine();
            System.out.print("Nhập lhối lượng: ");
            apple.weigh = scanner.nextLine();
            System.out.print("Nhập màu: ");
            apple.color = scanner.nextLine();
            list.add(apple);
            System.out.print("Nhập thêm (y/n)?: ");
            if(scanner.nextLine().equals("n"))
                break;            
        }
    }

    //TÌM TÁO QUA MÀU
    static void tim(){
        System.out.print("Nhập màu apple cần tìm: ");
        for(Apple apple : list){
            if(scanner.nextLine().equals(apple.color)){
                apple.inThongTin();
            }
        }
    }//Chỉ tìm được thông tin táo đầu tiên (Chưa biết cách fix, mong thầy thông cảm <3)

    //IN DANH SÁCH TÁO
    static void xuat(){
        for (Apple apple : list){
            apple.inThongTin();
        }
    }

    static void menu(){
        System.out.println("|--------------------MENU--------------------|");
        System.out.println("|>>1. Thêm táo.                              |");
        System.out.println("|>>2. Tìm táo.                               |");
        System.out.println("|>>3. In táo.                                |");
        System.out.println("|>>4. Kết thúc.                              |");
        System.out.println("|--------------------------------------------|");
        System.out.print("Chọn chức năng: ");
        int key = scanner.nextInt();
        scanner.nextLine();
        switch(key){
            case 1: nhap();
                break;
            case 2: tim();
                break;    
            case 3: xuat();
                break;
            case 4: System.exit(0);
                break;
            default:
                System.out.println("Chọn sai!!!");
        }
    }
    public static void main(String[] args) {
        do {
            menu();
            System.out.print("Quay về MENU lựa chọn ?(y/n): ");
        } while(scanner.nextLine().equals("y"));
    }
}
