package com.tungnt2005110014.tuan04;

public class Account {
    String accountName;
    String accountNumber;
    String balance;

    Account(){};
    Account(String aName, String aNum, String b){
        accountName = aName;
        accountNumber = aNum;
        balance = b;
    }
    void inThongTin(){
        System.out.println("Tên chủ tài khoản: " + accountName + " Số tài khoản: " + accountNumber + " Số dư: " + balance);
    }
}
