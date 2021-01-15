package com.algotithms.searching;

public class LinearSearch {
    public int linearSearch(int []array, int x){
        int loc = -1;
        for(int i = 0; i < array.length; i++){
            if(x == array[i])
                loc = i;
        }
        return loc;
    }

    public static void main(String[] args) {
        int[] array = {1,4,2,3,6,5,0,9,67,8,7};
        int loc = new LinearSearch().linearSearch(array, 65);
        if(loc < 0) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at location: "+loc);
        }
    }
}
