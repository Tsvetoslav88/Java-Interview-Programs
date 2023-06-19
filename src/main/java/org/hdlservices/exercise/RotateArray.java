package org.hdlservices.exercise;

import java.util.Arrays;

public class RotateArray {
    private static void leftRotate(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int tmp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=tmp;
        }
    }

    private static void rightRotate(int[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            int tmp = arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        leftRotate(arr);
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("-------");
        rightRotate(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
