package com.tungnt2005110014.tuan04;

import java.util.Scanner;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account[] dsTK = new Account[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào danh sách tài khoản");
        for(int i=0; i < dsTK.length; i++){
            System.out.println("Nhập vào tài khoản thứ " + (i+1));
            System.out.print("Chủ tài khoản: ");
            String accountName = scanner.nextLine();
            System.out.print("Số tài khoản: ");
            String accountNumber = scanner.nextLine();
            System.out.print("Số dư: ");
            String balance = scanner.nextLine();
            dsTK[i] = new Account(accountName, accountNumber, balance);
        }

        System.out.println("==========DS Tài Khoản==========");
        for(Account account : dsTK){
            account.inThongTin();
        }
    }
}
