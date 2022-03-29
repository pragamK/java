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

        quicksort(arr,0,num);

        for(int i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void quicksort(int[] input, int start, int end){
        if(end-start<2){
            return;
        }
        int pivotIn= partition(input,start,end);
        quicksort(input,start,pivotIn);
        quicksort(input, pivotIn+1,end);

    }
    public static int partition(int[] input, int start, int end){
        int pivot = input[start];
        int i =start;
        int j =end;

        while (i<j){
//            empty loop body
            while(i<j && input[--j]>=pivot);
            if(i<j){
                input[i]=input[j];
            }
//            empty loop body
            while(i<j && input[++i]<=pivot);
            if(i<j){
                input[j]= input[i];
            }
        }
        input[j]=pivot;
        return j;
    }

}
