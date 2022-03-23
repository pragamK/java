package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the  number of elements: ");
        int num= s.nextInt();
        int[] arr = new int[num];
        int lindex = 0;

        for(int i=0;i<num;i++)
        {
            arr[i]=s.nextInt();
        }

        mergesort(arr,0,num);

        for(int i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergesort(int[] input, int start, int end){
        if(end-start<2){
            return;
        }
        int mid=(start+end)/2;
        mergesort(input, start, mid);
        mergesort(input, mid, end);
        merge(input,start,mid, end);


    }
    public static void merge(int[] input, int start, int mid , int end){
        if(input[mid-1]<=input[mid])
            return;

        int i=start;
        int j=mid;
        int tempin=0;
        int[] temp=new int[end-start];
        while(i<mid && j<end){
            temp[tempin++]=input[i]<=input[j]?input[i++]:input[j++];
        }
        System.arraycopy(input,i,input,start+tempin,mid-i);
        System.arraycopy(temp,0,input,start,tempin);
    }
}
