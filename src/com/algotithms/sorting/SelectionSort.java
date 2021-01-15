package com.algotithms.sorting;

import java.util.Arrays;

public class SelectionSort {
    public void selectionSort(int[] array){
        int n = array.length;
        for(int i=0; i<n-1; i++){
            int minIndex1 = i;
            int minIndex2 = i+1;
            for (int j = i+1; j < n-1; j++) {
                if (array[minIndex2] > array[j+1]) {
                    minIndex2 = j+1;
                }
            }
            if(array[minIndex1]>array[minIndex2]){
                int temp = array[minIndex1];
                array[minIndex1] = array[minIndex2];
                array[minIndex2] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{64, 25, 12, 22, 11};
        new SelectionSort().selectionSort(array);
        System.out.println(Arrays.toString(array));
        array = new int[]{1,5,4,6,2,7,3,8,0,9,8};
        new SelectionSort().selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
