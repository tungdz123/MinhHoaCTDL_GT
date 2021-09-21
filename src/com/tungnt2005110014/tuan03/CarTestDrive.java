package com.tungnt2005110014.tuan03;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car;
        car = new Car("Nguyễn Thanh Tùng", "BMW", "Motorcycle", "NTT123456789", "1l/40km");
        System.out.println("Tên chủ xe: " + car.ownerName + " Hảng sản xuất: " + car.productionCompany + " Dòng: " + car.current + " Giấy phép: " + car.license + " Dung tích xăng: " + car.fuelCapacity);
    }
}
