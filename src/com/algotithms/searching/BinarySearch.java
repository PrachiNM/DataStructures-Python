package com.algotithms.searching;

public class BinarySearch {
    public int binarySearch(int[] array, int low, int high, int x){
        int loc = -1;

        if(low < high){
            int m = (low + high) / 2;
            if (x == array[m]) {
                loc = m;
            } else if (x > array[m]) {
                loc = binarySearch(array, m + 1, high, x);
            } else if (x < array[m]) {
                loc = binarySearch(array, low, m - 1, x);
            }
        }

        return  loc;
    }

    public static void main(String[] args) {
        int []array = new int[] {1,2,5,6,7,9,14,17,36,58,78,90};
        int low = 0;
        int high = array.length-1;
        int loc = new BinarySearch().binarySearch(array, low, high, 97);
        if(loc < 0) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at location: " + loc);
        }
    }
}
