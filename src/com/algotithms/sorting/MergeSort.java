package com.algotithms.sorting;

import java.util.Arrays;

public class MergeSort {

    public void merge(int[] array, int low, int m, int high){

        int n1 = m - low + 1;
        int n2 = high - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i = 0; i<n1; i++){
            left[i] = array[low+i];
        }

        for(int i=0; i<n2; i++){
            right[i] = array[m+1+i];
        }

        int i = 0, j = 0, k = low;

        while (i<n1 && j<n2){
            if(left[i] <= right[j]){
                array[k] = left[i];
                k++;
                i++;
            }
            else {
                array[k] = right[j];
                k++;
                j++;
            }
        }

        while (i < n1){
            array[k] = left[i];
            i++;
            k++;
        }

        while (j<n2){
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public void sort(int []array, int low, int high){
        int m = (low + high)/2;
        if(low < high) {
            sort(array, low, m);
            sort(array, m + 1, high);
            merge(array, low, m, high);
        }
    }

    public static void main(String[] args) {
        int []array = new int[]{1,4,5,7,9,0,3,2,9,6};
        new MergeSort().sort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
