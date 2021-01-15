package com.dataStructures.heap;
import java.util.Arrays;

public class Heap {
    int[] heap;

    public Heap(int[] array){
        this.heap = array;
    }
//    for max-heap
    public void heapifyMax(int[] array, int index, int size) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size && array[left] > array[largest])
            largest = left;
        if (right < size && array[right] > array[largest])
            largest = right;

        if (largest != index) {
            int temp = array[index];
            array[index] = array[largest];
            array[largest] = temp;
            heapifyMax(array, largest, size);
        }
    }

    public void heapifyMin(int[] array, int index, int size) {
        int smallest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < size && array[left] < array[smallest])
            smallest = left;
        if (right < size && array[right] < array[smallest])
            smallest = right;

        if (smallest != index) {
            int temp = array[index];
            array[index] = array[smallest];
            array[smallest] = temp;
            heapifyMin(array, smallest, size);
        }
    }

    public void buildMaxHeap(int[] array, int size){
        int lastNonLeafNode = (size/2) - 1;
        for(int i = lastNonLeafNode; i >= 0; i--){
            heapifyMax(array, i, size);
        }
    }

    public void buildMinHeap(int[] array, int size){
        int lastNonLeafNode = (size/2) - 1;
        for(int i = lastNonLeafNode; i >= 0; i--){
            heapifyMin(array, i, size);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        Heap heapObj = new Heap(array);
        int size = heapObj.heap.length;
        heapObj.buildMaxHeap(heapObj.heap, size);
        System.out.println(Arrays.toString(heapObj.heap));
        heapObj.buildMinHeap(heapObj.heap, size);
        System.out.println(Arrays.toString(heapObj.heap));
    }
}
