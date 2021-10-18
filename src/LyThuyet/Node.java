package LyThuyet;

public class Node {
    //Nội dung
    int data;

    //Liên kết đến nút tiếp theo
    //Tham chiếu
    Node next; //Biến tham chiếu kiểu node

    public Node(){}

    public Node(int d){
        data = d;
        next = null;
    }

    public Node(int d, Node n){
        data = d;
        next = n;
    }
}
