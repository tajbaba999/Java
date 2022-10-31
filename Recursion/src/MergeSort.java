import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        int a[] ={10, 3,6,11,45,3,8,9,1};
        merge(a);
        for (int i = 0; i < a.length; i++) System.out.println(a[i]);


    }
    public static void sort(int s1[], int s2[], int d[]){
        int i = 0;
        int j = 0;
        int k =0;
        while (i < s1.length && i < s2.length){
            if (s1[i] <= s2[j]){
                d[k] = s1[i];
                i++;
                k++;
            }else {
                d[k] = s2[j];
                k++;
                j++;
            }
        }
        if(s1[i] <= s2[j]){
            d[k] = s1[i];
            i++;
            k++;
        }else {
            d[k] =s2[j];
            k++;
            j++;
        }

    }

    public static void merge(int a[]){
        if(a.length <= 1){
            return;
        }
        int b[] = new int[a.length/2];
        int c[] = new int[a.length - b.length];

        for (int i = 0; i < a.length/2; i++) {
            b[i] = a[i];
        }

        for (int i = a.length/2; i < a.length; i++) {
            c[i-a.length/2] = a[i];
        }
        merge(b);
        merge(c);
        sort(b, c, a);
    }
}
