package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] %2 ==0){
                arr[i]+=1;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 2, 7)));
    }
}