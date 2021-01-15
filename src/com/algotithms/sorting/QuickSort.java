package com.algotithms.sorting;

import java.util.Arrays;

public class QuickSort {
    private int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low-1;
        for(int j = low; j<high; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }

    private void sort(int[] array, int low, int high){
        if(low < high) {
            int pi = partition(array, low, high);
            sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int []array1 = new int[]{1,2,6,4,5,8,7,6,8,6,2,9,0};
        QuickSort quickSort = new QuickSort();
        int high = array1.length-1;
        int low = 0;
        quickSort.sort(array1, low, high);
        System.out.println(Arrays.toString(array1));


        array1 = new int[]{1,4,5,7,8,0,3,2,9,6};
        high = array1.length-1;
        low=0;
        quickSort.sort(array1, low, high);
        System.out.println(Arrays.toString(array1));
    }
}
