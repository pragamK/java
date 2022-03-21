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
        for(int gap=num/2;gap>0;gap/=2){
//            int i;
//            int newEle = arr[fsi];
            for(int i=gap;i<num;i++){
                int newEle=arr[i];
                int j=i;
                while(j>=gap && arr[j-gap]>newEle){
                arr[j]=arr[j-gap];
                j-=gap;
                }
                arr[j]=newEle;
            }
//            arr[i]= newEle;
        }
        for (int i = 0 ; i<num;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
