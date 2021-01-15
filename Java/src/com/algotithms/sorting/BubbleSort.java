package com.algotithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public void bubbleSort(int []array){
        int len = array.length;
        for(int i=0; i < len-1; i++){
            for(int j=0; j< len-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
//        System.out.println("sorted array from bubbleSort: "+ Arrays.toString(array));
    }

    public static void main(String[] args) {
        int []array1 = new int[]{1,2,6,4,5,8,7,6,8,6,2,9,0};
        int []array2 = new int[]{1,4,5,7,8,6,3,2,9,0};
        BubbleSort bSort = new BubbleSort();
        bSort.bubbleSort(array1);
        bSort.bubbleSort(array2);
        System.out.println("sorted array from main array1: "+ Arrays.toString(array1));
        System.out.println("sorted array from main array2: "+ Arrays.toString(array2));
    }
}
