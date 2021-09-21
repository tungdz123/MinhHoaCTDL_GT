package com.tungnt2005110014.tuan03;

public class ComputerTestDrive {
    public static void main(String[] args) {
        Computer computer;
        computer = new Computer("Dell", "2002", "Window 10 Pro", "16GB", "Intel i7", "26.500.000", "10 năm");
        System.out.println("Nhà sản xuất: " + computer.publishingCompany + " Năm sản xuất: " + computer.publishingYear + " Hệ điều hành: " + computer.operatingSystem + " RAM: " + computer.ram + " CPU: " + computer.cpu + " Giá: " + computer.price + " Năm bảo hành: " + computer.warrantyYear);
    }
}
