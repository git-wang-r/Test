package com.offcn.Exercise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class demo {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList();
        String s = UUID.randomUUID().toString();
        s = s.replace("-", "");
        System.out.println(s);
        String name = "12";
        int parseInt = Integer.parseInt(name);
        System.out.println(parseInt+1);
        int [] a= new int[12];
        a[1]=1;
        System.out.println(a);
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        ConcurrentHashMap hashMap = new ConcurrentHashMap();
    }
}
