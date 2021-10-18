package LyThuyet;

public class MyLinkedList {
    Node head = null; // Danh sách rỗng
    Node tail = null;

    public MyLinkedList(){}

    void add(int data){
        //Tạo 1 node mới
        Node newNode = new Node(data);
        if(head == null){ //Thêm 1 nút vào ds rỗng
            head = newNode;
            tail = newNode;
        }else{ // Ds không rỗng //Thêm vào đuôi ds
            tail.next = newNode;
            tail = newNode;
        }
    }

    void remove(){

    }

    void print(){
        Node current = head;
        if(head == null){
            System.out.println("Danh sách rỗng!!!");
            return;
        }
        System.out.println("Các nút trong danh sách: ");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    void find(){

    }

    void out(){

    }
}
