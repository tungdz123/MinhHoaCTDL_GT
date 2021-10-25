package com.tungnt2005110014.kiemtragiuaky;

public class Node {
    Apple data;
    Node next;
    
    public Node(){}
    
    public Node(Apple d){
        data = d;
        next = null;
    }
    
    public Node (Apple d, Node n){
        data = d;
        next = n;
    }
}

