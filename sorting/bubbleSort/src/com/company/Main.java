package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s= new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int len= s.nextInt();
        int [] arr = new int [len];
        System.out.println("Enter values of array");
        for(int i=0;i<len;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=len-1;i>0;i--)
        {
            for(int j=0;j<i;j++){
                if (arr[j]>arr[j+1]){
//                    if(j!=len-1)
                    swap(arr,j,j+1);}
            }
        }
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static final void swap (int [] a, int i, int j) {
        if(i==j)
            return;
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
