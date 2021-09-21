package com.tungnt2005110014.tuan03;

public class StaffTestDrive {
    public static void main(String[] args) {
        Staff staff;
        staff = new Staff("Nguyễn Thanh Tùng", 10000000, "Tp. HCM", "Developer", "25-08-2002");
        System.out.println("Họ & Tên: " + staff.name + " Lương: " + staff.income + " Địa chỉ: " + staff.address + " Bộ phận làm việc: " + staff.workingParts + " Ngày sinh: " + staff.dateofBirth);
    }
}
