package com.tungnt2005110014.tuan03;

public class BookTestDrive {
    public static void main(String[] args) {
        Book book;
        book = new Book(250000, "NXB Việt Nam", "2002", 10000, "Truyện tranh");
        System.out.println("Giá: " + book.price + " Nhà xuất bản: " + book.publishingCompany + " Năm xuất bản: " + book.publishingYear + " Số lượng: "+ book.quantity + " Thể loại: " + book.category);
    }
}
