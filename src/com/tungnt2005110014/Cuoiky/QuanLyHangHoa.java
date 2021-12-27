package com.tungnt2005110014.Cuoiky;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class QuanLyHangHoa {
    Node head = null;
    Node tail = null;
    KhoHang khoHang;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
    int n = 30;

    public QuanLyHangHoa(){}
    boolean isEmpty(){
        boolean empty = true;
        if (head == null) {
            empty = true;
        } else {
            empty = false;
        }
        return empty;
    }

    // Hàm mồi
    void add(String loai, int id, String tenHangHoa, double giaNhap, int soLuongTonKho,String ngay){
        Date ngayNhapKho;

        try {
            ngayNhapKho = simpleDateFormat.parse(ngay);

        } catch (Exception e) {
        }
        KhoHang khoHang = new KhoHang(loai, id, tenHangHoa, giaNhap, soLuongTonKho, ngay);
        Node newNode  = new Node(khoHang);
        if (isEmpty() == true) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail  = newNode;            
        }
    }

    // Hàm thêm vào đầu danh sách
    void themDau(){
        KhoHang khoHang = new KhoHang();
        Node newNode = new Node(khoHang);
        newNode.data.nhap();
        if (isEmpty() == true) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;            
        }
    }

    // Hàm thêm vào cuối danh sách
    void themCuoi(){
        KhoHang khoHang = new KhoHang();
        Node newNode = new Node(khoHang);
        newNode.data.nhap();
        if (isEmpty() == true) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;            
        }
    }

    Node search(int idCanTim) {
        Node node = null;

        if (isEmpty() == true) {
            System.out.println("Danh sach rong.");
        } else {
            Node current;
            current = head;
            while (current !=null ) {
                if (current.data.maHang == idCanTim) {
                    node = current;
                    return node;
                }
                current = current.next;
            }

        }
        return null;
    }

    //Hàm thêm sau mã hàng hóa
    void themSauMa() {
        KhoHang khoHang = new KhoHang();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma hang hoa can them sau: ");
        int iD = scanner.nextInt();
        Node preNode = search(iD);
        Node current = head;

        if(preNode == null){
            System.out.println("Ma hang hoa can them khong co trong danh sach!");
            return;
        }
        while (current != null) {
            current = current.next;
            if (current == preNode) {
                Node newNode = new Node(khoHang);
                newNode.data.nhap();
                current = current.next;
                preNode.next = newNode;
                newNode.next = current;
                return;
            }
        }         
    }

    // Hàm thêm trước id hàng hóa
    void themTruocMa() {
        KhoHang khoHang = new KhoHang();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma hang hoa can them truoc: ");
        int iD = scanner.nextInt();
        Node preNode = search(iD);
        Node current = this.head;

        if(preNode == null){
            System.out.println("Ma hang hoa can them khong co trong danh sach!");
            return;
        }
        if (head.data.maHang == iD) {
            themDau();
        }
        while (current != null) {          
            if (current.next == preNode) {
                Node newNode = new Node(khoHang);
                newNode.data.nhap();
                current.next = newNode;
                newNode.next = preNode;
                return;
            }
            current = current.next;            
        }
    }

    // Hàm thêm vào vị trí
    void themViTri() {
        Scanner scanner = new Scanner(System.in);
        KhoHang khoHang = new KhoHang();

        System.out.print("Nhap vi tri can them: ");
        int k = scanner.nextInt();
        if (isEmpty() == true || k <= 1) {
            themDau();
        } else if (k>=n) {
            themCuoi();
        } else {
            Node preNode = new Node();
            Node q = new Node();
            Node current = head;
            Node newNode = new Node(khoHang);
            newNode.data.nhap();
            int dem = 0;
            while (current != null) {
                dem++;
                preNode = current;
                if (dem == k+1) {
                    break;
                }
                current=current.next;
            }
            q = head;
            while (q.next != preNode) { 
                q = q.next;
            }
            q.next = newNode;
            newNode.next = current;
        }
    }

    // Hàm xoá đầu
    void xoaDau() { 
        if(isEmpty() == true){
            System.out.println("Danh sach rong.");
            return;
        }
        // Giá trị của Node được Node head trỏ đến sẽ được gán vào Node head.
        head = head.next;
    }

    // Hàm xoá cuối
    void xoaCuoi(){
        if (isEmpty()) {
            System.out.println("Danh sach rong.");
        }
        Node current = head;
        while (current !=null) {
            // Nếu Node current trỏ đến Node tail thì Node current sẽ gán vào Node tail và Node tail sẽ trỏ đến Node rỗng.
           if (current.next == tail) {
               tail = current;
               tail.next = null;
           } 
           current = current.next;
        }
    }

    // Hàm xóa theo mã hàng hóa
    void xoaTheoMa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma hang hoa can xoa: ");
        int iD = scanner.nextInt();

        Node preNode = search(iD);

        if(preNode == null){
            System.out.println("Ma hang hoa can xoa khong co trong danh sach!");
            return;
        }
        if (head == preNode) { 
            xoaDau();
        } else if (tail == preNode) { 
            xoaCuoi();
        }else{
            Node current;

            current = head;
            while (current.next != null) {
                if (current.next == preNode) {
                    current.next = current.next.next;           
                }
                current = current.next;
            }
        }
    }

    // Hàm sửa thông tin theo id hàng hóa
    void sua() {
        KhoHang khoHang = new KhoHang();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma hang hoa can sua thong tin: ");
        int iD = scanner.nextInt();

        Node preNode = search(iD);
        Node current = head; 

        if(preNode == null){
            System.out.println("Ma hang hoa can sua thong tin khong co trong danh sach!");
            return;
        }
        while (current != null) {
            if (current.next == preNode) {
                Node newNode = new Node(khoHang);
                current.next = newNode;                
                newNode.data.nhap();
                newNode.next = preNode.next;
            }
            current = current.next;
        }

    }

    // Hàm tìm theo loại hàng hóa
    void timTheoLoai(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap loai hang hoa can tim: ");
        String loaiCanTim = scanner.nextLine();
        Node current = head;

        while(current != null){
            if(current.data.loai.equals(loaiCanTim)){
                current.data.inThongTin();               
            }            
            current = current.next;
        }
    }

    // Hàm tìm theo giá nhập khẩu
    void timTheoGia(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap gia hang hoa can tim: ");
        double giaCanTim = scanner.nextDouble();
        Node current = head;

        while(current != null){
            if(current.data.giaNhap == giaCanTim){
                current.data.inThongTin();                
            }
            current = current.next;
        }
    }

    // Hàm tìm theo giá nhập khẩu từ giá...đến giá...
    void timTheoGiaKhoang(){
        Scanner scanner = new Scanner(System.in);       
        System.out.println("Nhap gia hang hoa can tim");
        System.out.print("Gia tu: ");
        double giaNho = scanner.nextDouble();
        System.out.print("Den gia: ");
        double giaLon = scanner.nextDouble();

        Node current = head;

        while(current != null){
            if(giaNho <= current.data.giaNhap && current.data.giaNhap <= giaLon){                
                current.data.inThongTin();
            }
            current = current.next;
        }        
    }

    // Sắp xếp tăng dần theo giá kiểu BubbleSort
    void bubbleSortTheoGiaTangDan() {
        Node current = head;
        Node index = null;
        String nho1, nho3;
        int nho2, nho5;
        double nho4;
        Date nho6;
        if (head == null) {
            System.out.println("Danh sach rong.");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.giaNhap > index.data.giaNhap) {
                        // Sắp xếp loại hàng hóa
                        nho1 = current.data.loai;
                        current.data.loai = index.data.loai;
                        index.data.loai = nho1;
                        // Sắp xếp id hàng hóa
                        nho2 = current.data.maHang;
                        current.data.maHang = index.data.maHang;
                        index.data.maHang = nho2;
                        // Sắp xếp tên hàng hóa
                        nho3 = current.data.tenHangHoa;
                        current.data.tenHangHoa = index.data.tenHangHoa;
                        index.data.tenHangHoa = nho3;
                        // Sắp xếp giá nhập 
                        nho4 = index.data.giaNhap;
                        index.data.giaNhap = current.data.giaNhap;
                        current.data.giaNhap = nho4;
                        // Sắp xếp số lượng tồn kho
                        nho5 = current.data.soLuongTonKho;
                        current.data.soLuongTonKho = index.data.soLuongTonKho;
                        index.data.soLuongTonKho = nho5;
                        // Sắp xếp ngày nhập kho
                        nho6 = current.data.ngayNhapKho;
                        current.data.ngayNhapKho = index.data.ngayNhapKho;
                        index.data.ngayNhapKho = nho6;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    // Sắp xếp giảm dần theo giá kiểu BubbleSort
    void bubbleSortTheoGiaGiamDan() {
        Node current = head;
        Node index = null;
        String nho1, nho3;
        int nho2, nho5;
        double nho4;
        Date nho6;
        if (head == null) {
            System.out.println("Danh sach rong.");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.giaNhap < index.data.giaNhap) {
                        // Sắp xếp loại hàng hóa
                        nho1 = current.data.loai;
                        current.data.loai = index.data.loai;
                        index.data.loai = nho1;
                        // Sắp xếp id hàng hóa
                        nho2 = current.data.maHang;
                        current.data.maHang = index.data.maHang;
                        index.data.maHang = nho2;
                        // Sắp xếp tên hàng hóa
                        nho3 = current.data.tenHangHoa;
                        current.data.tenHangHoa = index.data.tenHangHoa;
                        index.data.tenHangHoa = nho3;
                        // Sắp xếp giá nhập 
                        nho4 = index.data.giaNhap;
                        index.data.giaNhap = current.data.giaNhap;
                        current.data.giaNhap = nho4;
                        // Sắp xếp số lượng tồn kho
                        nho5 = current.data.soLuongTonKho;
                        current.data.soLuongTonKho = index.data.soLuongTonKho;
                        index.data.soLuongTonKho = nho5;
                        // Sắp xếp ngày nhập kho
                        nho6 = current.data.ngayNhapKho;
                        current.data.ngayNhapKho = index.data.ngayNhapKho;
                        index.data.ngayNhapKho = nho6;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    // Hàm sắp xếp tăng dần theo ngày nhập kho kiểu BubbleSort
    void bubbleSortTheoNgayTangDan() {
        Node current = head;
        Node index = null;
        String nho1, nho3;
        int nho2, nho5;
        double nho4;
        Date nho6;
        if (head == null) {
            System.out.println("Danh sach rong.");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.ngayNhapKho.compareTo(index.data.ngayNhapKho)==1 ) {
                        // Sắp xếp loại hàng hóa
                        nho1 = current.data.loai;
                        current.data.loai = index.data.loai;
                        index.data.loai = nho1;
                        // Sắp xếp id hàng hóa
                        nho2 = current.data.maHang;
                        current.data.maHang = index.data.maHang;
                        index.data.maHang = nho2;
                        // Sắp xếp tên hàng hóa
                        nho3 = current.data.tenHangHoa;
                        current.data.tenHangHoa = index.data.tenHangHoa;
                        index.data.tenHangHoa = nho3;
                        // Sắp xếp giá nhập 
                        nho4 = current.data.giaNhap;
                        current.data.giaNhap = index.data.giaNhap;
                        index.data.giaNhap = nho4;
                        // Sắp xếp số lượng tồn kho
                        nho5 = current.data.soLuongTonKho;
                        current.data.soLuongTonKho = index.data.soLuongTonKho;
                        index.data.soLuongTonKho = nho5;
                        // Sắp xếp ngày nhập kho
                        nho6 = current.data.ngayNhapKho;
                        current.data.ngayNhapKho = index.data.ngayNhapKho;
                        index.data.ngayNhapKho = nho6;

                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
    // Hàm sắp xếp giảm theo ngày kiểu BubleSort 
    void bubbleSortTheoNgayGiamDan() {
        Node current = head;
        Node index = null;
        String nho1, nho3;
        int nho2, nho5;
        double nho4;
        Date nho6;
        if (head == null) {
            System.out.println("Danh sach rong.");
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.ngayNhapKho.compareTo(index.data.ngayNhapKho)==-1) {
                        // Sắp xếp loại hàng hóa
                        nho1 = current.data.loai;
                        current.data.loai = index.data.loai;
                        index.data.loai = nho1;
                        // Sắp xếp id hàng hóa
                        nho2 = current.data.maHang;
                        current.data.maHang = index.data.maHang;
                        index.data.maHang = nho2;
                        // Sắp xếp tên hàng hóa
                        nho3 = current.data.tenHangHoa;
                        current.data.tenHangHoa = index.data.tenHangHoa;
                        index.data.tenHangHoa = nho3;
                        // Sắp xếp giá nhập
                        nho4 = index.data.giaNhap;
                        index.data.giaNhap = current.data.giaNhap;
                        current.data.giaNhap = nho4;
                        // Sắp xếp số lượng tồn kho
                        nho5 = current.data.soLuongTonKho;
                        current.data.soLuongTonKho = index.data.soLuongTonKho;
                        index.data.soLuongTonKho = nho5;
                        // Sắp xếp ngày nhap kho
                        nho6 = current.data.ngayNhapKho;
                        current.data.ngayNhapKho = index.data.ngayNhapKho;
                        index.data.ngayNhapKho = nho6;

                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    //Hàm thống kê
    void thongKe(){
        Node current = head;
        int tong1 = 0;
        double tong2 = 0;
        int tong3 = 0, tong4 = 0, tong5 = 0;
        String loai1 = "Thoi trang";
        String loai2 = "Phuong tien";
        String loai3 = "Do gia dung";

        if (head == null) {
            System.out.println("Danh sach rong.");
        } else {
            while (current != null) {
                tong1 += current.data.soLuongTonKho; 
                tong2 += current.data.giaNhap;
                if (current.data.loai==loai1) {
                    tong3 += current.data.soLuongTonKho;
                }
                if (current.data.loai==loai2) {
                    tong4 += current.data.soLuongTonKho;
                }
                if (current.data.loai==loai3) {
                    tong5 += current.data.soLuongTonKho;
                }
                current = current.next;                    
            }
        }
        System.out.println("---------- THONG KE ----------");
        System.out.println("Tong so luong hang hoa: " + tong1);
        System.out.println("Tong gia tri hang hoa nhap kho: " + tong2); 
        System.out.println("Tong so luong thoi trang: " + tong3);
        System.out.println("Tong so luong phuong tien: " + tong4);
        System.out.println("Tong so luong do gia dung: " + tong5);           
    }


    void print(){
        Node current;
        current = head;
        if (head==null) {
            System.out.println("Danh sach rong.");
            return;
        }

        System.out.println("---------- DANH SACH HANG HOA ----------");
        while(current!=null){
            current.data.inThongTin();
            current = current.next;
        }
    } 

    // Menu chương trình
    void menu(){
        Scanner scanner = new Scanner(System.in);
            int luaChon = 0;
            int key = 0;
            // int n = 30;
            do{
                System.out.println(" _______  _______  _______  ___      _______ ");
                System.out.println("|       ||       ||       ||   |    |       |");
                System.out.println("|_     _||   _   ||   _   ||   |    |  _____|");
                System.out.println("  |   |  |  | |  ||  | |  ||   |    | |_____ ");
                System.out.println("  |   |  |  |_|  ||  |_|  ||   |___ |_____  |");
                System.out.println("  |   |  |       ||       ||       | _____| |");
                System.out.println("  |___|  |_______||_______||_______||_______|");
                System.out.println("+------------------------------------------+");
                System.out.println("|   >> 1: Them hang hoa.                   |");
                System.out.println("|   >> 2: Xoa hang hoa.                    |");
                System.out.println("|   >> 3: Sua thong tin hang hoa.          |");
                System.out.println("|   >> 4: Tim kiem hang hoa.               |");
                System.out.println("|   >> 5: Sap xep hang hoa.                |");
                System.out.println("|   >> 6: Thong ke hang hoa.               |");
                System.out.println("|   >> 7: In danh sach hang hoa.           |");
                System.out.println("|   >> 0: Thoat.                           |");
                System.out.println("+------------------------------------------+");

                System.out.print("Nhap vao su lua chon: ");
                luaChon = scanner.nextInt();

                switch (luaChon) {
                    case 1:
                        do {
                            System.out.println("                   _______  __   __  _______  __   __                   ");
                            System.out.println("                  |       ||  | |  ||       ||  |_|  |                  ");
                            System.out.println("                  |_     _||  |_|  ||    ___||       |                  ");
                            System.out.println("                    |   |  |       ||   |___ |       |                  ");
                            System.out.println("                    |   |  |       ||    ___||       |                  ");
                            System.out.println("                    |   |  |   _   ||   |___ | ||_|| |                  ");
                            System.out.println("                    |___|  |__| |__||_______||_|   |_|                  ");
                            System.out.println("+-----------------------------------------------------------------------+");
                            System.out.println("|   >> 1: Them hang hoa vao dau danh sach.                              |");
                            System.out.println("|   >> 2: Them hang hoa vao cuoi danh sach.                             |");
                            System.out.println("|   >> 3: Them hang hoa vao truoc ma hang hoa co trong danh sach.       |");
                            System.out.println("|   >> 4: Them hang hoa vao sau ma hang hoa co trong danh sach.         |");
                            System.out.println("|   >> 5: Them hang hoa vao vi tri bat ky.                              |");
                            System.out.println("|   >> 6: In danh sach hang hoa sau khi them.                           |");
                            System.out.println("|   >> 0: Thoat.                                                        |");
                            System.out.println("+-----------------------------------------------------------------------+");

                            System.out.print("Nhap vao su lua chon: ");
                            key = scanner.nextInt();

                            switch (key) {
                                case 1:
                                    themDau();
                                    n++;                            
                                    break;  

                                case 2:
                                    themCuoi();
                                    n++;   
                                    break;

                                case 3:
                                    themTruocMa();
                                    n++;   
                                    break;

                                case 4:
                                    themSauMa(); 
                                    n++;   
                                    break;
                                case 5:
                                    themViTri();
                                    n++;
                                    break;
                                case 6:
                                    print();
                            }

                        } while (key != 0);

                        break;
                    case 2:
                        do {
                            System.out.println("            __   __  _______  _______            ");
                            System.out.println("           |  |_|  ||       ||   _   |           ");
                            System.out.println("           |       ||   _   ||  |_|  |           ");
                            System.out.println("           |       ||  | |  ||       |           ");
                            System.out.println("            |     | |  |_|  ||       |           ");
                            System.out.println("           |   _   ||       ||   _   |           ");
                            System.out.println("           |__| |__||_______||__| |__|           ");
                            System.out.println("+-----------------------------------------------+");
                            System.out.println("|   >> 1: Xoa hang hoa dau danh sach.           |");
                            System.out.println("|   >> 2: Xoa hang hoa cuoi danh sach.          |");
                            System.out.println("|   >> 3: Xoa hang hoa theo ma.                 |");
                            System.out.println("|   >> 4: In danh sach hang hoa sau khi xoa.    |");
                            System.out.println("|   >> 0: Thoat.                                |");
                            System.out.println("+-----------------------------------------------+");

                            System.out.print("Nhap vao su lua chon: ");
                            key = scanner.nextInt();
                            switch (key) {
                                case 1:
                                    xoaDau();
                                    n--;   
                                    break;
                                case 2:
                                    xoaCuoi();
                                    n--;
                                    break;
                                case 3:
                                    xoaTheoMa();
                                    n--;
                                    break;
                                case 4:
                                    print();                   
                            }

                        } while (key != 0);

                        break;
                    case 3:
                            sua();
                            print();
                            break;

                    case 4:
                        do {
                            System.out.println("                _______  ___   __   __                ");
                            System.out.println("               |       ||   | |  |_|  |               ");
                            System.out.println("               |_     _||   | |       |               ");
                            System.out.println("                 |   |  |   | |       |               ");
                            System.out.println("                 |   |  |   | |       |               ");
                            System.out.println("                 |   |  |   | | ||_|| |               ");
                            System.out.println("                 |___|  |___| |_|   |_|               ");
                            System.out.println("+----------------------------------------------------+");
                            System.out.println("+   >> 1: Tim kiem hang hoa theo loai.               +");
                            System.out.println("+   >> 2: Tim kiem hang hoa theo gia nhat dinh.      +");
                            System.out.println("+   >> 3: Tim kiem hang hoa trong khoang gia.        +");
                            System.out.println("+   >> 0: Thoat.                                     +");
                            System.out.println("+----------------------------------------------------+");

                            System.out.print("Nhap vao su lua chon: ");
                            key = scanner.nextInt();

                            switch (key) {
                                case 1:
                                    timTheoLoai();   
                                    break;

                                case 2:
                                    timTheoGia();
                                    break; 

                                case 3:
                                    timTheoGiaKhoang();
                                    break;                   
                            }

                        } while (key !=0 );
                        break;

                    case 5:
                        do {
                            System.out.println("                   __   __  _______  _______                   ");
                            System.out.println("                  |  |_|  ||       ||       |                  ");
                            System.out.println("                  |       ||    ___||    _  |                  ");
                            System.out.println("                  |       ||   |___ |   |_| |                  ");
                            System.out.println("                   |     | |    ___||    ___|                  ");
                            System.out.println("                  |   _   ||   |___ |   |                      ");
                            System.out.println("                  |__| |__||_______||___|                      ");
                            System.out.println("+-------------------------------------------------------------+");
                            System.out.println("+   >> 1: Sap xep hang hoa theo gia tang dan.                 +");
                            System.out.println("+   >> 2: Sap xep hang hoa theo gia giam dan.                 +");
                            System.out.println("+   >> 3: Sap xep hang hoa theo ngay nhap kho moi nhat.       +");
                            System.out.println("+   >> 4: Sap xep hang hoa theo ngay nhap kho cu nhat.        +");
                            System.out.println("+   >> 0: Thoat.                                              +");
                            System.out.println("+-------------------------------------------------------------+");

                            System.out.print("Nhap vao su lua chon: ");
                            key = scanner.nextInt();

                            switch (key) {
                                case 1:
                                    bubbleSortTheoGiaTangDan();
                                    print();
                                    break;
                                case 2:
                                    bubbleSortTheoGiaGiamDan();
                                    print();
                                    break;
                                case 3:
                                    bubbleSortTheoNgayTangDan();
                                    print();
                                    break;
                                case 4:
                                    bubbleSortTheoNgayGiamDan();
                                    print();
                                    break; 

                            }

                        } while (key != 0);
                        break;

                    case 6:
                        thongKe();               
                        break;

                    case 7:
                        print();
                        break;
                }

            } while(luaChon != 0);

        }
    }