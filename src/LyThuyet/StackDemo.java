package LyThuyet;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack;
        stack = new Stack<>();

        stack.push("Hi");
        stack.push("Every");
        stack.push("Hihi");

        System.out.println(stack);
        String poped = stack.pop();
        System.out.println("Phần tử đã lấy " + poped);
        System.out.println("Phần tử còn lại trong stack " + stack);

        //Thăm phần tử đỉnh của stack
        String phanTuDinh = stack.peek();
        System.out.println("Phần tử trên đỉnh stack " + phanTuDinh);
        System.out.println("Phần tử còn lại trong stack " + stack);

    }
}
