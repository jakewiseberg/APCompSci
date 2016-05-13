/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingSearching;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = genArray();
        System.out.println("UNSORTED:  " + printArray(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println("SORTED:    " + printArray(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;
        if (low >= high)
            return;

        // pick the pivot
        int pivot = arr[(low + (high - low) / 2)];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) { i++; }
            while (arr[j] > pivot) { j--; }
            if (i <= j) {
                swap(i, j, arr);
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }


    public static void swap(int index1,int index2, int[] a){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static String printArray(int[] a){
        String toReturn = "[ ";
        for(int i : a){
            toReturn += i + " ";
        }
        toReturn += "]";
        return toReturn;
    }

    public static int[] genArray(){
        int[] arr = new int[10];
        int item = 0;
        for(int i=0;i<arr.length;i++){
            item = (int)(Math.random()*100); 
            arr[i] = item;
        }
        return arr;
    }
}
