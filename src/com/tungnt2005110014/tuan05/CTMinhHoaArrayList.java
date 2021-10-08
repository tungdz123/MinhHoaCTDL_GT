package com.tungnt2005110014.tuan05;

import java.util.ArrayList;
import java.util.List;


public class CTMinhHoaArrayList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        
        a.add("Cường");
        a.add(true);
        a.add(1);
        a.add(2.5);

        System.out.println(a);
        System.out.println(a.get(0));

        List<String> lisStrings = new ArrayList<>();
        //listStrings.add(1);
        lisStrings.add("Mr. Tèo");

      
    }
}