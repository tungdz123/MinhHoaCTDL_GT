package com.tungnt2005110014.tuan03;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account account;
        account = new Account("Nguyễn Thanh Tùng", "2005110014", "1.250.820.022");
        System.out.println("Tên chủ tài khoản: " + account.accountName + " Số tài khoản: " + account.accountNumber + " Số dư: " + account.balance);
    }
}
