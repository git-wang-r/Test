package com.offcn.cemar;

import java.util.Arrays;

public class Ping {

    public static void main(String[] args) {
        System.out.println("各种排序的代码");
        System.out.print("没排序前的数据   ");
        int array[] = {34, 18, 54, 5, 4, 69, 99, 98, 54, 56};
        int arrays[]= Arrays.copyOf(array,9);
        System.out.println(array);
        System.out.println(arrays);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <arrays.length; j++) {
                if (array[i] < arrays[j]) {
                    int a = 0;
                    a = array[i];
                    array[i] = arrays[j];
                    arrays[j] = a;
                }
                for (int array1 : arrays) {
                    System.out.println(array1);
                }

            }
        }

    }

}
