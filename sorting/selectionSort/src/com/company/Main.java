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

        for(int i=num-1;i>0;i--)
        {
            int largest = arr[0];
            lindex=0;
            for(int j=1;j<=i;j++)
            {
                if (largest<arr[j]) {
                    largest=arr[j];
                    lindex=j;
                }

            }
            swap(arr,lindex,i);
        }
        for(int i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static final void swap(int [] arr, int largest, int last){
        if(largest==last)
            return;
        int temp =arr[largest];
        arr[largest]=arr[last];
        arr[last]=temp;
    }
}
