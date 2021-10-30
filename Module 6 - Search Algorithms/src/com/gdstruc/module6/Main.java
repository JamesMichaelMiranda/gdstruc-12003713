package com.gdstruc.module6;

public class Main {

    public static void main(String[] args) {

        int numbers[] = {12, 45, 75, 66, 35, 67, 46};

        System.out.println(binarySearch(numbers, 66));
    }

    public static int binarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (input[middle] == value) {
                return middle;
            } else if (value < input[middle]) {
                end = middle - 1;
            } else if (value > input[middle]) {
                start = middle + 1;
            }
        }
    }
}
