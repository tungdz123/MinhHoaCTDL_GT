package com.tungnt2005110014.Cuoiky;

public class QuanLyHangHoaTestDrive {
    public static void main(String[] args) {
        QuanLyHangHoa testDrive = new QuanLyHangHoa();
        
        //Thực phẩm
        testDrive.add("Thuc pham", 111, "Banh mi", 250, 100, "01/01/2021");
        testDrive.add("Thuc pham", 112, "My ly", 150, 100, "02/01/2021");
        testDrive.add("Thuc pham", 113, "Bia 333", 150, 100, "03/01/2021");
        testDrive.add("Thuc pham", 114, "Ruou", 200, 100, "04/01/2021");
        testDrive.add("Thuc pham", 115, "Dua hau", 100, 100, "05/01/2021");
        testDrive.add("Thuc pham", 116, "Gao", 350, 100, "06/01/2021");
        testDrive.add("Thuc pham", 117, "Nep", 150, 100, "07/01/2021");
        testDrive.add("Thuc pham", 118, "Mi goi", 300, 100, "08/01/2021");
        //Sành sứ
        testDrive.add("Sanh su", 221, "Ly", 15000, 10, "01/06/2021");
        testDrive.add("Sanh su", 222, "Am tra", 25000, 10, "02/06/2021");
        testDrive.add("Sanh su", 223, "Dia", 15000, 10, "03/06/2021");
        testDrive.add("Sanh su", 224, "Binh hoa", 30000, 10, "04/06/2021");
        testDrive.add("Sanh su", 225, "Den tran", 100000, 10, "05/06/2021");
        //Điện máy
        testDrive.add("Dien may", 331, "Tivi", 20, 80, "01/12/2021");
        testDrive.add("Dien may", 332, "Tu lanh", 10, 80, "02/12/2021");
        testDrive.add("Dien may", 333, "May giat", 15, 80, "03/12/2021");
        testDrive.add("Dien may", 334, "Dieu hoa", 5, 80, "04/12/2021");
        testDrive.add("Dien may", 335, "Quat", 2, 80, "05/12/2021");
        testDrive.add("Dien may", 336, "May rua chen", 100, 80, "06/12/2021");
        testDrive.add("Dien may", 337, "Loa keo", 750, 80, "07/12/2021");
        
        testDrive.menu();
    }
}
