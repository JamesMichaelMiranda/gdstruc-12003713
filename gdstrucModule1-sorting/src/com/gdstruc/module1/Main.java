package com.gdstruc.module1;

public class Main {

    public static void main(String[] args)
    {
        int[] Array = new int[10];
        Array[0] = 123;
        Array[1] = 25;
        Array[2] = 375;
        Array[3] = 47;
        Array[4] = -69;
        Array[5] = 57;
        Array[6] = 93;
        Array[7] = 86;
        Array[8] = 823;
        Array[9] = 378;

        System.out.println("Before Selection sort:");
        printArray(Array);

        selectionSort(Array);

        System.out.println("\nAfter Selection Sort:");
        printArray(Array);
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;
            for (int i = 1; i <= lastSortedIndex;i++)
            {
                if (arr[i] < arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;
        }
    }

    private static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}