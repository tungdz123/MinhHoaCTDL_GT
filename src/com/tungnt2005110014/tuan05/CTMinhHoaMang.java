package com.tungnt2005110014.tuan05;

public class CTMinhHoaMang {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9};
        int newElement = 8;

        int n = arr.length;
        int[] newArr = new int[n+1];
        for(int i = 0; i < n; i++){
            newArr[i] = arr[i];
        }
        System.out.println("In mảng cũ: ");
        for(int i : newArr){
            System.out.println(i);
        }
        newArr[n] = newElement;
        System.out.println("In mảng mới: ");
        for(int i : newArr){
            System.out.println(i);
        }
    }
}
