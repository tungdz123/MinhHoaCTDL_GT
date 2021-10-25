package LyThuyet;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoProgram {
    public static void main(String[] args) {
        Queue<Integer> queue;
        queue = new LinkedList<>();

        queue.add(8);
        queue.add(10);
        queue.add(2);

        System.out.println(queue);
        //lấy ra 1 phần tử - trong queue - lấy đầu
        int phanTuDuocLayRa = queue.remove();
        System.out.println("Phần tử được lấy ra từ Queue " + phanTuDuocLayRa);
        System.out.println("Phần tử còn lại trong Queue " + queue);

        //Thăm 1 phần tử của Queue - xem nhưng không lấy ra
        int phanDuocTham = queue.peek();
        System.out.println("Phần tử vừa được thăm " + phanDuocTham);
        System.out.println("Phần tử còn lại trong Queue " + queue);




        //Dùng LinkedList để cài đặt cấu trúc Stack
        //Cài đặt LinkedList
            //Thêm 1 phàn tử vào cuối
            //Lấy 1 phần tử cuối
            //Xóa 1 phần tử cuối
    }
}
