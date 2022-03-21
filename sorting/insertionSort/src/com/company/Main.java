package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        int [] arr = new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=s.nextInt();
        }
//        firstsortedindex = fsi
        for(int fsi = 1;fsi<num;fsi++){
            int i;
            int newEle = arr[fsi];
            for(i=fsi;i>0 && arr[i-1]>newEle;i--){
                arr[i]=arr[i-1];
            }
            arr[i]= newEle;
        }
        for (int i = 0 ; i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
