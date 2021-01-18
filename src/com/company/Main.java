package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2,3,5};

        System.out.println(binarySearch(arr, 3));
    }

    private static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {

            int middle = (left + right) / 2;

            if(target < arr[middle]) {
                right = middle - 1;
            } else if(target > arr[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }

        }

        return -1;

    }
}
