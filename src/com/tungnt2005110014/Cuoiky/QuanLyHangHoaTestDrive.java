package com.tungnt2005110014.Cuoiky;

public class QuanLyHangHoaTestDrive {
    public static void main(String[] args) {
        QuanLyHangHoa testDrive = new QuanLyHangHoa();
        
        //Thời trang
        testDrive.add("Thoi trang", 111, "Jean", 250, 100, "01/01/2021");
        testDrive.add("Thoi trang", 112, "Somi", 150, 100, "02/01/2021");
        testDrive.add("Thoi trang", 113, "Polo", 150, 100, "03/01/2021");
        testDrive.add("Thoi trang", 114, "Quan au", 200, 100, "04/01/2021");
        testDrive.add("Thoi trang", 115, "Short", 100, 100, "05/01/2021");
        testDrive.add("Thoi trang", 116, "Hoodie", 350, 100, "06/01/2021");
        testDrive.add("Thoi trang", 117, "T-Shirt", 150, 100, "07/01/2021");
        testDrive.add("Thoi trang", 118, "Jacket", 300, 100, "08/01/2021");
        //Phương tiện
        testDrive.add("Phuong tien", 221, "Sirius 50cc", 15000, 10, "01/06/2021");
        testDrive.add("Phuong tien", 222, "Sirius 100cc", 25000, 10, "02/06/2021");
        testDrive.add("Phuong tien", 223, "Wave 50cc", 15000, 10, "03/06/2021");
        testDrive.add("Phuong tien", 224, "Wave 125cc", 30000, 10, "04/06/2021");
        testDrive.add("Phuong tien", 225, "Sh 125cc", 100000, 10, "05/06/2021");
        testDrive.add("Phuong tien", 226, "Sh mode", 65000, 10, "06/06/2021");
        testDrive.add("Phuong tien", 227, "Vision", 35000, 10, "07/06/2021");
        testDrive.add("Phuong tien", 228, "Air Blade 150cc", 51000, 10, "08/06/2021");
        //Đồ gia dụng 
        testDrive.add("Do gia dung", 331, "Chen", 20, 80, "01/12/2021");
        testDrive.add("Do gia dung", 332, "Ly", 10, 80, "02/12/2021");
        testDrive.add("Do gia dung", 333, "To", 15, 80, "03/12/2021");
        testDrive.add("Do gia dung", 334, "Dua", 5, 80, "04/12/2021");
        testDrive.add("Do gia dung", 335, "Muong", 2, 80, "05/12/2021");
        testDrive.add("Do gia dung", 336, "Thot", 100, 80, "06/12/2021");
        testDrive.add("Do gia dung", 337, "May xay", 750, 80, "07/12/2021");
        
        testDrive.menu();
    }
}
