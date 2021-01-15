package com.algotithms.sorting;

import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] array){
        int n = array.length;
        for(int i = 1; i<n; ++i){
            if(array[i]<array[i-1]){
                for (int j = i; j > 0; j--){
                    if(array[j] < array[j-1]){
                        int temp = array[j];
                        array[j] = array[j-1];
                        array[j-1] = temp;
                    }
                    else break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,5,4,6,2,7,3,8,0,9,8};
        new InsertionSort().insertionSort(array);
        System.out.println(Arrays.toString(array));
        array = new int[]{12, 11, 13, 5, 6};
        new InsertionSort().insertionSort(array);
        System.out.println(Arrays.toString(array));

    }
}
