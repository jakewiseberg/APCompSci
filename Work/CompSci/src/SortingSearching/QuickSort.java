/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingSearching;

/**
 *
 * @author jakew
 */
public class QuickSort {
    public static void main(String[] args) {
        
    }
    
    public static int[] sort(int[] arr) {
        int pivot, wall, curr;
        for (int i=0; i<arr.length-2; i++) {
            pivot = arr[arr.length-1];
            wall = i;
            for (int j=i; j<arr.length-2; j++) {
                curr = j;
                if (curr < pivot)
                    
            }
            swap(arr, wall+1, arr.length-1);
        }
        
        
        return arr;
    }
    
    public static void swap(int[] a, int i1, int i2) {
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
    }
    
    public static String toString(int[] a) {
        String str = "[";
        for (int i : a)
            str += (" " + i);
        str += " ]";
        return str;
    }
}
