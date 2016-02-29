/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingSearching;

import java.util.Arrays;

/**
 *
 * @author jakew
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,3,7,5,8,6,9,0};
        sort(arr);
        System.out.println(toString(arr));
    }
    
    public static int[] sort(int[] arr) {
        int pivot, wall, curr;
        for (int i=0; i<arr.length-2; i++) {
            pivot = arr[arr.length-1];
            wall = i+1;
            for (int j=i; j<arr.length-2; j++) {
                curr = j;
                if (arr[curr] < pivot) {
                    swap(arr, curr, wall-1);
                    wall++;
                }
            }
            swap(arr, wall, arr.length-1);
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
