package com.tungnt2005110014.tuan04;

import java.util.Scanner;

public class BookTestDrive {
    public static void main(String[] args) {
        Book[] dsSach = new Book[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào danh sách sách");
        for(int i=0; i < dsSach.length; i++){
            System.out.println("Nhập vào cuốn sách thứ " + (i+1));
            System.out.print("Nhà sản xuất: ");
            String publishingCompany = scanner.nextLine();
            System.out.print("Năm sản xuất: ");
            String publishingYear = scanner.nextLine();
            System.out.print("Thể loại: ");
            String category = scanner.nextLine();
            System.out.print("Giá: ");
            double price = scanner.nextDouble();   
            System.out.print("Số lượng: ");
            double quantity = scanner.nextDouble();
            scanner.nextLine();
            dsSach[i] = new Book(price, publishingCompany, publishingYear, quantity, category);
        }

        System.out.println("==========DS Sách==========");
        for(Book book : dsSach){
            book.inThongTin();
        }
    }
}
